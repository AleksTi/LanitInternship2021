package ru.yandex.sashanc.lanit;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.*;

import java.lang.annotation.Target;

public class SimpleCalculatorTest {
    private static final Logger logger = Logger.getLogger(SimpleCalculatorTest.class);
    private SimpleCalculator calculator;

    @DataProvider
    public Object[][] sumDPData() {
        return new Object[][]{
                {1, 2, 3},
                {4, 5, 9},
                {-7, -5, -12},
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

    @DataProvider
    public Object[][] subtractDPData() {
        return new Object[][]{
                {3, 2, 1},
                {9, 5, 4},
                {-12, -5, -7},
                {-0.0, 0.0, 0.0},
                {0.0, 0.00000001, -0.00000001}
        };
    }

    @DataProvider
    public Object[][] multiplyDPData() {
        return new Object[][]{
                {1, 2, 2},
                {4, 5, 20},
                {-7, -5, 35},
                {-0.0, 0.0, 0.0},
                {-0.0001, 0.0001, -0.00000001},
                {Double.NaN, 0.0, Double.NaN},
                {Double.NaN, Double.NaN, Double.NaN},
                {Double.NaN, Double.NEGATIVE_INFINITY, Double.NaN},
                {Double.NaN, Double.POSITIVE_INFINITY, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY,  Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY,  Double.POSITIVE_INFINITY},
                {Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY,  Double.NEGATIVE_INFINITY}
        };
    }

    @DataProvider
    public Object[][] divideDPData() {
        return new Object[][]{
                {4, 2, 2},
                {45, 5, 9},
                {-8, -2, 4},
                {-0.0, 0.0, Double.NaN},
                {1.0, 0.0, Double.POSITIVE_INFINITY},
                {-1.0, 0.0, Double.NEGATIVE_INFINITY},
        };
    }

    @BeforeClass
    public void beforeClass() {
        logger.info("SimpleCalculatorTest.beforeClass()");
    }

    @BeforeTest
    void beforeTest() {
        logger.info("SimpleCalculatorTest.beforeTest()");
        calculator = new SimpleCalculator();
    }

    @BeforeMethod
    void setUp() {
        logger.info("SimpleCalculatorTest.beforeMethod()");
    }

    @AfterMethod
    public void tearDown() {
        logger.info("SimpleCalculatorTest.tearDown()");
    }

    @AfterClass
    public void afterClass() {
        logger.info("SimpleCalculatorTest.afterClass()");
    }

    @Test
    public void sumPositiveTest() {
        logger.info("SimpleCalculatorTest.sumPositiveTest()");
        Assert.assertEquals(calculator.sum(2.0, 3.0), 5.0, "Ok test is failed");
        Assert.assertTrue(calculator.sum(5.0, 6.0) == 11, "Ok test is failed");
    }

    @Test
    public void sumNegativeTest() {
        logger.info("SimpleCalculatorTest.sumNegativeTest()");
        Assert.assertNotEquals(calculator.sum(2.0, 3.0), 6.0, "Nok test is failed");
        Assert.assertFalse(calculator.sum(5.0, 6.0) == 10, "Nok test is failed");
    }

    //Тест для проверки граничных значений
    @Test
    public void sumEdgeTest() {
        logger.info("SimpleCalculatorTest.sumEdgeTest()");
        Assert.assertEquals(calculator.sum(-1.0, 1.0), 0.0, "Edge test is failed");
    }

    @Test(dataProvider = "sumDPData")
    public void sumDPTest(double num1, double num2, double sum) {
        logger.info("SimpleCalculatorTest.sumEdgeTest()");
        Assert.assertEquals(calculator.sum(num1, num2), sum, "Edge test is failed");
    }

    @Test(dataProvider = "subtractDPData")
    public void subtractDPTest(double num1, double num2, double sub) {
        logger.info("SimpleCalculatorTest.subtractDPTest()");
        Assert.assertEquals(calculator.subtract(num1, num2), sub, "Edge test is failed");
    }

    @Test(dataProvider = "multiplyDPData")
    public void multiplyDPTest(double num1, double num2, double mult) {
        logger.info("SimpleCalculatorTest.multiplyDPTest()");
        Assert.assertEquals(calculator.multiply(num1, num2), mult, "Multiply test is failed");
    }

    @Test(dataProvider = "divideDPData")
    public void divideDPTest(double num1, double num2, double div) {
        logger.info("SimpleCalculatorTest.divideDPTest()");
        Assert.assertEquals(calculator.divide(num1, num2), div, "Edge test is failed");
    }
}
