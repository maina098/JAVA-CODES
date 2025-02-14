import java.util.Scanner;
public class person {
    string name:
    int age;
    
    person(age,name){
        this.name=name;
        this.age= age;
    }
    void display{
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
    public class MainApp{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        //taking user input for person  class
        System.out.println("Enter your name: ");
        String name= scanner.nextLine();
        
        System.out.println("Enter your age:");
        int age=scanner.nextInt();
        
        //create a person object
        Person person=new person(name,age);
        
        //Display person details
        System.out.println("\npersonal details:");
        person.display();
        
        //using calculator class
        
        System.out.println("Hello, World!");
    }
    
}