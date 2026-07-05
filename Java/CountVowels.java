import java.util.*;
public class CountVowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.next();
        int count=0;
        for(int b=0;b<s.length();b++){
            char ch = s.charAt(b);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        System.out.println("Numbers of vowel: " + count);
        sc.close();
    }
}
        