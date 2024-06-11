package com.luoxunfeng;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 替换连续字符
 *
 * @author luoxunfeng
 */
public class ReplaceConsecutiveCharHandler implements ConsecutiveCharHandler {

    @Override
    public String handle(String inputStr, int consecutiveLength) {
        String[] splitStrArr = splitConsecutiveChar(inputStr);
        if (Arrays.stream(splitStrArr).noneMatch(it -> it.length() >= consecutiveLength)) {
            return inputStr;
        }
        String newStr = Arrays.stream(splitStrArr).map(it -> {
            // 不是连续的则返回自身
            if (it.length() < consecutiveLength) {
                return it;
            }
            int asciiCode = it.codePointAt(0) - 1;
            // 返回自身的上一个字母, 如果是 a 字母则返回空字符串
            return asciiCode < 97 ? "" : Character.toString(asciiCode);
        }).collect(Collectors.joining());

        return handle(newStr, consecutiveLength);
    }
}
