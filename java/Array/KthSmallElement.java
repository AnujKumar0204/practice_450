//User function Template for Java
class kthSmallestElement{

    public static void main(String[] args) {

        int arr[] = {7, 10, 4, 3, 20, 15};
        
        int l = 0;

        int r = 5;

        int k = 3;


        kthSmallest(arr, l, r, k);
    }


    public static void kthSmallest(int[] arr, int l, int r, int k) { 
        
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < r; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }


        System.out.println(arr[k-1]);
        
    } 
}