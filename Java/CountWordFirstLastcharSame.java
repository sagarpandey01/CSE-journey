import java.util.*;
public class CountWordFirstLastcharSame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        int start=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                char ch = s.charAt(start);
                if(ch==s.charAt(i-1)){
                    count++;
                }
                start=i+1;
            }
        }
        int ch = s.length()-1;
        if(s.charAt(start)==s.charAt(ch)){
            count++;
        }
        System.out.println("Count words whose first and last character are same: " + count);
        sc.close();
    }
}
