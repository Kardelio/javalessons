package gettersandsetters;

public class main {
    public static void main(String[] args)
    {
        System.out.println("Starts Here");

        Room myRoom = new Room(803);
        Room bestRoom = new Room(200);

//        myRoom.number = 10;
        myRoom.setNumber(10);

        System.out.println(myRoom.getNumber());
        System.out.println(bestRoom.getNumber());

        //list of room


    }
}
