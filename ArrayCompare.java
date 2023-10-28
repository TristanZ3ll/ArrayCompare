import java.util.Arrays;
import java.util.Scanner;
public class ArrayCompare {
    
    public static void main(String[] args) throws Exception {
         
        System.out.println("Please input you first 3x3 array: ");
        int[][] array1 = inputArray();
        System.out.println("Plese input your second 3x3 array: ");
        int[][] array2 = inputArray();
        
        System.out.println("The arrays are " + (equals(array1,array2) ? "equal" : "not equal"));
    }

    public static boolean equals(int [][] m1, int[][] m2){
        boolean valid =
            (Arrays.deepEquals(m1,m2));
        return valid;
    }

    public static int[][] inputArray(){
        int [][] array;
        int [] intSplit = new int[3];
        array = new int [3][3];
        Scanner input = new Scanner(System.in);
        for(int i=0; i < 3; i++){
            System.out.println("Please enter a row ");
            String number = input.nextLine(); 
            String[] inputSplit = number.split(" ");
            for(int k = 0; k < inputSplit.length; k++){
            intSplit[k] = Integer.parseInt(inputSplit[k]);
            }
            for(int j=0; j<3; j++){
                array[i][j] = intSplit[j];
            }
        }
        
        return array;
        
    }
}
