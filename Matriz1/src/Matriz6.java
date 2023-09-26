import java.util.Scanner;
public class Matriz6 {
 public static void main(String[]args){
    Scanner x=new Scanner (System.in);
    int opcion;
    int [][] Matriz = new int[4][4];
    int fila,columna;

    do{
      System.out.println("1.-Rellenar Matriz 2.-Suma de una fila 3.-Suma de una columna 4.-Suma de la diagonal principal 5.-Diagonal secundaria");
      System.out.println("6.-La media de todos los valores de la matriz 7.-Salir");
        System.out.println(" ");
      System.out.print("Seleccione su opcion = ");
      opcion=x.nextInt();

      switch(opcion){
        case 1:{
       //Relleno de la matriz
       for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            System.out.print("Digite los elementos de la matriz1 ["+i+"] ["+j+"] = ");
            Matriz[i][j]=x.nextInt();
        }
       }
        break;
        }
        case 2:{
            int suma=0;
            System.out.println("Seleccione una fila ");
            fila=x.nextInt();
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    suma +=Matriz[fila][j];
                    System.out.println("La suma de los valores de la fila "+fila+" es: "+suma);
                }
                
            }
         break;
        }
        
        }
      

    }while(opcion<=0 || opcion != 7);

    

  x.close();
 }   
}
