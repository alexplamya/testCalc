package org.exemple;

import org.example.Calc;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void BeforeAll() {
        System.out.println("before all");
    }

    @BeforeEach
    public void setUpEach() {
        System.out.println("before each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("after all");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after each");
    }

    @Test
    @DisplayName("Проверка суммирования 1")
    @Timeout(10)
    @Tag("sum")
    void sum1() {
        Calc calc = new Calc();
        int result = calc.sum(1, 6);
        Assertions.assertEquals(7, result, "Ответ не верен");
    }

    @Test
    @DisplayName("Проверка вычитания 1")
    @Timeout(10)
    @Tag("subtraction")
    void subtraction1() {
        Calc calc = new Calc();
        int result2 = calc.subtract(5, 1);
        Assertions.assertEquals(4, result2, "Ответ не верен");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @DisplayName("Проверка суммирования 3")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    void sum3(int a, int b, int expectedresult) {
        Calc calc = new Calc();
        int result = calc.sum(a, b);
        Assertions.assertEquals(expectedresult, result, "Ответ не верен");
    }

    @ParameterizedTest(name = "#{index} - разница {5} и {3}, ожидаем {2}")
    @DisplayName("Проверка вычитания 4")
    @CsvSource({"5, 3, 2", "5, 2, 3", "0, 0, 0"})
    void subtraction2(int a, int b, int expectedsubtract) {
        Calc calc = new Calc();
        int result2 = calc.subtract(a, b);
        Assertions.assertEquals(expectedsubtract, result2, "Ответ не верен");
    }
}