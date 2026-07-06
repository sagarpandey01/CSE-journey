import java.util.*;
public class CountFreqOfCharac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        System.out.println("Enter Target");
        char Target=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==Target){
                count++;
            }
        }
        System.out.println("Frequency of " + Target +": " + count);
        sc.close();
    }
}
