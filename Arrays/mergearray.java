import java.util.Arrays;
public class mergearray {
    public static void main (String [] args ){
        int [] array1={10,20,30,40,50};
        int [] array2={5,15,25,35,45,55};

        int []mergedArray= new int [array1.length+array2.length];

        for (int i=0; i<array1.length; i++){
            mergedArray[i]=array1[i];
        }

        for (int i=0; i<array2.length; i++){
            mergedArray[array1.length+i]=array2[i];
        }
        System.out.println("merged array"+Arrays.toString(mergedArray));
    }
}
