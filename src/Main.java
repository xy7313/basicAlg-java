import binarySearch.BinarySearch;
import selectionSort.Selection;
import subString.KMP;
import  subString.BF;

public class Main {

    public static void main(String[] args) {
        //selection
        Selection s = new Selection();
        int[] t = {2,1,3,7,31,123,1322};
        s.sort(t);
        for(int i : t){
            //System.out.println("Selection:"+i);
        }

        //binarySearch--t sorted
        BinarySearch bs =  new BinarySearch();
        int bsRE = 0;
        bsRE= bs.binarySearch(t,3);
        System.out.println("bs:"+bsRE);

        //BF-SUBSTRING
        BF bf = new BF();
        String mainString = "ABCDEFGHIABCD";
        String subString = "GHI";
        int idx = 0;
        idx = bf.match(mainString, subString);
        System.out.println("bf:"+idx);

        //KMP-SUBSTRING
        int idx2 = 0;
        idx2 = KMP.kmp(mainString, subString);
        System.out.println("kmp:"+idx2);

    }
}


