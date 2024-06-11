package com.luoxunfeng;

/**
 * 连续字符处理
 *
 * @author luoxunfeng
 */
public interface ConsecutiveCharHandler {

    /**
     * 拆分连续相同的字符串
     *
     * @param inputStr 输入字符串
     * @return 分割的字符串数据
     */
    default String[] splitConsecutiveChar(String inputStr) {
        if (inputStr == null || "".equals(inputStr)) {
            return new String[]{};
        }
        return inputStr.split("(?<=(.))(?!\\1)");
    }

    /**
     * 处理字符串
     *
     * @param inputStr          a-z 的字符串
     * @param consecutiveLength 连续长度
     * @return 最终字符串
     */
    String handle(String inputStr, int consecutiveLength);
}
