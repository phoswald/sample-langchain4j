package com.github.phoswald.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class DocumentAnalyzerTest {

    @ParameterizedTest
    @EnumSource(ModelProvider.class)
    void sayHello(ModelProvider modelProvider) {
        DocumentAnalyzer testee = new DocumentAnalyzer(modelProvider);
        String message = testee.sayHello("John Doe");
        assertEquals("Hello, John Doe!", message);
    }
}
