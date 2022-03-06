package Polymorphizm;

public class Market {
    public static void main(String[] args) {
        Banana banana = new Banana();
        banana.eatBanana();
        Orange orange = new Orange();
        Fruit banana2 = new Banana();
        ((Banana) banana2).eatBanana();
        Fruit fruit = new Fruit();
        reap(fruit);
        fruit.makeJuice();
        System.out.println(fruit.getCalories());
        fruit = new Banana();
        reap(fruit);
        fruit.makeJuice();
        System.out.println(fruit.getCalories());
        ((Banana)fruit).eatBanana();
        fruit = new Orange();
        reap(fruit);
        fruit.makeJuice();
        System.out.println(fruit.getCalories());
        ((Orange)fruit).squeezeOrange();

        reap(banana);
        reap(orange);
        reap(banana2);
    }

    public static void reap(Fruit fruit){
        System.out.println("Reaping...   ");
        fruit.makeJuice();
    }
    Banana banana = (Banana) new Fruit();

}
