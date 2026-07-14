import java.util.*;
public class MergeStringAlternately {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1");
        String s = sc.next();
        System.out.println("Enter String2");
        String b = sc.next();
        StringBuilder ans  = new StringBuilder();
        int i=0,j=0;
        while(i<s.length() && j<b.length()){
            ans.append(s.charAt(i));
            i++;
            ans.append(b.charAt(j));
            j++;
        }
        while(i<s.length()){
            ans.append(s.charAt(i));
            i++;
        }
        while(j<b.length()){
            ans.append(b.charAt(j));
            j++;
        }
        System.out.println(ans);
        sc.close();
    }
}
