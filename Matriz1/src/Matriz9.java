import java.util.Scanner;
public class Matriz9 {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
    int filas,columnas,Suma=0;
    double promedio=0,operacion;

    do{
        System.out.println("Digite la cantidad de filas");
        filas=x.nextInt();
        }while(filas<=0 || filas>5);

         do{
         System.out.println("Digite la cantidad de columnas");
         columnas=x.nextInt();
        }while(columnas<=0 || columnas>5);

        int[][]Matriz=new int[filas][columnas];

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print("Digite el precio ["+i+"] ["+j+"] = ");
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
                Suma=Suma+Matriz[i][j];
            }
          }
          System.out.println("La suma es: "+Suma);
          operacion=filas*columnas;
          promedio=Suma/operacion;
            System.out.println("El promedio es: "+promedio);


     x.close();
    }
    
}
