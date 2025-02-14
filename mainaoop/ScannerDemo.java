import java.util.Scanner;
public class ScannerDemo {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name=scanner.nextLine();
        
        System.out.println("Enter your salary:");
        float salary=scanner.nextFloat();
        
        System.out.println("Enter your gpa");
        double gpa=scanner.nextDouble();
        
        System.out.println("isStudent=true:");
        boolean isStudent= nextBoolean();
        
        
        System.out.println("Your name,salary,and gpa is:" + name +salary +gpa);
    }
    
}