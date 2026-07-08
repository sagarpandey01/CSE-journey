import java.util.*;
public class CountWordsInUC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        boolean isUpper=true;
        int count=0;
        for(int i=0;i<=s.length();i++){
            if(i==s.length() || s.charAt(i) == ' '){
                if(isUpper){
                    count++;
                }
                isUpper=true;
            }
            else{
                char ch = s.charAt(i);
                if(ch>='a' && ch<='z'){
                    isUpper=false;
                }
            }
        }
        System.out.println("Number of Uppercase Words: " + count);
        sc.close(); 
    }
}
