import SearchAlg.BinarySearch;
import SearchAlg.JumpSearch;
import SearchAlg.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int arr[] = {10,20,80,30,60,50,110,100,130,170};
        int arr2[] = {10,20,30,50,60,80,100,110,130,170};
        int arr3[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
                34, 55, 89, 144, 233, 377, 610};

        int x = 60;

        System.out.println("Index: " + LinearSearch.linearSearch(arr,x));
        System.out.println("Index: " + BinarySearch.binarySearch(arr,0,arr2.length-1,100));
        System.out.println("Index: " + JumpSearch.jumpSearch(arr3,55));
    }
}
