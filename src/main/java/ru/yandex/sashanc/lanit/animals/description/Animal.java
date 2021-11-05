package ru.yandex.sashanc.lanit.animals.description;

import org.apache.log4j.Logger;
import ru.yandex.sashanc.lanit.aviary.AviaryScale;
import ru.yandex.sashanc.lanit.food.Food;

import java.util.Objects;

public abstract class Animal {
    protected static final Logger logger = Logger.getLogger(Animal.class);

    private int fullness;
    private final String idName;
    private final AviaryScale size;

    protected Animal(String idName, AviaryScale size) {
        this.idName = idName;
        this.size = size;
    }

    public String getIdName() {
        return idName;
    }

    public AviaryScale getSize() {
        return size;
    }

    public int getFullness() {
        return fullness;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public abstract void eat(Food food) throws WrongFoodException;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getIdName().equals(animal.getIdName()) && getSize() == animal.getSize();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdName(), getSize());
    }
}
