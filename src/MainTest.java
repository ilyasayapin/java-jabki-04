import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void hello() {
        String name = "Котик";
        Assertions.assertEquals("Hello " + name, Main.hello(name));
    }

    @Test
    void multiply() {
        int a = 2, b = 3;
        Assertions.assertEquals(a * b, Main.multiply(a, b));
    }

    /**
     * Lesson 4. Homework
     */

    @Test
    void sumRange() {
        int a = 7;
        int b = 9;
        Assertions.assertEquals(24, Main.sumRange(a, b));
    }

    @Test
    void addFirst() {
        int a = 1;
        int b = 9;
        Assertions.assertEquals(10, Main.add(a, b));
    }

    @Test
    void addSecond() {
        String a = "Добрый ";
        String b = "день!";
        Assertions.assertEquals("Добрый день!", Main.add(a, b));
    }

    @Test
    void findMax() {
        int [] a = {-1, 2, 3, 10, -8, 0};
        Assertions.assertEquals(10, Main.findMax(a));

    }

    @Test
    void calculateFactorial() {
        int a = 3;
        Assertions.assertEquals(6, Main.calculateFactorial(a));
    }

    @Test
    void calculateAreaFirst() {
        int a = 3;
        Assertions.assertEquals(28, Main.calculateArea(a));
    }

    @Test
    void testCalculateAreaSecond() {
        int a = 3;
        int b = 3;
        Assertions.assertEquals(9, Main.calculateArea(a, b));
    }

    @Test
    void calculateAverage() {
        int a = 3;
        int b = 4;
        int c = 5;
        Assertions.assertEquals(4, Main.calculateAverage(a, b, c));
    }

    @Test
    void calculateHypotenuse() {
        int a = 3;
        int b = 4;
        Assertions.assertEquals(5, Main.calculateHypotenuse(a, b));
    }
}