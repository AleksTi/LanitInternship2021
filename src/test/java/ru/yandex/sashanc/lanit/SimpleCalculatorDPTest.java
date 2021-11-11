package ru.yandex.sashanc.lanit;

import org.testng.annotations.DataProvider;

public class SimpleCalculatorDPTest {

    @DataProvider(name = "sumDPData")
    public static Object[][] sumDPData() {
        return new Object[][]{
                {1, 2, 3},
                {4, 5, 9},
                {-7, -5, -12},
                {1.0, 1.5, 2.5},
                {-0.0, 0.0, 0.0},
                {-0.00000001, 0.00000001, 0.0},
                {Double.NaN, 1.0, Double.NaN},
                {Double.POSITIVE_INFINITY, 1.0,  Double.POSITIVE_INFINITY},
                {Double.NEGATIVE_INFINITY, 1.0,  Double.NEGATIVE_INFINITY},
                {Double.NaN, Double.NaN, Double.NaN},
                {Double.NaN, Double.NEGATIVE_INFINITY, Double.NaN},
                {Double.NaN, Double.POSITIVE_INFINITY, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY,  Double.NEGATIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY,  Double.POSITIVE_INFINITY},
                {Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY,  Double.NaN}
        };
    }

    @DataProvider(name = "subtractDPData")
    public static Object[][] subtractDPData() {
        return new Object[][]{
                {3, 2, 1},
                {9, 5, 4},
                {-12, -5, -7},
                {-0.0, 0.0, 0.0},
                {2.5, 1.0, 1.5},
                {0.0, 0.00000001, -0.00000001},
                {Double.NaN, 1.0, Double.NaN},
                {Double.POSITIVE_INFINITY, 1.0,  Double.POSITIVE_INFINITY},
                {Double.NEGATIVE_INFINITY, 1.0,  Double.NEGATIVE_INFINITY},
                {Double.NaN, Double.NaN, Double.NaN},
                {Double.NaN, Double.NEGATIVE_INFINITY, Double.NaN},
                {Double.NaN, Double.POSITIVE_INFINITY, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY,  Double.NaN},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY,  Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY,  Double.NEGATIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY,  Double.POSITIVE_INFINITY}
        };
    }

    @DataProvider(name = "multiplyDPData")
    public static Object[][] multiplyDPData() {
        return new Object[][]{
                {1, 2, 2},
                {4, 5, 20},
                {-7, -5, 35},
                {-0.0, 0.0, 0.0},
                {1.5, 1.0, 1.5},
                {-0.0001, 0.0001, -0.00000001},
                {Double.NaN, 0.0, Double.NaN},
                {Double.NEGATIVE_INFINITY, 0.0, Double.NaN},
                {Double.POSITIVE_INFINITY, 0.0, Double.NaN},
                {Double.NaN, Double.NaN, Double.NaN},
                {Double.NaN, Double.NEGATIVE_INFINITY, Double.NaN},
                {Double.NaN, Double.POSITIVE_INFINITY, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY,  Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY,  Double.POSITIVE_INFINITY},
                {Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY,  Double.NEGATIVE_INFINITY}
        };
    }

    @DataProvider(name = "divideDPData")
    public static Object[][] divideDPData() {
        return new Object[][]{
                {4, 2, 2},
                {45, 5, 9},
                {-8, -2, 4},
                {1.5, 1.0, 1.5},
                {-0.0, 0.0, Double.NaN},
                {1.0, 0.0, Double.POSITIVE_INFINITY},
                {-1.0, 0.0, Double.NEGATIVE_INFINITY},
                {Double.NaN, 0.0, Double.NaN},
                {Double.NaN, 10.0, Double.NaN},
                {Double.NaN, Double.NaN, Double.NaN},
                {Double.NaN, Double.NEGATIVE_INFINITY, Double.NaN},
                {Double.NaN, Double.POSITIVE_INFINITY, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NaN, Double.NaN},
                {Double.POSITIVE_INFINITY, Double.NaN, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY,  Double.NaN},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY,  Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY,  Double.NaN},
                {Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY,  Double.NaN}
        };
    }
}
