package com.halo.util;


/**
 * @author MelloChan
 * @date 2018/5/22
 */
public class VerifyCodeGenerator {
    private VerifyCodeGenerator() {
    }

    public static String getFourVerifyCode() {
        int code = (int) (Math.random() * 9000 + 1000);
        return String.valueOf(code);
    }
}