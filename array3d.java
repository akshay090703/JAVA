public class array3d{
    public static void main(String args[]) {
        int[][][] arr = new int[3][4][5]; // 3d array

        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr[i].length; j++) {
                for(int k = 0; k<arr[i][j].length; k++) {
                    arr[i][j][k] = i+j+k; 
                    System.out.print(arr[i][j][k]);
                }

                System.out.print(" ");
            }

            System.out.print('\n');
        }
    }
}