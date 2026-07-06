import java.util.*;
public class CountDigitInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                count++;
            }
        }
        System.out.println("Number if Digits: " + count);
        sc.close();
    }
}
