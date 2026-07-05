import java.util.*;
public class CountuppLowCaseLett {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        int count1=0;
        int count2=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                if(ch>='a' && ch<='z'){
                    count1++;
                }
                else{
                    count2++;
                }
            }
        }
        System.out.println("Count of Lowercase Letter: " + count1);
        System.out.println("Count of Uppercase Letter: " + count2);
        sc.close();
    }
}
