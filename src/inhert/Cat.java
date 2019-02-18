package inhert;

public class Cat extends Animal{

    public Cat(){
        lifeExpect = 20;
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
