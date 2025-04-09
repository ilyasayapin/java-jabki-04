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
    void findMax() {
        int [] a = {-1, 2, 3, 10, -8, 0};
        Assertions.assertEquals(10, Main.findMax(a));

    }

    @org.junit.jupiter.api.Test
    void calculateFactorial() {
        int a = 3;
        Assertions.assertEquals(6, Main.calculateFactorial(a));
    }

    @org.junit.jupiter.api.Test
    void calculateAreaFirst() {
        int a = 3;
        Assertions.assertEquals(28, Main.calculateArea(a));

    }

    @org.junit.jupiter.api.Test
    void testCalculateAreaSecond() {
        int a = 3;
        int b = 3;
        Assertions.assertEquals(9, Main.calculateArea(a, b));
    }

    @org.junit.jupiter.api.Test
    void calculateAverage() {
        int a = 3;
        int b = 4;
        int c = 5;
        Assertions.assertEquals(4, Main.calculateAverage(a, b, c));

    }

    @org.junit.jupiter.api.Test
    void calculateHypotenuse() {
        int a = 3;
        int b = 4;
        Assertions.assertEquals(5, Main.calculateHypotenuse(a, b));
    }
}