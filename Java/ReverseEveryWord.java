import java.util.*;
public class ReverseEveryWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        char[] arr=s.toCharArray();
        int start=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                int end=i-1;
                while(start<end){
                    char temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                    start++;
                    end--;
            }
            start=i+1;
        }
    }
        int end=s.length()-1;
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
        for(int i=0;i<s.length();i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
