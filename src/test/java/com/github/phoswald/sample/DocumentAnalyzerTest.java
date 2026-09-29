package com.github.phoswald.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DocumentAnalyzerTest {

    private final DocumentAnalyzer testee = new DocumentAnalyzer(ModelProvider.ANTHROPIC);

    @Test
    void sayHello() {
        String message = testee.sayHello("John Doe");
        assertEquals("Hello, John Doe!", message);
    }
}
