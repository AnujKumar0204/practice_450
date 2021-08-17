import java.util.*;

public class reverse {

    public static void main(String[] args) {
        
        String s = "Geeks";
        
        System.out.println(new Swap().reverseWord(s));


    }

    
}

class Swap{

    public static String reverseWord(String str){

        
        String reverse = new StringBuffer(str).reverse().toString();

        char ch[] = str.toCharArray();

        


        return reverse;

    }

}
