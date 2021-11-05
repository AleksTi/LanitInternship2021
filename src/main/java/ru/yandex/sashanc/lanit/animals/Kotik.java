package ru.yandex.sashanc.lanit.animals;

import org.apache.log4j.Logger;

import java.util.Random;

public class Kotik {
    private static final Logger logger = Logger.getLogger(Kotik.class);

    private static int counter;
    private final Random random;

    private int fullness;
    private int prettiness;
    private String name;
    private int weight;
    private String meow;

    static {
        counter = 0;
    }

    public Kotik() {
        this.random = new Random();
        counter++;
    }

    public Kotik(int prettiness, String name, int weight, String meow) {
        this();
        setKotik(prettiness, name, weight, meow);
    }

    public void setKotik(int prettiness, String name, int weight, String meow){
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public static int getCounter() {
        return counter;
    }

    public int getFullness() {
        return fullness;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }

    public void liveAnotherDay() {
        int rand;
        boolean isActionDone = false;
        for (int i = 0; i < 24; i++) {
            rand = this.random.nextInt(4) + 1;
            switch (rand) {
                case 1:
                    eat();
                    break;
                case 2:
                    isActionDone = play();
                    break;
                case 3:
                    isActionDone = sleep();
                    break;
                case 4:
                    isActionDone = chaseMouse();
                    break;
                default:
                    logger.info("Выпало " + rand);
            }
            if (!isActionDone) eat();
        }
    }

    public boolean eat(){
        eat(5, "Кошачий корм");
        return true;
    }

    public boolean eat(int foodValue){
        setFullness(foodValue);
        logger.info("Меня покормили " + foodValue);
        return true;
    }

    public boolean eat(int foodValue, String foodName){
        setFullness(foodValue);
        logger.info("Меня покормили: " + foodName + " - сытность " + foodValue);
        return true;
    }

    public boolean play(){
        if (this.fullness <= 0){
            logger.info("Я хочу есть, а не играть");
            return false;
        }
        logger.info("Я играю");
        setFullness(getFullness() - 2);
        return true;
    }

    public boolean sleep(){
        if (this.fullness <= 0){
            logger.info("Я хочу есть, а не спать");
            return false;
        }
        logger.info("Я сплю");
        setFullness(getFullness() - 1);
        return true;
    }

    public boolean chaseMouse(){
        if (this.fullness <= 0){
            logger.info("Я хочу есть, а не ловить мышь");
            return false;
        }
        logger.info("Я лювлю мышь");
        setFullness(getFullness() - 3);
        return true;
    }


}
