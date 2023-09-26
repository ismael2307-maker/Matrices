import java.util.Scanner;
public class Matriz5 {
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);
        int filas1,filas2,columnas1,columnas2,ola=1;

        while(ola==1){
        do{
        System.out.println("Digite los valores de las filas de la MatrizA");
        filas1=x.nextInt();
        }while(filas1<=0 || filas1>5);

        do{
        System.out.println("Digite los valores de las columnas de la MatrizA");
        columnas1=x.nextInt();
        }while(columnas1<=0 || columnas1>5);

        do{
        System.out.println("Digite los valores de las filas de la MatrizB");
        filas2=x.nextInt();
        }while(filas2<=0 || filas2>5);

        do{
        System.out.println("Digite los valores de las columnas de la MatrizB");
        columnas2=x.nextInt();
        }while(columnas2<=0 || columnas2>5);

        if((filas1 != filas2 || filas2 != filas1) || (columnas1 != columnas2 || columnas2 != columnas1) ){
            System.out.println("No se pueden realizar la suma de matrices. Deben de tener las mismas dimensiones");
        }else{
            int [][] MatrizA=new int[filas1][columnas1];
            int[][] MatrizB=new int[filas2][columnas2];
            int[][] Suma=new int[filas1][columnas1];

            //Primer Matriz
            for(int i=0;i<filas1;i++){
                for(int j=0;j<columnas1;j++){
                 System.out.print("Digite los elementos de la matriz1 ["+i+"] ["+j+"] = ");
                 MatrizA[i][j]=x.nextInt();
                }
             }
             System.out.println(" ");
             //Segunda Matriz
             for(int i=0;i<filas2;i++){
                for(int j=0;j<columnas2;j++){
                 System.out.print("Digite los elementos de la matriz2 ["+i+"] ["+j+"] = ");
                 MatrizB[i][j]=x.nextInt();
                }
             }
              //Suma
              for(int i=0;i<filas1;i++){
                for(int j=0;j<columnas1;j++){
                Suma[i][j]=MatrizA[i][j]+MatrizB[i][j];
                }
             }

             for(int i=0;i<filas1;i++){
                for(int j=0;j<columnas1;j++){
                 System.out.print("["+Suma[i][j]+"]"); 
                }
                System.out.println(" ");
             }

        }
        System.out.println("¿Quiere seguir usando el programa?");
        System.out.println("Aprieta 1 para Seguir");
        System.out.println("Aprieta 2 para Salir");
        ola=x.nextInt();
        if(ola==2){
            System.out.println("Muchas Gracias. Vuelva pronto");
        }
    }

        x.close();
    }
}
