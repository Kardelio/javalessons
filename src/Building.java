public class Building{

    //FIELDS
    String type;
    double height = 245;  //metres/inches/miles
    String style;  //gothic
    String name; //empire state building
    int windows = 100;
    String facilityType = "Medical";
    boolean isBuildingOccupied = false;
    boolean areTheLightsOn = false;

    //CONSTRUCTOR
    //same word as class SUPER important
    public Building(){
    }

    //METHODS
    public void open(int timeOfDay,char dayOfWeek,boolean bankHoliday){
        System.out.println("BUILDING IS OPENING! TIme: " + timeOfDay + ", DAy: " +dayOfWeek+", IS it a bank holifay?"+bankHoliday);
    }

    public void explode(){
        System.out.println("AHHHHH FUCK BUILDING IS EXPLODING!");
    }

    public void getBigger(int metres){
        height += metres;
        System.out.println("Building is now bigger it is: "+height);
    }

    public void peopleComingIntoBuilding(int numberOfPeopleComingIn){
        if(numberOfPeopleComingIn > 0){
            areTheLightsOn = true;
        }
    }
    
    public void close(int timeOfDay){
        System.out.println("CLosing!");
    }

}



