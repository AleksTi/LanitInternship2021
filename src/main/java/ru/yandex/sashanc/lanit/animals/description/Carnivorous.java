package ru.yandex.sashanc.lanit.animals.description;

import org.apache.log4j.Logger;
import ru.yandex.sashanc.lanit.aviary.AviaryScale;
import ru.yandex.sashanc.lanit.food.Food;
import ru.yandex.sashanc.lanit.food.Grass;

public abstract class Carnivorous extends Animal {
    protected static final Logger logger = Logger.getLogger(Carnivorous.class);

    protected Carnivorous(String idName, AviaryScale size) {
        super(idName, size);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if(food instanceof Grass){
            logger.info("I don't eat Grass");
            throw new WrongFoodException("I don't eat Grass");
        }
        setFullness(food.getFoodValue());
        logger.info("I have eaten Meat");
    }
}
