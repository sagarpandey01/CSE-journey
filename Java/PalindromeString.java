import java.util.*;
public class PalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.next();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                System.out.println("Not a palindrome");
                sc.close();
                return;
            }
            else{
                left++;
                right--;
            }
        }
        System.out.println("Palindrome");
        sc.close();
    }
}
