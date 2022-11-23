import java.util.Scanner;

public class PrintHi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = input.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }
    }
}