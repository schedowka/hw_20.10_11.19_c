import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("количество элементов массива:");
        int[] myArray = new int[scan.nextInt()];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scan.nextInt();
        }


        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            int square = (int) Math.pow(myArray[i],2);
            sum +=  square;

        }


        System.out.println("= " + sum);
    }
    }
