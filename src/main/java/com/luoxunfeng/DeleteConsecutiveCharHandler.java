package com.luoxunfeng;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 删除连续字符
 *
 * @author luoxunfeng
 */
public class DeleteConsecutiveCharHandler implements ConsecutiveCharHandler {

    @Override
    public String handle(String inputStr, int consecutiveLength) {
        String[] splitStrArr = splitConsecutiveChar(inputStr);
        if (Arrays.stream(splitStrArr).noneMatch(it -> it.length() >= consecutiveLength)) {
            return inputStr;
        }
        String newStr =
            Arrays.stream(splitStrArr).filter(it -> it.length() < consecutiveLength).collect(Collectors.joining());
        // 递归处理
        return handle(newStr, consecutiveLength);
    }
}
