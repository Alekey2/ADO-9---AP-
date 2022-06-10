public class Main {
    public static void main(String[] args){
        int soma =0;
        
        int a[][] = {{8,2},{5,3},{5,2}};
         System.out.println("PRIMEIRA MATRIZ\n");
            for (int i=0;i<3;i++){
	            for(int j=0;j<2;j++){
	                System.out.println("Linha "+i+" Colunas "+j);
	                System.out.println(a[i][j]);
	        }
	        System.out.println("");
         }
        
	    int b [][] = {{7,5},{3,5},{6,4}};
	        System.out.println("SEGUNDA MATRIZ\n");
             for (int i=0;i<3;i++){
	             for(int j=0;j<2;j++){
                    System.out.println("Linha "+i+" Colunas "+j);
                     System.out.println(b[i][j]);
	        }
	         System.out.println("");
	     }
	   
	    
	     System.out.println("O resultado da soma das Matrizes é: ");
            for (int i=0;i<3;i++){
	            for(int j=0;j<2;j++){
	                soma += a[i][j]+b[i][j];
      
            }
            
                }  
                System.out.println(soma);
}
}




