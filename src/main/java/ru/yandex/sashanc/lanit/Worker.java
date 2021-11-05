package ru.yandex.sashanc.lanit;

import org.apache.log4j.Logger;
import ru.yandex.sashanc.lanit.animals.description.Animal;
import ru.yandex.sashanc.lanit.animals.description.IVoice;
import ru.yandex.sashanc.lanit.food.Food;

public class Worker {
    private static final Logger logger = Logger.getLogger(Worker.class);

    public void feed(Animal animal, Food food){
        logger.info("Worker fed " + animal.getClass().getSimpleName() + " with " + food.getClass().getSimpleName());
        animal.eat(food);
    }

    public void getVoice(IVoice animal){
        logger.info("The worker made the animal sound " + animal.getClass().getSimpleName());
        animal.voice();
    }
}
