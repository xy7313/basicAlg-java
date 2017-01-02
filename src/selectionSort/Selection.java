package selectionSort;

/**
 * Created by xy on 2016/12/26.
 */
public class Selection {

    public void sort(int[] arr){
        for( int lh = 0; lh < arr.length; lh++){
            int rh = findSmallest(arr, lh);
            swap(arr, lh, rh);
        }
    }

    public int findSmallest(int[] arr, int p){
        int smallestIndex = p;
        for(int i = p+1; i<arr.length; i++){
            if(arr[i]<arr[smallestIndex]) smallestIndex = i;
        }
        return smallestIndex;
    }

    public void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

}
