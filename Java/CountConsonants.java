import java.util.*;
public class CountConsonants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if((ch >= 'a' && ch<='z') || (ch>='A' && ch<='Z')){
                if(ch != 'a' && ch != 'e'&& ch != 'i'&&ch != 'o'&& ch != 'u'&& ch != 'A'&& ch != 'E'&& ch != 'I'&& ch != 'O'&& ch != 'U'){
                    count++;
                }
            }
        }
        System.out.println("Number of Consonants: " + count);
        sc.close();
    }
}
