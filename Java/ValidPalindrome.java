import java.util.*;
public class ValidPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                ans.append(ch);
            }
            else if(ch>='0' && ch<='9'){
                ans.append(ch);
            }
        }
        int start=0;
        int end=ans.length()-1;
        while(start<end){
            char ch = ans.charAt(start);
            char sh = ans.charAt(end);
            if(ch!=sh){
                System.out.println("Not a palindrome");
                sc.close();
                return;
            }
            start++;
            end--;
        }
        System.out.println("palindrome");
        sc.close();
    }
}
