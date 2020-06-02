import java.util.HashMap;
import java.util.Map;

/**
 * Created by: amitkumar
 * Find a pair with given sum in the array
 * Given an unsorted array of integers , find a pair with given sum in it
 */
public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {8,7,2,5,3,1};
        int sum =10;
        findPair(arr, sum);
        findPair1(arr, sum);

    }
    /**find only one pair*/
    private static void findPair(int[] arr, int sum) {
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==sum){
                    System.out.println("Pair found at index "+i+ " and " +j);
                    return;
                }
            }
        }
    }
    /**find only one pair*/
    private static void findPair1(int[] arr, int sum){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (map.containsKey(sum-arr[i])){
                System.out.println("Pair found at index "+map.get(sum-arr[i])+" and "+i);
                return;
            }
            map.put(arr[i],i);
        }

    }
}
