import java.util.Scanner;

/**
 * Created by: amitkumar
 * https://codeforces.com/problemset/problem/266/B
 */
public class Problem266B {
    public static void main(String[] args){
        int noOfChildren,sec;
        String arrangement;
        Scanner sc = new Scanner(System.in);
        noOfChildren = sc.nextInt();
        sec = sc.nextInt();
        arrangement = sc.next();
        /*System.out.println("noOfChildren"+noOfChildren);
        System.out.println("sec"+sec);
        System.out.println("arrangement"+arrangement);*/
        char[] ch = arrangement.toCharArray();
        while(sec>0) {
            for (int i = 0; i < ch.length - 1; i++) {
                if (ch[i] == 'B' && ch[i + 1] == 'G') {
                    ch[i] = 'G';
                    ch[i + 1] = 'B';
                    i++;
                }
            }
            sec--;
        }
        System.out.println(ch);
    }

}
