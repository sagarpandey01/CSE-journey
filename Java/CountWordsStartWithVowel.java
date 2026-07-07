import java.util.*;
public class CountWordsStartWithVowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(i==0 || s.charAt(i-1)==' '){
                char ch = s.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    count++;
            }
        }
        }
        System.out.println("count: " + count);
        sc.close();
    }
}
