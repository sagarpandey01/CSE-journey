import java.util.*;
public class LongestWordInSen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        int start=0;
        int maxlength=0;
        int maxstart=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                int length=i-start;
                if(length>maxlength){
                    maxlength=length;
                    maxstart=start;
                }
                start=i+1;
            }
        }
        int length = s.length() - start;
        if(length>maxlength){
            maxlength=length;
            maxstart=start;
        }
        System.out.print("Longest Word: ");
        for(int i=maxstart;i<maxstart+maxlength;i++){
            System.out.print(s.charAt(i));
        }
        sc.close();
    }
}
