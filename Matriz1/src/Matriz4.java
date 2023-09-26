import java.util.Scanner;
public class Matriz4 {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        
        System.out.println("Digite el numero de columnas");
        int ncolumnas=x.nextInt();
        
        while(ncolumnas<=0){
         System.out.println("No puede meter numeros negativos");
         System.out.println("Digite el numero de columnas de nuevo");
         ncolumnas=x.nextInt();  
        }
       int[][]matriz=new int[5][ncolumnas];

       for(int i=0;i<5;i++){
        for(int j=0;j<ncolumnas;j++){
         matriz[i][j]=(int)(Math.random()*10);
         System.out.print("["+matriz[i][j]+"]");

        }
        System.out.println(" ");
       }
       x.close();
    } 
}
