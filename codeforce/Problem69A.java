import java.util.Scanner;

/**
 * Created by: amitkumar
 * https://codeforces.com/problemset/problem/69/A
 */
public class Problem69A {

    public static String isEquilibrium(int n,Scanner sc){
        int x=0 ,y =0, z=0;
        int[][] arr = new int[n][3];
        for(int i=0;i<n;i++){
            for (int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
                if (j==0){
                    x = x + arr[i][j];
                }
                if (j==1){
                    y = y + arr[i][j];
                }
                if (j==2){
                    z = z + arr[i][j];
                }
            }
        }
        if(x==0 && y==0 && z==0){
            return "YES";
        }else
            return "NO";
    }
    public static void main(String[] args) {
        int noOfInput;
        Scanner sc = new Scanner(System.in);
        //System.out.println("Please enter the number of inputs: ");
        noOfInput = sc.nextInt();
        System.out.println(isEquilibrium(noOfInput,sc));
    }

}
