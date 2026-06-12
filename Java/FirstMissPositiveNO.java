import java.util.Scanner;

public class FirstMissPositiveNO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements of array");
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<=n+1;i++){
            boolean found = false; 
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Missing: " + i);
                break;
            }
            }
            sc.close();
        }
    }
    
