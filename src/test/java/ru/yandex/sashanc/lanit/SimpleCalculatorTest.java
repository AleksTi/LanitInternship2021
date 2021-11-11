package ru.yandex.sashanc.lanit;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.*;

public class SimpleCalculatorTest {
    private static final Logger logger = Logger.getLogger(SimpleCalculatorTest.class);
    private SimpleCalculator calculator;

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
        Assert.assertEquals(calculator.sum(5.0, 6.0),11, "Ok test is failed");
    }

    @Test
    public void sumNegativeTest() {
        logger.info("SimpleCalculatorTest.sumNegativeTest()");
        Assert.assertNotEquals(calculator.sum(2.0, 3.0), 6.0, "Nok test is failed");
        Assert.assertNotEquals(calculator.sum(5.0, 6.0), 10, 0.0, "Nok test is failed");
    }

    @Test
    public void sumEdgeTest() {
        logger.info("SimpleCalculatorTest.sumEdgeTest()");
        Assert.assertEquals(calculator.sum(-1.0, 1.0), 0.0, "Edge test is failed");
    }

    @Test(dataProviderClass = SimpleCalculatorDPTest.class, dataProvider = "sumDPData")
    public void sumDPTest(double num1, double num2, double sum) {
        logger.info("SimpleCalculatorTest.sumEdgeTest()");
        Assert.assertEquals(calculator.sum(num1, num2), sum, "Edge test is failed");
    }

    @Test(dataProviderClass = SimpleCalculatorDPTest.class, dataProvider = "subtractDPData")
    public void subtractDPTest(double num1, double num2, double sub) {
        logger.info("SimpleCalculatorTest.subtractDPTest()");
        Assert.assertEquals(calculator.subtract(num1, num2), sub, "Edge test is failed");
    }

    @Test(dataProviderClass = SimpleCalculatorDPTest.class, dataProvider = "multiplyDPData")
    public void multiplyDPTest(double num1, double num2, double mult) {
        logger.info("SimpleCalculatorTest.multiplyDPTest()");
        Assert.assertEquals(calculator.multiply(num1, num2), mult, "Multiply test is failed");
    }

    @Test(dataProviderClass = SimpleCalculatorDPTest.class, dataProvider = "divideDPData")
    public void divideDPTest(double num1, double num2, double div) {
        logger.info("SimpleCalculatorTest.divideDPTest()");
        Assert.assertEquals(calculator.divide(num1, num2), div, "Edge test is failed");
    }
}
