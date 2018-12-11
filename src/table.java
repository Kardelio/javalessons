import java.util.*;

public class table {
    public static void main(String[] args)
    {
        System.out.println("esgsdgsd");

        Map map=new HashMap();
        //Adding elements to map
        map.put("a",1);
        map.put("b",32);
        map.put("c",54);
        map.put("d",4);
        map.put("e",8);

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println("");
            System.out.print(pair.getKey() + " = ");
            for (int i = 0; i < (int)pair.getValue(); i++) {
                System.out.print("+");
            }
            it.remove(); // avoids a ConcurrentModificationException
        }
//
//        for (int i = 0; i < map.size(); i++) {
//            System.out.print(""+map.keySet().toArray()[i]+":");
//            for (int j = 0; j < map.values().toArray()[i]; j++) {
//                System.out.print("+");
//            }
//        }

    }
}


