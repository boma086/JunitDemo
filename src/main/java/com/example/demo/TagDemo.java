package com.example.demo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@Tag("fast")
@Tag("model")
public class TagDemo {
    @Test
    @Tag("taxes")
    void testingTaxCalculation() {
    }
}