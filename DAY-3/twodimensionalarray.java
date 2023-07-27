public class twodimensionalarray {
    public static void main(String[]args){
        int[][] a={{2,3,4},{5,6,4}};
        for(int[] row:a){
            System.out.println(row+ "   ");
        }
        System.out.println("The matrix is:");
        for(int[] row:a){
            for(int[] column:a){
                System.out.println(column+"  ");
            }
            System.out.println();
        }
    }
}
