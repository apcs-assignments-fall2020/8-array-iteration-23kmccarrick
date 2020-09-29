import java.util.Arrays;   
public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] woof = new int[arr.length];
        int d = 0;
        for(int i = arr.length; i > 0; i --){
            woof[i-1]=arr[d];
            d++;
        }
        return woof;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        if(arr.length<3)
            return true;
        double r = (double)arr[1]/(double)arr[0];
        for(int i = 2; i < arr.length; i++){
            if((double)(arr[i])/(double)(arr[i-1])!=r)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        int[] boo = {1,2,4,8,16};
        System.out.println(isGeometric(boo));
        System.out.println(secondLargest(boo));
        System.out.println(reverse(boo));
    }
}
