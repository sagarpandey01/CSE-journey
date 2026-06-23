import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array1:");
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        System.out.println("Enter the Elements of Array1:");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of Array2:");
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        System.out.println("Enter the Elements of Array2:");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int[] res=new int[n1+n2];
        int i=0,j=0,index=0;
        while(i<n1 && j<n2){
            if(arr1[i] <= arr2[j]){
                res[index++]=arr1[i++];
            }
            else{
                res[index++]=arr2[j++];
            }
        }
        while(i<n1){
            res[index++]=arr1[i++];
        }
        while(j<n2){
            res[index++]=arr2[j++];
        }
        System.out.print("Merged Sorted Array: ");
        for(int k=0;k<index;k++){
            System.out.print(res[k] + " ");
        }   
        sc.close();       
    }
}
