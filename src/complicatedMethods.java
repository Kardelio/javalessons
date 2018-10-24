import java.util.ArrayList;

public class complicatedMethods {

    public static void main(String[] args)
    {
        ArrayList<Student> listOfStudents = new ArrayList<>();

        listOfStudents.add(new Student("Ben",1));
        listOfStudents.add(new Student("Steve",2));
        listOfStudents.add(new Student("Ryan",3));

        loopThroughAndFindById(listOfStudents,1).printDetails();
        loopThroughAndFindById(listOfStudents,2).printDetails();
        loopThroughAndFindById(listOfStudents,3).printDetails();
        loopThroughAndFindById(listOfStudents,4).printDetails();

    }
    
    public static Student loopThroughAndFindById(ArrayList<Student> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).m_id == id){
                return list.get(i);
            }
        }
        System.out.println("No student found matching that Id");
        return null;
    }
}


/**
 * Student Class
 */
class Student{

    String m_name = "";
    int m_id = 0;

    Student(String name, int id){
        m_name = name;
        m_id = id;
    }

    public void printDetails(){
        System.out.println("Student: " + m_id + ", named: " + m_name);
    }
}