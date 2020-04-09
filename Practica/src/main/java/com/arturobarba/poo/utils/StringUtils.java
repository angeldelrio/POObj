package com.arturobarba.poo.utils;

public class StringUtils {
    public static boolean estaEnBlanco(String string) {
        return string == null || string.trim().isEmpty();
    }

    public static String normalizarEnum(Enum<?> enumerado) {
        if (enumerado == null) {
            return "";
        }

        String normalizada = enumerado.name().trim()
            .toLowerCase()
            .replace("_", " ")
            .replace("-", " ");

        if (estaEnBlanco(normalizada)) {
            return "";
        }

        return normalizada.substring(0, 1).toUpperCase() + normalizada.substring(1);
    }

    public static String normalizeBoolean(boolean bool) {
        return bool ? "Sí" : "No";
    }
}
