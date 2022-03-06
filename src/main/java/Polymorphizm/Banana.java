package Polymorphizm;

public class Banana extends Fruit{
    public void eatBanana(){
        System.out.println("That's very delicious");
    }
    public Banana(){
        setCalories(105);
    }


    @Override
    public void makeJuice() {
        System.out.println("Banana juice is made");
    }
}
