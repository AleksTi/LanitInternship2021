package ru.yandex.sashanc.lanit.animals.description;

import org.apache.log4j.Logger;
import ru.yandex.sashanc.lanit.food.Food;

public abstract class Animal {
    protected static final Logger logger = Logger.getLogger(Animal.class);

    private int fullness;

    public int getFullness() {
        return fullness;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public abstract void eat(Food food);
}
