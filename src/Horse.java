class Horse{

    String name;
    int speed;
    double height;
    String color;
    boolean alive;
    int legs;
    boolean isMale;

    //Constructor - Is just a method = a Horse          RED
    public Horse(){
        name = "";
        speed = 30;
        height = 2;
        color = "Brown";
        alive = true;
        isMale = true;
    }
    
    public void nay(){
        System.out.println("Nay, Im " + name);
        System.out.println("Nay, Im " + color);
    }
}