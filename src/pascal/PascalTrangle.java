package pascal;

/**
 * Created by xy on 2017/1/4.
 */
public class PascalTrangle {

    public static void main(String[] arg) {
        int[][] triangle = pascalTriangle(6);
        for(int i = 0; i<triangle.length; i++){
            for(int j = 0; j< triangle[i].length; j++){
                System.out.print(" "+triangle[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static int[][] pascalTriangle(int n) {
        int [][] pt = new int[n][];
        for(int i = 0; i< pt.length; i++){
            pt[i] = new int[i+1];
            pt[i][0] = 1;
            pt[i][i] = 1;
            for(int j = 1; j<i; j++){
                pt[i][j]= pt[i-1][j-1]+pt[i-1][j];
            }
        }
        return pt;


    }

}

