public class example2 {

    public static void main(String[] args)
    {
        Building building1 = new Building();
        building1.facilityType = "Strip Club";
        System.out.println(building1.facilityType);
        building1.explode();
        building1.open(12,'d',false);

        Building townHall = new Building();
        townHall.facilityType = "Political";
        townHall.peopleComingIntoBuilding(10);
        townHall.explode();




    }

}
