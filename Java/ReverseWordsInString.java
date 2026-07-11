import java.util.*;
public class ReverseWordsInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        int last=s.length()-1;
        String ans = "";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                ans += s.substring(i+1,last+1) + " ";
                last=i-1;
            }
        }
        ans += s.substring(0,last+1);
        System.out.println(ans);
        sc.close();
    }
}
