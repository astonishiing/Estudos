package javacore.introducao.dominio.Annotation;

import java.util.function.Function;

public enum FielFormatEnum {
    CAMEL_CASE(field -> field);
    

    private final Function<String, String> format;

    FielFormatEnum(final Function<String, String> format) {
        this.format = format;
    }

    public Function<String, String> getFormat() {
        return format;
    }
}
