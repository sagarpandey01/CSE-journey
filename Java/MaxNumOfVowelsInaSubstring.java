import java.util.*;
public class MaxNumOfVowelsInaSubstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        System.out.println("Enter K");
        int k = sc.nextInt();
        int count=0;
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        int maxCount=count;
        for(int i=k;i<s.length();i++){
            char ch = s.charAt(i);
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            maxCount=Math.max(maxCount,count);
        }
        System.out.println("Maximum vowels: " + maxCount);
        sc.close();
    }
    static boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }
}
