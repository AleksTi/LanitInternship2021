package ru.yandex.sashanc.lanit.animals.description;

import org.apache.log4j.Logger;
import ru.yandex.sashanc.lanit.aviary.AviaryScale;
import ru.yandex.sashanc.lanit.food.Food;
import ru.yandex.sashanc.lanit.food.Meat;

public abstract class Herbivore extends Animal {
    protected static final Logger logger = Logger.getLogger(Herbivore.class);

    protected Herbivore(String idName, AviaryScale size) {
        super(idName, size);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if(food instanceof Meat){
            logger.info("I don't eat Meat");
            throw new WrongFoodException();
        }
        setFullness(food.getFoodValue());
        logger.info("I have eaten Grass");
    }
}
