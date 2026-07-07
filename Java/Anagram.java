import java.util.*;
public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1");
        String s = sc.next();
        System.out.println("Enter String2");
        String t = sc.next();
        int count=0;
        if(s.length() != t.length()){
            System.out.println("Not anagram");
            sc.close();
            return;
        }
        char[] arr = t.toCharArray();
        boolean isAnagram=true;
        for(int i=0;i<s.length();i++){
            boolean found = false;
            for(int j=0;j<arr.length;j++){
                if(s.charAt(i)==arr[j]){
                    found=true;
                    arr[j]='#';
                    break;
                }
            }
            if(!found){
                isAnagram=false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
        sc.close();
    }
}
