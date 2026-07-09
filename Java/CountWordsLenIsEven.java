import java.util.*;
public class CountWordsLenIsEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        int start=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                int len = i-start;
                if(len % 2 == 0){
                    count++;
                }
                start=i+1;
            }
        }
        int len=s.length()-start;
        if(len % 2 == 0){
            count++;
        }
        System.out.println("Number of words whose length is Even: " + count);
        sc.close();
    }
}
