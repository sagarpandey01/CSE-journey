import java.util.*;
public class CountWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        if(s.length()==0){
            System.out.println("Number of words: 0");
            return;
        }
        int words=1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                words++;
            }
        }
        System.out.println("Number of words: " + words);
        sc.close();
    }
}
