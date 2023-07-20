import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number between 1 and 3999 (both included) = ");
        int number = scanner.nextInt();
       Conversion conversion = new Conversion();
        System.out.println(conversion.solution(number));
    }
}