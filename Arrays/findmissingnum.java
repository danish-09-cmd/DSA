public class findmissingnum {
    public static int findmissing(int [] array, int n){
        int expectednum = n*(n+1)/2;

        int originalnum = 0;
        for (int num:array){
            originalnum+=num;
        }
        return expectednum-originalnum;
    }
    public static void main (String [] args ){
        int [] array={1,2,3,4,6,7,8,9};
        int n=9;

        int result=findmissing(array,n);
        System.out.println("The missing number in the array :"+result);
    }
    
}
