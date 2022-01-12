import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        // array is a reference data type
        //local array within main method
        int[] arr = new int[5];//creation statement
        //for initializing we use loop
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        //used for read only purpose
        for(int rec:arr) System.out.println(rec);
    }
}
