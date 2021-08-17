import java.util.*;

public class reverse {

    public static void main(String[] args) {
        
        int n;
        int[] array = new int[100];

        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter length of array: "); 
        n=sc.nextInt(); 
        
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++){  
          
            array[i]=sc.nextInt();  
        }  
        System.out.println("Array elements Before Reverse are: ");  
        
        for (int i=0; i<n; i++){  
            System.out.print(array[i] + " ");  
        }  
        System.out.println(); 
        int start = 0;
        int end = n-1;
        
        new Swap().reverseWord(array, start, end);


    }

    
}

class Swap{

    public static void reverseWord(int[] arr, int start, int end){

        int temp;
          
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }


        for (int i = 0; i <= end+1; i++)
             System.out.print(arr[i] + " ");
          
         System.out.println();

    }

}
