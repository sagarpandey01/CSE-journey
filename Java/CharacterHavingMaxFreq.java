import java.util.*;
public class CharacterHavingMaxFreq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        int maxFreq=0;
        char variable=0;
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count>maxFreq){
                maxFreq=count;
                variable=s.charAt(i);
            }
        }
        System.out.println("Character " + variable + " is having maximum count: " + maxFreq);
        sc.close();
    }
}
