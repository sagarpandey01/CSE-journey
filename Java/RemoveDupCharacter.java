import java.util.*;
public class RemoveDupCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        for(int i=0;i<s.length();i++){
            boolean found=false;
            for(int j=0;j<i;j++){
                if(s.charAt(i) == s.charAt(j)){
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.print(s.charAt(i));
            }
        }
        sc.close(); 
    }
}
