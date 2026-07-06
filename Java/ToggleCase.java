import java.util.*;
public class ToggleCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                ch = (char) (ch-32);
            }
            else if(ch>='A' && ch<='Z'){
                ch = (char) (ch+32);
            }
            System.out.print(ch);
        }
        sc.close();
    }
}
