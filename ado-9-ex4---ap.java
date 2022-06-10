public class Main
{
	public static void main(String[] args) {
	    int soma = 0;
	    int soma1 = 0;
	    int soma2 = 0;
	    int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

          System.out.println("Foram retirado os números das Linhas e Colunas mencionadas abaixo:\n ");
	      for(int i = 0; i<4;i++){
	        for(int j= 0;j<4;j++){
	            
	            if(i>0 && j<1){
	                soma += a[i][j];
	               
	                System.out.println("Linha "+i+" Colunas "+j);
	            }
	            }
	        
	        }
	        for(int i = 0; i<4;i++){
	        for(int j= 0;j<4;j++){
	            
	            if(i>=2 && j==1){
	                  soma1 += a[i][j];
	                  System.out.println("Linha "+i+" Colunas "+j);
	                  
	            }   
	            }
	        
	        }
	        
	        for(int i = 0; i<4;i++){
	        for(int j= 0;j<4;j++){
	            
	            if(i==3 && j==2){
	              soma2 = a[i][j];
	              System.out.println("Linha "+i+" Colunas "+j);
	            }
	            }
	        }
	         System.out.println("\nO resultado da soma dos elementos abaixo da diagonal principal é: ");
	         System.out.println(soma+soma1+soma2);
	             
	     
}
}



