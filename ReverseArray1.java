public class ReverseArray1 {

    public static void main(String[] args) {
          
        int[] array={1,2,3,4,5,6};
        for(int i=0;i<array.length;i++)
        {
           
            System.out.println (+array[i]);
            
        }
        int start=0;
        int end=array.length-1;

        while(start<end)
        {
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;

            start++;
            end--;
        }
        for(int j=0;j<array.length;j++)
        {
            
            System.out.println(array[j] );
            


        }
    }
    
}
