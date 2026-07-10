import java.util.*;
public class CountWordsConAtLeastOneDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        int count=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                while(start<i){
                    char ch = s.charAt(start);
                    if(ch>='0' && ch<='9'){
                        count++;
                        break;
                    }
                    start++;
                }
                start=i+1;
            }
        }
        int last = s.length()-1;
        while(start<=last){
            char ch = s.charAt(start);
            if(ch>='0' && ch<='9'){
                count++;
                break;
            }
            start++;
            }
            System.out.println("words contain atleast one digit: " + count);
            sc.close();
        }
    }

