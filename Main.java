import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = s.nextInt();


        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }



        int count = 0;
        for(int i = 0; i< n;i++){
           if (arr[i] % 5 != 0){
                count++;
           }
        }
        int[] newArr = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length ;i++){
            if(arr[i] % 5 != 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.println("New array with non multiples of 5: "+ Arrays.toString(newArr));


    }


}