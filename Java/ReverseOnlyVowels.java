import java.util.*;
public class ReverseOnlyVowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        char[] arr = s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            char ch = arr[start];
            char sh = arr[end];
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U'){
                start++;
            }
            else if(sh!='a' && sh!='e' && sh!='i' && sh!='o' && sh!='u' && sh!='A' && sh!='E' && sh!='I' && sh!='O' && sh!='U'){
                end--;
            }
            else{
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        System.out.println("Resultant String:");
        for(int i=0;i<s.length();i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
