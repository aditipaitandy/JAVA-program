import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();
        
        if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        
        scanner.close();
    }
}
