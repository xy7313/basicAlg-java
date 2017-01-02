package binarySearch;

/**
 * Created by xy on 2017/1/2.
 */
public class BinarySearch {
    //binarySearch works only on arrays in which elements are assinged in order
//mid = (rightSide+leftSide)/2 , plus nor minus, we want the abs index
    public int binarySearch(int[] arr, int key){
        int leftSide = 0;
        int rightSide = arr.length-1;
        while(leftSide <= rightSide){
            int mid = (rightSide+leftSide)/2;
            if(arr[mid] == key) return mid;
            else if(arr[mid] > key){
                rightSide = mid-1;
            }else{
                leftSide=mid+1;
            }
        }
        return -1;
    }
}

