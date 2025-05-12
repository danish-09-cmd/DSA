public class movezerotoend {
    public static void main (String []args){
        int [] array={0,1,54,0,0,0,58,5,4,9,0};

        int index=0;
        for (int i=0; i< array.length; i++) {
            if (array[i]!=0){
                array[index]=array[i];
                index++;
            }
        }
        while(index<array.length){
            array[index]=0;
            index++;
        }

        System.out.println("array after moving to end:");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
