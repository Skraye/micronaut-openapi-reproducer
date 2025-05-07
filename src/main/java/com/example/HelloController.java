package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {

    @Get("/")
    public HelloClass hello() {
        return new HelloClass("Not Null Value", "Nullable", "Plain Value");
    }
}