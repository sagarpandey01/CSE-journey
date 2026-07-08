import java.util.*;
public class CheckStringContainDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        boolean found=false;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("No Digit found");
        }
        else{
            System.out.println("Digit found");
        }
        sc.close();
    }
}
