//import java.util.Scanner;

public class P {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t= sc.nextInt();
        long[] arr = {1,2,3,4,5,6};
        rearrange(arr,arr.length);
        for (long s : arr) {
            System.out.println(s);
        }

    }
        public static void rearrange(long[] arr, int n){
            for(int i=0; i<n; i=i+2)
            {
                long temp = arr[i];
                arr[i] = arr[n-1];
                for(int j=n-1; j>i; j--)
                {
                    arr[j]=arr[j-1];
                }
                arr[i+1]=temp;
            }
        }
    }

