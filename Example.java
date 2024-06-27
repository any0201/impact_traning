import java.util.Scanner;

public class Example {
    
    public static void main(String[] args) {
        
        // int a = 5;
        // int b = 10;
        
        // System.out.print(a);
        // System.out.print(b);

        // System.out.println(a);
        // System.out.println(b);

        // System.out.printf("%d",a);
        // System.out.printf("%d",b);

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a name: ");

        String name = obj.next();
        int b = obj.nextInt();
        float c = obj.nextFloat();

        System.out.println("Welcome"+" "+name);

        System.out.println(b);
        System.out.println(c);
        
    }

}
