import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = Integer.parseInt(scanner.nextLine());
        System.out.println(1);
        if (numRows == 1) {
            return;
        }
        int[] initialArray = new int[]{1, 1};
        for (int i = 0; i < initialArray.length; i++) {
            System.out.print(String.format("%d ", initialArray[i]));
            if (initialArray.length -1 == i){
                System.out.print(String.format("%n"));
            }
        }
        if (numRows == 2) {
            return;
        } else {
            for (int i = 0; i < initialArray.length + 1; i++) {
                int[] array = new int[initialArray.length + 1];
                array[0] = 1;
                array[array.length - 1] = 1;
                for (int j = 1; j < array.length - 1; j++) {
                    array[j] = initialArray[j - 1] + initialArray[j];
                }
                for (int j = 0; j < array.length; j++) {
                    System.out.print(String.format("%d ", array[j]));
                    if (array.length - 1 == j){
                        System.out.print(String.format("%n"));
                    }
                }
                initialArray = array;
                if (initialArray.length== numRows){
                    break;
                }
            }
        }
    }
}
