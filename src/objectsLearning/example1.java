package objectsLearning;

public class example1 {
    
    public static void main(String[] args)
    {
        System.out.println("Here is my main method");

        int a = 20;
        Person p = new Person("Dan");
        p.speak();

//        Animal a = new Animal("Cat",true);
//        a.printDetails();
        
        System.out.println("--------------");

        Person[] people = new Person[3];
        people[0] = new Person("Ben");
        people[1] = new Person("Tim");
        people[2] = new Person("Kat");

        for (int i = 0; i < people.length; i++) {
            people[i].speak();
        }

    }
    
}

// ------------------------------------------------------------
// ------------------------------------------------------------

/**
 * Below is usually in a different file, its just here to make it easier...
 */
class Person{

    private String name;

    public Person(String n){
        name = n;
    }

    public void speak(){
        System.out.println("Hello my name is: " + name);
    }
}

// ------------------------------------------------------------
// ------------------------------------------------------------

class Animal{

    private String type;
    private boolean hasFur;

    public Animal(String ty, boolean fu){
        type = ty;
        hasFur = fu;
    }

    public void printDetails(){
        System.out.println("Animal Type: " + type + " Has Fur: " + hasFur);
    }
}