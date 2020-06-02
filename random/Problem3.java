import sun.lwawt.macosx.CSystemTray;

/**
 * Created by: amitkumar
 * Sort binary array in linear time
 */
public class Problem3 {
    public static void main(String[] args) {
        int [] arr ={1,0,1,0,0,1,0,0,1,0,1};
        //sortArray(arr);
        sortArray1(arr);
    }

    private static void sortArray1(int[] arr) {
        int k=0;
        for(int a : arr){
            if (a==0){
                arr[k++]=0;
            }

        }
        //fill remaining indices with 1
        for (int i=k;i<arr.length;i++)
        {
            arr[i] = 1;
        }
        //print array
        for (int a: arr) {
            System.out.print(" "+a);

        }
    }

    private static void sortArray(int[] arr) {
        int noOfZeros=0;
        for (int a :arr){
            if (a==0){
                noOfZeros++;
            }
        }
        for (int i=0;i<arr.length;i++){
            if (noOfZeros>0){
                arr[i] = 0;
                noOfZeros--;
            }
            else{
                arr[i]=1;
            }
        }
        //print array
        for (int a: arr) {
            System.out.print(" "+a);

        }

    }

}
