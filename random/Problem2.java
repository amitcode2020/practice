import java.util.HashMap;
import java.util.Map;

/**
 * Created by: amitkumar
 * Find duplicate element in a limited range array
 * Given a limited range array of size n where array contains
 * elements between 1 to n-1 with one element repeating, find the duplicate number in it.
 */
public class Problem2 {
    public static void main(String[] args){
        int[] arr ={1,2,3,4,2};
        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicate1(arr));

    }

    private static int findDuplicate1(int[] arr) {
        for (int a: arr) {
            int val = a<0?-a:a;
            if (arr[val-1]>=0){
                arr[val-1] = - arr[val-1];
            }
            else
            {
                return val;
            }

        }
       return -1;

    }

    public static int findDuplicate(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
                return arr[i];
            }
            map.put(arr[i],i);
        }
        return -1;
    }
}
