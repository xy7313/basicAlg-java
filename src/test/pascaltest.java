package test;

/**
 * Created by xy on 2017/1/4.
 */
public class pascaltest {

    public static void main(String [] args) {
    int[][] tri = pr(4);
        for (int r=0; r<tri.length; r++) {
            for (int c=0; c<tri[r].length; c++) {
                System.out.print(" "+tri[r][c]);
            }
            System.out.println("");
        }

    }
    public static int[][] pr(int n){
        int [][] tri = new int[n][];

        for (int r=0; r<tri.length; r++) {
            tri[r] = new int[r+1];
            tri[r][0] = 1;
            tri[r][r] = 1;
            for (int c=1; c<r; c++) {
                tri[r][c] = tri[r-1][c]+tri[r-1][c-1];
            }
        }
        return tri;
    }

}
