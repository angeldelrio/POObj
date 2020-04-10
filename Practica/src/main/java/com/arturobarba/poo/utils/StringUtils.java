package com.arturobarba.poo.utils;

public class StringUtils {
    public static final String NO_APLICA = "N/A";
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

    public static String normalizarBoolean(boolean bool) {
        return bool ? "Sí" : "No";
    }

    public static String repetirString(String string, int veces) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < veces; i++) {
            builder.append(string);
        }

        return builder.toString();
    }

    public static String normalizarInteger(Integer integer) {
        if (integer == null) {
            return "";
        }

        return String.valueOf(integer);
    }

    public static String normalizarFloat(Float valor) {
        if (valor == null) {
            return "";
        }

        return String.format("%.2f", valor);
    }

    public static String normalizarString(String string) {
        if (string == null) {
            return "";
        }

        return string.trim();
    }
}
