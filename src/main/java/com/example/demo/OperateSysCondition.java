package com.example.demo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import static org.junit.jupiter.api.condition.OS.LINUX;
import static org.junit.jupiter.api.condition.OS.MAC;
import static org.junit.jupiter.api.condition.OS.WINDOWS;
/** * @author houbinbin * @version 1.0 * @since JDK 1.7 */
public class OperateSysCondition {
    @Test
    @EnabledOnOs(MAC)
    void onlyOnMacOs() {
        // ...
    }
    @TestOnMac
    void testOnMac() {
        System.out.println("mac");
    }
    @Test
    @EnabledOnOs({ LINUX, MAC })
    void onLinuxOrMac() {
        System.out.println("linux mac");
    }
    @Test
    @DisabledOnOs(WINDOWS)
    void notOnWindows() {
        System.out.println("win dis");
    }
    @Test
    @EnabledOnOs(WINDOWS)
    void OnWindows() {
        System.out.println("win en");
    }
}