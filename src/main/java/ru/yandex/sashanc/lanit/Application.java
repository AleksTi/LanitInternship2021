package ru.yandex.sashanc.lanit;


import org.apache.log4j.Logger;
import ru.yandex.sashanc.lanit.animals.Kotik;

public class Application {
    private static final Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        Kotik kotik1 = new Kotik();
        kotik1.setKotik(7, "Murzik", 3, "Meow");
        kotik1.liveAnotherDay();

        Kotik kotik2 = new Kotik(8, "Vaska", 4, "Meow");
        logger.info("имя котика: " + kotik2.getName() + ", вес котика: " + kotik2.getWeight());
        logger.info("Результат сравнения Meow: " + kotik1.getMeow().equals(kotik2.getMeow()));
        logger.info("Создано котиков: " + Kotik.getCounter());
    }
}
