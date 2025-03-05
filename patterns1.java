public class patterns1 {
    

        public static void main(String[] args) {
            int i,j,rows=5;
    
            for(i=0;i<=rows;i++)
            {
                for(j=i;j<=rows;j++){
                    System.out.print("* ");
                
                }
                System.out.println();                                                                     
            }
            System.out.println("--------------------------------------------");
        
    
        for(i=rows;i>=0;i++){
            for(j=i;j<=rows;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
      System.out.println("-------------------------------------------------------------");  
    
    }
    }
    

