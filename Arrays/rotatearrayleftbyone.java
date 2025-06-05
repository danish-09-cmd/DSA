public class rotatearrayleftbyone {
    public static void main (String[]args){
        int [] array={89,56,24,46,36,71,12,34};

        System.out.println("Array before rotating");
        for (int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }

        if (array.length<0){
            System.out.println("No rotation possible");
        }
        int firstelement=array[0];
        for (int i=0; i<array.length-1; i++){
                array[i]=array[i+1];
        }
        array[array.length-1]=firstelement;

        System.out.println("Array after rotating by one place ");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
