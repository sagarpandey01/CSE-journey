import java.util.*;
public class CountUCLCSC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                count1++;
            }
            else if(ch>='A' && ch<='Z'){
                count2++;
            }
            else if(ch>='0' && ch<='9'){
                count3++;
            }
            else{
                count4++;
            }
        }
        System.out.println("Uppercase: " + count2);
        System.out.println("Lowecase: " + count1);
        System.out.println("Digits: " + count3);
        System.out.println("Special: " + count4);
        sc.close();
    }
}
