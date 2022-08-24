package String;
import java.util.Scanner;
import java.util.ArrayList;

//reverse first and last character of words in a String 
public class ReverseStringWordChar {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        ArrayList<String> a = new ArrayList<>();
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' '){
                a.add(s.substring(j,i));
                j=i+1;
            }
        }
        a.add(s.substring(j));
        StringBuffer sb = new StringBuffer(); 
        for(String x:a)
        {
            sb.append(x.charAt(x.length() - 1)).append(x, 1, x.length() - 1).append(x.charAt(0));
            sb.append(" ");
        }
        int p=10;
        System.out.print(sb);
		}
}
