import java.util.Scanner;

/**
 * Created by: amitkumar
 * https://codeforces.com/problemset/problem/32/B
 */
public class Problem32B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        StringBuilder sb = new StringBuilder();
        str = sc.nextLine();
        char[] ch = str.toCharArray();
        for (int i=0;i<ch.length;i++){
            if (ch[i]=='.'){
                sb.append("0");
            }else if(ch[i]=='-'){
                if(ch[i+1]=='-'){
                    sb.append("2");
                }else {
                    sb.append("1");
                }
                i++;
            }
        }
        System.out.println(sb);
    }
}
