public class middle{

    public static void main(String[] args) {
        
        int a = 978;
        int b = 500;
        int c = 200;

        System.out.println(new Solution().middle(a, b, c));

    }

}

class Solution{
    int middle(int a, int b, int c){

        // Checking for b 
        if ((a < b && b < c) || (c < b && b < a)) 
            return b; 
  
        // Checking for a 
        else if ((b < a && a < c) || (c < a && a < b)) 
        return a; 
  
        else
        return c; 
    }
}