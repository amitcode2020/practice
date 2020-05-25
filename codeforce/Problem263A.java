import java.util.Scanner;

/**
 * Created by: amitkumar
 * https://codeforces.com/problemset/problem/263/A
 */
public class Problem263A {
    public static void main(String args[]){
        int minMove=0;
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if (sc.nextInt()!=0){
                    if(i>2){
                        minMove = i-2;
                    }else {
                        minMove = 2-i;
                    }
                    if(j>2){
                        minMove = minMove+ (j-2);
                    }else {
                        minMove = minMove+ (2-j);
                    }

                }
            }
        }
        System.out.println(minMove);

    }

}
