package chapter03_ch19;

public class TwoDimensionTest {
    public static void main(String[] args) {
        int[][]arr1={{1,2,3},{4,5,6,7}};

        System.out.println(arr1.length);
        System.out.println(arr1[1].length);
        int i,j;
        for(i=0;i<arr1.length;i++){
            for(j=0;j<arr1[i].length;j++){
                System.out.printf(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
