package Abstraction;

public class Farm {
    public static void main(String[] args) {
        Animal donald = new Duck();
        donald.makeSound();

        Duck duck = new Duck();
        duck.makeSound();

        Pig xryu = new Pig();
        xryu.makeSound();
    }
}
