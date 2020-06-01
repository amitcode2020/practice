import java.util.Scanner;

/**
 * Created by: amitkumar
 * https://codeforces.com/problemset/problem/315/A
 */
public class Problem315A {
    public static void main(String[] args) {
        int n, a, b;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][3];
        for (int i =0;i<n;i++){
            for (int j=0;j<3;j++)
                if(j==2){
                    arr[i][j]=1;
                }else
                {
            arr[i][j] = sc.nextInt();
                }
        }
        System.out.println(calculateNotOpenedBottles(arr));
    }

    private static int calculateNotOpenedBottles(int[][] arr) {
        int notOpenedBottles=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++)
            {
                if (i!=j && arr[i][1]==arr[j][0]){
                    arr[j][2] = 0;
                }
            }
        }
        for (int k=0;k<arr.length;k++){
            notOpenedBottles  = notOpenedBottles + arr[k][2];
        }
        return notOpenedBottles;
    }

}
