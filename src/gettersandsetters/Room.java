package gettersandsetters;

public class Room {
    //MV
    //C
    //Meh
    private int number;
    String name;

    public Room(int numberIn){
        number = numberIn;
    }

    //setters
    public void setNumber(int numberIn){
        if(numberIn > 100){
            number = numberIn;
        }
    }

    //getter
    public int getNumber(){
        return number;
    }




    public void setName(String nameeIn){
        name = nameeIn;
    }

    public String getName(){ return name;
    }
}
