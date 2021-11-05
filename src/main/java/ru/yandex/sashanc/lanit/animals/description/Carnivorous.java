package ru.yandex.sashanc.lanit.animals.description;

import ru.yandex.sashanc.lanit.food.Food;
import ru.yandex.sashanc.lanit.food.Grass;

public abstract class Carnivorous extends Animal {

    @Override
    public void eat(Food food) {
        if(food instanceof Grass){
            logger.info("I don't eat Grass");
            return;
        }
        setFullness(food.getFoodValue());
        logger.info("I have eaten Meat");
    }
}
