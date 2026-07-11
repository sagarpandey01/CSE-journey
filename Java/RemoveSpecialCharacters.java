import java.util.*;
public class RemoveSpecialCharacters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.next();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                ans.append(ch);
            }
            else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
                ans.append(ch);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
