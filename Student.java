public class Student{

    int id;
    String name;
    int roll;

    public void display(){
        System.out.println("Studnet Display Called.");
    }

    public Student(){
        System.out.println("Default constructor called.");
    }

    public Student(int id){
        System.out.println("Param constructor called.");
        super();
        

        
    }
}