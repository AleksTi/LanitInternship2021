package ru.yandex.sashanc.lanit.animals.description;

import ru.yandex.sashanc.lanit.food.Food;
import ru.yandex.sashanc.lanit.food.Meat;

public abstract class Herbivore extends Animal {

    @Override
    public void eat(Food food) {
        if(food instanceof Meat){
            logger.info("I don't eat Meat");
            return;
        }
        setFullness(food.getFoodValue());
        logger.info("I have eaten Grass");
    }
}
