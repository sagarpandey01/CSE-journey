import java.util.*;
public class IntersectionOfArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1: ");
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        System.out.println("Enter the element of Array1");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of array2: ");
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        System.out.println("Enter the element of Array2");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int[] res=new int[Math.min(n1,n2)];
        int i=0,j=0,index=0;
        while(i<n1 && j<n2){
            if(arr1[i]==arr2[j]){
               if(index==0 || res[index-1] != arr1[i]){
                res[index++]=arr1[i];
               }
               i++;
               j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.print("Intersection: ");
        for(int k=0;k<index;k++){
            System.out.print(res[k] + " ");
        }
        sc.close();
    }
}
