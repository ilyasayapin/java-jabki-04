import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void sumRange() {
        int a = 7;
        int b = 9;
        Assertions.assertEquals(24, Main.sumRange(a, b));
    }

    @org.junit.jupiter.api.Test
    void addFirst() {
        int a = 1;
        int b = 9;
        Assertions.assertEquals(10, Main.add(a, b));
    }

    @org.junit.jupiter.api.Test
    void addSecond() {
        String a = "Добрый ";
        String b = "день!";
        Assertions.assertEquals("Добрый день!", Main.add(a, b));
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
    }

    @org.junit.jupiter.api.Test
    void findMax() {
    }

    @org.junit.jupiter.api.Test
    void calculateFactorial() {
    }

    @org.junit.jupiter.api.Test
    void calculateArea() {
    }

    @org.junit.jupiter.api.Test
    void testCalculateArea() {
    }

    @org.junit.jupiter.api.Test
    void calculateAverage() {
    }

    @org.junit.jupiter.api.Test
    void calculateHypotenuse() {
    }
}