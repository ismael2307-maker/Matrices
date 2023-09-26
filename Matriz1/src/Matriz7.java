import java.util.Scanner;
public class Matriz7 {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int filas,columnas,SumaFI,SumaCo;

        do{
        System.out.println("Digite la cantidad de filas");
        filas=x.nextInt();
        }while(filas<=0 || filas>5);

         do{
         System.out.println("Digite la cantidad de columnas");
         columnas=x.nextInt();
        }while(columnas<=0 || columnas>5);

        int[][]Matriz=new int[filas][columnas];

        //Rellenar la matriz
        for(int i=0;i<filas;i++){
         for(int j=0;j<columnas;j++){
            System.out.print("Digite los valores de la matriz ["+i+"] ["+j+"] = ");
            Matriz[i][j]=x.nextInt();
         }
        }
       System.out.println("La matriz es: ");
       for(int i=0;i<filas;i++){
         for(int j=0;j<columnas;j++){
            System.out.print(Matriz[i][j]+" ");
         }
         System.out.println("");
        }

        for(int i=0;i<filas;i++){
            SumaFI=0;
            for(int j=0;j<columnas;j++){
                SumaFI+=Matriz[i][j];
            }
            System.out.println("La suma de la fila ["+i+"] es: "+SumaFI);
        }
         System.out.println(" ");

         for(int j=0;j<columnas;j++){
            SumaCo=0;
            for(int i=0;i<filas;i++){
                SumaCo+=Matriz[i][j];
            }
            System.out.println("La suma de la columna ["+j+"] es: "+SumaCo); 
         }
         System.out.println(" ");



     x.close();
    }
}
