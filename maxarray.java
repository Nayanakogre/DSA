public class maxarray {
    public static void main(String[] args) {

        int[] numbers={4 ,6,23,6,99,77,-1,8,87,-4,23};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=numbers.length-1;i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
        }
        System.out.println(max);
    }
}