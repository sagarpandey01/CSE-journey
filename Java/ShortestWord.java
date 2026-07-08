import java.util.*;
public class ShortestWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        int start=0;
        int minlength=Integer.MAX_VALUE;
        int minstart=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                int length=i-start;
                if(length<minlength){
                    minlength=length;
                    minstart=start;
                }
                start=i+1;
            }
        }
        int length=s.length()-start;
        if(length<minlength){
            minlength=length;
            minstart=start;
        }
        for(int i=minstart;i<minstart+minlength;i++){
            System.out.print(s.charAt(i));
        }
        sc.close();
    }
}
