/**
 * Java 1. Lesson 6.
 *
 * @author Mikhail Osetrov
 * @version 24.12.2021 - 26.12.2021
 */

class HomeWorkSix {
    public static void main(String[] args) {
        IAnimal cat = new Cat(200, 10);
        IAnimal dog = new Dog (500, 10);
        IAnimal[] animals = {cat, dog};
        for (IAnimal a : animals) {
            System.out.println(a.getClass().getName() + ": " + "run - " + a.run(200) + ", " + "swim - " + a.swim(10));
        }
    }
}

class Cat extends Animal {   // "Cat can`t swim."
    Cat(int run_limit, int swim_limit) {
        super(run_limit, swim_limit);
    }
        @Override
    public boolean swim(int dist) {
        return false;
    }
}

class Dog extends Animal {
    Dog(int run_limit, int swim_limit) {
        super(run_limit, swim_limit);
    }
}

interface IAnimal {
    boolean run(int dist);
    boolean swim(int dist);
}

abstract class Animal implements IAnimal{
    protected int run_limit;
    protected int swim_limit;
    
    Animal(int run_limit, int swim_limit) {
        this.run_limit = run_limit;
        this.swim_limit = swim_limit;
    }
    public boolean run (int dist) {
        return dist <= run_limit;
    }
    public boolean swim (int dist) {
        return dist <= swim_limit;
    }
}