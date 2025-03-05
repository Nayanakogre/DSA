public class patterns {

    public static void main(String[] args) {
        int i,j,rows=5;

        for(i=1;i<=rows;i++)
        {
            for(j=i;j<=rows;j++){
                System.out.print("* ");
            
            }
            System.out.println();                                                                     
        }
        System.out.println("--------------------------------------------");
    

    for(i=rows;i>=1;i--){
        for(j=i;j<=rows;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
  System.out.println("-------------------------------------------------------------");  

}
}