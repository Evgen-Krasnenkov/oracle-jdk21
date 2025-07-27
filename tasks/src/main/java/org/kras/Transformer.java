package org.kras;

import java.util.function.UnaryOperator;

public enum Transformer {
    UPPER(String::toUpperCase),
    LOWER(String::toLowerCase);
    private final UnaryOperator<String> operator;

    Transformer(UnaryOperator<String> operator) {
        this.operator = operator;
    }

    public static String transform(String value) {
        return switch (value) {
            case String v when v.toUpperCase().equals(value) -> LOWER.operator.apply(value);
            case String v when v.toLowerCase().equals(value) -> UPPER.operator.apply(value);
            default -> value;
        };
    }
}
