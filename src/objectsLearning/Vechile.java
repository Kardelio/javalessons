package objectsLearning;

class fuckOff{
    public static void main(String[] args)
    {
        Vechile vec = new Vechile();
        System.out.println(vec.wheels);
        System.out.println(vec.color);

        Vechile vec2 = new Vechile();
        //Toyota Yaris
        vec2.wheels = 2;
        System.out.println(vec2.wheels);
        System.out.println(vec2.color);


        Vechile vec3 = new Vechile();
        vec3.color = "red";
        System.out.println(vec3.wheels);
        System.out.println(vec3.color);

        Vechile vec4 = new Vechile();
        System.out.println(vec4.wheels);
        System.out.println(vec4.color);
    }
}

public class Vechile {

    //FIELDS

    //CONSTRUCTOR

    //METHODS

    int wheels = 4;
    String model = "";
    String color = "black";
    String type = "car";
    int year = 1990;

    public Vechile(){
        //TODO
    }

    public void move(int metres){
        // vechile position add metres
    }

    public void increaseSpeed(int howmuchfaster){
    }

    public void explode(){
    }

}