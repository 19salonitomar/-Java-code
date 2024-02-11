import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        System.out.println(age);
        //string (sc.next() take only token which means only first word)
        System.out.println("Enter your Name: ");
        String Name = sc.next();
        System.out.println(Name);
        // string (sc.nextLine() take full sentence)
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println(name);
    }
}
