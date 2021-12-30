/**
 * Java 1. Lesson 7.
 *
 * @author Mikhail Osetrov
 * @version 28.12.2021 - 30.12.2021
 */

class HomeWorkSeven {
    public static void main(String[] args) {
        Cat[] cats = new Cat[4];
            cats[0] = new Cat("Fedor", 2);
            cats[1] = new Cat("Barsik", 3);
            cats[2] = new Cat("Pushok", 2);
            cats[3] = new Cat("Filya", 5);
        
        Plate plate = new Plate (20);
        System.out.println(plate);
    
        //the cat eats for the first time
        for(Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        
        //adding food to a plate
        plate.add(10);
        System.out.println(plate);

    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    
    Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }
    
    void eat (Plate plate) {
        if (!satiety)
        satiety = plate.decreaseFood(appetite);
    }
    
    void setSatiety (boolean status){
        satiety = status;
    }
    
    @Override
    public String toString() {
        return "Cat: " + name + ", appetite: " + appetite + ", satiety: " + satiety;
    }
}

class Plate {
    private int food;
    
    Plate (int food) {
        this.food = food;
    }
    
    boolean decreaseFood(int portion) {
        if (food < portion) return false;
        this.food -= food;
        return true;
    }
    
    void add(int food) {
        this.food += food;
    }
    
    @Override
    public String toString() {
        return "Food: " + food;
    }
}