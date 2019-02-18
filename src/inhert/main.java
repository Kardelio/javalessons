package inhert;

public class main {
    public static void main(String[] args)
    {
        System.out.println("Hello");

        Animal a = new Animal();
        a.speak();

        Cat c = new Cat();
        c.speak();

        Kitten k = new Kitten();
        k.speak();
    }
}
