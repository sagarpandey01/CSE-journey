import java.util.*;
public class CountConsoInEverySubstringOfLenK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        System.out.println("Enter K:");
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<k;i++){
            if(isConsonant(s.charAt(i))){
                count++;
            }
        }
        System.out.print(count);
        for(int i=k;i<s.length();i++){
            if(isConsonant(s.charAt(i))){
                count++;
            }
            if(isConsonant(s.charAt(i-k))){
                count--;
            }
            System.out.print(" " + count);
        }
        sc.close();
    }
    static boolean isConsonant(char ch){
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
        if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'){
            return true;
        }
    }
        return false;
    }
}
