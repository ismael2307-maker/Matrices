import java.util.Scanner;
public class Matriz8 {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int filas,columnas;
        do{
            System.out.println("Digite la cantidad de filas");
            filas=x.nextInt();
            }while(filas<=0 || filas>5);
    
             do{
             System.out.println("Digite la cantidad de columnas");
             columnas=x.nextInt();
            }while(columnas<=0 || columnas>5);
    
            int[][]Matriz=new int[filas][columnas];
            int suma=0;
    
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
            for(int j=0;j<columnas;j++){
                suma=suma+Matriz[i][j];
            }
        }
        System.out.print("La suma es: "+suma);

        x.close();
    }
}
