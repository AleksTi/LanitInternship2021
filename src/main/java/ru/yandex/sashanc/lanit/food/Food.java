package ru.yandex.sashanc.lanit.food;

public abstract class Food {
    private int foodValue;

    public Food(int foodValue) {
        this.foodValue = foodValue;
    }

    public int getFoodValue() {
        return foodValue;
    }
}
