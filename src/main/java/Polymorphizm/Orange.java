package Polymorphizm;

public class Orange extends Fruit{
    public void squeezeOrange(){
        System.out.println("Orange is squeezing");
    }
    public Orange(){
        setCalories(60);
    }

    @Override
    public void makeJuice() {
        System.out.println("Orange juice is made");
    }
}
