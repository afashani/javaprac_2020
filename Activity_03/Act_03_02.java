import java.util.Scanner;
public class Act_03_02 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();

        if(num % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
    
}
