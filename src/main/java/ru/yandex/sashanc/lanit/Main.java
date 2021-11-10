package ru.yandex.sashanc.lanit;

import org.apache.commons.lang3.math.NumberUtils;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        Scanner scanner = new Scanner(System.in);
        String inputResult;
        double d1 = 0.0;
        double d2;
        boolean flagFirstNumber = true;
        while (scanner.hasNext()) {
            inputResult = scanner.next();
            if (NumberUtils.isParsable(inputResult)) {
                if (flagFirstNumber) {
                    d1 = NumberUtils.toDouble(inputResult);
                    logger.info("Первое число: " + d1);
                    flagFirstNumber = false;
                } else {
                    d2 = NumberUtils.toDouble(inputResult);
                    flagFirstNumber = true;
                    logger.info("Второе число: " + d2);
                    logger.info("Сумма " + d1 + " + " + d2 + " = " + calculator.sum(d1, d2));
                    logger.info("Деление " + d1 + " / " + d2 + " = " + calculator.divide(d1, d2));
                    logger.info("Произведение " + d1 + " * " + d2 + " = " + calculator.multiply((int) d1, (int) d2));
                    logger.info("Разность " + d1 + " - " + d2 + " = " + calculator.subtract((int) d1, (int) d2));
                }
            } else {
                if(inputResult.equals("exit")){
                    return;
                }
                logger.info("Введите число");
            }
        }
        scanner.close();
    }
}
