package Array;

public class Array{
    public static void main(String[] args){
        // 1D array
        // int[] arr1;
        // arr1 = new int[5]; //5->size

        // 2D array
        // int[][] arr2;
        // // arr2 = new int[3][4];//row->3, col->4
        // // OR
        // arr2 = new int[3][];//row -> 3
        // arr2[0] = new int[2];//2->size
        // arr2[1] = new int[3];//3->size
        // arr2[2] = new int[4];//4->size

        // int[][] arr = {
        //                 {1, 2, 3, 4}, //row-1
        //                 {1, 2, 3}, //row -2
        //                 {2, 3, 4, 5, 6}, //row -3
        //                 {2, 1} //row -4
        //             };

        int[][] arr;
        arr = new int[4][];
        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int[5];
        arr[3] = new int[2];

        //row 1
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[0][3] = 4;
        //row 2
        arr[1][0] = 1;
        arr[1][1] = 2;
        arr[1][2] = 3;
        //row 3
        arr[2][0] = 2;
        arr[2][1] = 3;
        arr[2][2] = 4;
        arr[2][3] = 5;
        arr[2][4] = 6;
        //row 4
        arr[3][0] = 2;
        arr[3][1] = 1;
        
        // System.out.println(arr.length); // -> 4
        // System.out.println(arr[0].length); // -> 4
        // System.out.println(arr[1].length); // -> 3
        // System.out.println(arr[2].length); // -> 5
        // System.out.println(arr[3].length); // -> 2

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + ", ");
            }
            System.out.println();
        }

    }
}