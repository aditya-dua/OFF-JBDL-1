public class PersonMain{
    public static void main(String [] args){
        Person p = new Person();
        p.display();

        Employee e = new Employee();
        //Employee e1= new Person();
        Person p1 = new Employee();
        e.display();
        e.display();
        p1.display();
    }
}