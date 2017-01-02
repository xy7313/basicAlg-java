import selectionSort.Selection;
import subString.KMP;
import  subString.BF;

public class Main {

    public static void main(String[] args) {
        //selection
        Selection s = new Selection();
        int[] t = {2,1,3,7,31,123,123,1322,1};
        s.sort(t);
        for(int i : t){
            System.out.println("Selection:"+i);
        }

        //BF-SUBSTRING
        BF bf = new BF();
        String mainString = "ABCDEFGHIABCD";
        String subString = "GHI";
        int idx = 0;
        idx = bf.match(mainString, subString);
        System.out.println("bf:"+idx);

        //KMP-SUBSTRING
        String mainString2 = "ABCDEFGHIABCD";
        String subString2 = "GHI";
        int idx2 = 0;
        idx = KMP.kmp(mainString2, subString2);
        System.out.println("kmp:"+idx);

    }
}


