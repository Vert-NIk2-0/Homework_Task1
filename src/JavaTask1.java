import java.util.Scanner;

public class JavaTask1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        step1(arr);
        step2(arr);
        step3(arr);

        sc.close();
    }

    static void step1 (int[] array){
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
        }

        System.out.println("The smallest and largest values of the array: ");
        System.out.println(min + " " + max);
    }

    static void step2 (int[] array){
        double averageValue = 0.;
        for(int i=0; i<array.length; i++){
            averageValue += array[i];
        }
        averageValue /= array.length;

        System.out.printf("Values that are less than the average (%.2f) of the array:\n", averageValue);

        for(int i=0; i<array.length; i++){
            if(averageValue > array[i]){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    static void step3 (int[] array){
        System.out.println("Indexes of minimum array values: ");

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] == min){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

