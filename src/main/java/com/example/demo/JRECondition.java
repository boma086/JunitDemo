package com.example.demo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import static org.junit.jupiter.api.condition.JRE.JAVA_10;
import static org.junit.jupiter.api.condition.JRE.JAVA_8;
import static org.junit.jupiter.api.condition.JRE.JAVA_9;
import static org.junit.jupiter.api.condition.OS.LINUX;
import static org.junit.jupiter.api.condition.OS.MAC;
import static org.junit.jupiter.api.condition.OS.WINDOWS;
public class JRECondition {
    @Test
    @EnabledOnJre(JAVA_8)
    void onlyOnJava8() {
        System.out.println("java 8");
    }
    @Test
    @EnabledOnJre({ JAVA_9, JAVA_10 })
    void onJava9Or10() {
    	System.out.println("java 910");
    }
    @Test
    @DisabledOnJre(JAVA_9)
    void notOnJava9() {
    	System.out.println("java 9");
    	System.out.println(System.getProperty("java.version"));
    }
}