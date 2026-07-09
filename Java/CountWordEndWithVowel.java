import java.util.*;
public class CountWordEndWithVowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i+1)==' '){
                char ch = s.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    count++;
        }
    }
    }
        char last = s.charAt(s.length()-1);
        if(last=='a' || last=='e' || last=='i' || last=='o'||last=='u'||last=='A'||last=='E'||last=='I'||last=='O'||last=='U'){
            count++;
        }
        System.out.println("Number of Words ending with vowel: " + count);
        sc.close();
    }
}


