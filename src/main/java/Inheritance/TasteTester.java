package Inheritance;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.setPrice(30);
        System.out.println("Cake flavor " + cake.getFlavor());
        System.out.println("Cake price " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(45);
        System.out.println("BirthdayCake price : " + birthdayCake.getPrice());
        System.out.println("BirthdayCake flavor : " + birthdayCake.getFlavor());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("pina colada");
        System.out.println("WeddingCake price: " + weddingCake.getPrice());
        System.out.println("WeddingCake flavor: " + weddingCake.getFlavor());

    }
}
