import java.util.Arrays;

public class sortarray {
    public static void main (String [] args ){
        int [] array={45,31,12,89,65,45};
        Arrays.sort(array);
        System.out.println("Array in Ascending Order"+Arrays.toString(array));

        int [] descending= new int [array.length];
        for (int i=0; i<array.length; i++){
            descending[i]=array[array.length-1-i];
        }
        System.out.println("Array in Descending Order"+Arrays.toString(descending));

    }
}
