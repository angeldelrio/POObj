package com.arturobarba.poo.utils;

public class StringUtils {
    public static boolean isBlank(String string) {
        return string == null || string.trim().isEmpty();
    }
}
