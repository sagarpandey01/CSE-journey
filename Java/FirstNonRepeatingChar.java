import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String s = sc.next();

        boolean found = false;

        for(int i = 0; i < s.length(); i++){

            int count = 0;

            for(int j = 0; j < s.length(); j++){

                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }

            if(count == 1){
                System.out.println("First non repeating character: " + s.charAt(i));
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("No unique character");
        }
        sc.close();
    }
}