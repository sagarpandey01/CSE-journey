import java.util.*;
public class PrintEveryWordOnNewLin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        int start=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                System.out.println(s.substring(start,i));
                start=i+1;
            }
        }
        System.out.print(s.substring(start,s.length()));
        sc.close();
    }
}
