public class maxconsecutiveones {
    public static void main (String [] args ){
        int [] array={1,0,0,1,0,1,0,1,1,1,1};
        int currentCount=0, maxCount=0;

        for (int i=0; i<array.length; i++){
            if (array[i]==1){
                currentCount++;
                maxCount=Math.max(currentCount,maxCount);
            }
            else{
                currentCount=0;
            }
        }
        System.out.println("Max consecutive ones in the array "+maxCount);
    }
}
