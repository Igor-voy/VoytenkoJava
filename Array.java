import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int length = input.nextInt();

        int[] array = new int[length];
        System.out.println("Введите элементы массива: ");
        for(int i = 0; i < length; i++){
            array[i] = input.nextInt();
        }

        System.out.println("Элементы кратные 3: ");
        for(int element : array){
            if(element % 3 == 0){
                System.out.println(element);
            }
        }
    }
}