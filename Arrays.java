// public class Arrays {
//     public static void main(String[] args){
        // int a[] = { 12,3,4,56,7};   creating array.
        // System.out.println(a);
        // int a[] = {12,3,4,56,7};
        // System.out.println(a[3]);     accessing element.
        // int a[] = {12,3,4,56,7};
        // int len  = a.length;          finding length of the array.
        // System.out.println(len);
    //     int[][] multiDimension = {
    //     {1,2,3},
    //     {4,5,6},
    //     {7,8,9}                       Representing 2D array
    // };
    // System.out.println(multiDimension[1][2]);
        //    String[] cars = {"volvo","BMW","Ford","Mazda"};
        //    for (int i = 0; i < cars.length;i++)
        //    System.out.println(cars[i]);
    // output:
    // volvo
    // BMW
    // Ford
    // Mazda
        // String[] cars = {"volvo","BMW","Ford","Mazda"};
        // for (String i : cars) {
        //     System.out.println(i);
            // same output will be predicted.
        // } 
        
        // int[] arrname;
        // arrname = new int[5];
        // arrname[0] = 10;
        // arrname[1] = 20;
        // arrname[2] = 30;               using SINGLE dimensional array
        // arrname[3] = 40;
        // arrname[4] = 50;
        // for(int i = 0;i < arrname.length;i++)
        //     System.out.println("Element at index" + i + ": " + arrname[i]);
// output:
// Element at index0: 10
// Element at index1: 20
// Element at index2: 30
// Element at index3: 40
// Element at index4: 50
//     }
// }

// public class Arrays {
//     public static void main(String[] args) {
//         int[][] arr ;
//         arr = new int[4][3];
//         System.out.println("length of rows:" + arr.length);
//         System.out.println("length of columns:" + arr[1].length );
//         // length of rows:4
//         // length of columns:3
//         int arrr[][] = { {1,2,3},{4,5,6},{23,34,56},{21,25,14}};
//         for(int i = 0; i < 4;i++){
//             for(int j = 0; j < 3; j++){
//               System.out.println(arrr[i][j] + " ");  
//             }
//         System.out.println();  
//         }
            
//     }
// }
// public class Arrays {
//     public static void main(String[] args){
//         int[][] matrix = {
//             {10,20,30},
//             {40,50,60},
//             {70,80,90},
//             {100,110,120}                      CREATING A 4*3 MATRIX
//         };
//         System.out.println("The matrix is:");
//         for (int i = 0;i < 4; i++){
//             for (int j = 0;j<3;j++){
//                 System.out.println(matrix[i][j] + "\t");
//             }
//             System.out.println();
//         }
//     }
// }


            //    ADDING ALL ELEMENTS IN A MATRIX
// public class Arrays {
//     public static void main(String[] args){
//         int[][] matrix = {
//             {10,20,30},
//             {40,50,60},
//             {70,80,90},
//         };
//         int sum = 0;
//         for(int i = 0;i<3;i++){
//             for(int j = 0;j<3;j++){
//                sum = sum + matrix[i][j];
//             }
//         }
//         System.out.println("Sum of elements of the matrix is: "+ sum);
//     }
    
// }

// output:
// Sum of elements of the matrix is: 450
                        // ADDITION OF 2D ARRAYS
public class Arrays {
    public static void main(String[] args){
        int[][] summ = new int[3][3];
        int[][] matrix1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            };
        int[][] matrix2 = {
            {12,13,14},
            {15,16,17},
            {21,22,23},
        };
        for(int k = 0;k<3;k++){
            for(int l = 0;l<3;l++){
                // System.out.println(matrix1[k][l]);
                // System.out.println(matrix2[k][l]);
                summ[k][l] = matrix1[k][l] + matrix2[k][l];
                // System.out.println(sum);
            }
        }
        for(int k = 0;k<3;k++){
            for(int l = 0;k<3;k++){
                System.out.println(summ[k][l]+" ");
            }
        }
        System.out.println();        
        } 

    }
