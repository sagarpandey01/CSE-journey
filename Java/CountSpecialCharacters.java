import java.util.*;
public class CountSpecialCharacters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9') || (ch>='A' && ch<='Z')){
                continue;
            }
            else{
                count++;
            }
        }
        System.out.println("Number of Special Character: " + count);
        sc.close();
    }
}
