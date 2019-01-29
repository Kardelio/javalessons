public class Saloon {

    String name;
    int capacity;
    int height;
    int windows;
    int doors;
    String explosion;

    public Saloon(String nameIn, int heightIn) {
        name = nameIn;
        height = heightIn;
        capacity = 100;
    }

    public void flood() {
        System.out.println("There is a leak in that Saloon called " + name + ", dont go there");
    }
}
