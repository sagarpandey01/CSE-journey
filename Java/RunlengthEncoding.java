import java.util.*;
public class RunlengthEncoding {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                System.out.print(s.charAt(i-1));
                System.out.print(count + " ");
                count=1;
            }
        }
        System.out.print(" "+s.charAt(s.length()-1)+count);
        sc.close();
    }
}
