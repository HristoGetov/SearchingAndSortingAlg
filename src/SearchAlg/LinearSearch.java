package SearchAlg;
//Time complexity O(n)
public class LinearSearch {
    public static int linearSearch(int[] arr, int x){
        for(int i = 0; i <arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
