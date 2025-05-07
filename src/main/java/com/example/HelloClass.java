package com.example;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;

public class HelloClass {

    @NonNull
    private String notNullProperty;

    @Nullable
    private String nullableProperty;

    private String plainProperty;

    public HelloClass(@NonNull String notNullProperty, @Nullable String nullableProperty, String plainProperty) {
        this.notNullProperty = notNullProperty;
        this.nullableProperty = nullableProperty;
        this.plainProperty = plainProperty;
    }

    @NonNull
    public String getNotNullProperty() {
        return notNullProperty;
    }

    public void setNotNullProperty(@NonNull String notNullProperty) {
        this.notNullProperty = notNullProperty;
    }

    @Nullable
    public String getNullableProperty() {
        return nullableProperty;
    }

    public void setNullableProperty(@Nullable String nullableProperty) {
        this.nullableProperty = nullableProperty;
    }

    public String getPlainProperty() {
        return plainProperty;
    }

    public void setPlainProperty(String plainProperty) {
        this.plainProperty = plainProperty;
    }
}