import java.util.Scanner;

public class App {
   public static boolean igualdad;

   public static void main(String[] args) throws Exception {
      Scanner x = new Scanner(System.in);
      int Opcion, ola = 1, intentos = 0;

      while (ola == 1) {

         System.out.println(
               "1.-Igualdad de matrices 2.-Suma de Matrices 3.-Generar una Matriz 0 4.-Inverso aditivo de una matriz 5.-Resta matrices");
         System.out.println(
               "6.-Escalar por una matriz 7.-Multiplicar dos matrices 8.-Matriz identidad 9.-Inversa 10.-Determinante");
         System.out.println("Seleccione su opcion");
         Opcion = x.nextInt();

         while (Opcion <= 0 && intentos < 3) {
            intentos++;
            System.out.println("No se puedes digitar numeros negativos");
            System.out.println("Seleccione su opcion de nuevo");
            Opcion = x.nextInt();
         }
         if (intentos == 3) {
            System.out.println("Ha intentado muchas veces, regresa mas tarde");
            break;
         }

         switch (Opcion) {
            case 1: {
               int dimensiones;
               System.out.println("Digite las dimensiones de la matriz");
               dimensiones = x.nextInt();
               while (dimensiones <= 0 && intentos < 3) {
                  intentos++;
                  System.out.println("No se puedes digitar numeros negativos");
                  System.out.println("Digite las dimensiones de la matriz de nuevo");
                  dimensiones = x.nextInt();
               }
               if (intentos == 3) {
                  System.out.println("Ha intentado muchas veces, regresa mas tarde");
                  break;
               }
               int[][] Matriz1 = new int[dimensiones][dimensiones];
               int[][] Matriz2 = new int[dimensiones][dimensiones];

               for (int i = 0; i < Matriz1.length; i++) {
                  for (int j = 0; j < Matriz1.length; j++) {
                     System.out.print("Digite los elementos de la matriz1 [" + i + "] [" + j + "] = ");
                     Matriz1[i][j] = x.nextInt();
                  }
               }
               System.out.println(" ");
               // Segunda Matriz
               for (int i = 0; i < Matriz2.length; i++) {
                  for (int j = 0; j < Matriz2.length; j++) {
                     System.out.print("Digite los elementos de la matriz2 [" + i + "] [" + j + "] = ");
                     Matriz2[i][j] = x.nextInt();
                  }
               }

               for (int i = 0; i < dimensiones; i++) {
                  for (int j = 0; j < dimensiones; j++) {
                     if (Matriz1[i][j] != Matriz2[i][j]) {
                        igualdad = false;
                     } else {
                        igualdad = true;
                     }
                  }
               }
               if (igualdad) {
                  System.out.println("Ambas matrices son iguales");

               } else {
                  System.out.println("Ambas matrices no son iguales");
               }

            }
               break;

            case 2: {
               int dimensiones;
               System.out.println("Digite las dimensiones de la matriz");
               dimensiones = x.nextInt();
               while (dimensiones <= 0 && intentos < 3) {
                  intentos++;
                  System.out.println("No se puedes digitar numeros negativos");
                  System.out.println("Digite las dimensiones de la matriz de nuevo");
                  dimensiones = x.nextInt();
               }
               if (intentos == 3) {
                  System.out.println("Ha intentado muchas veces, regresa mas tarde");
                  break;
               }
               int[][] Matriz1 = new int[dimensiones][dimensiones];
               int[][] Matriz2 = new int[dimensiones][dimensiones];
               int[][] Suma = new int[dimensiones][dimensiones];

               // Primer Matriz
               for (int i = 0; i < Matriz1.length; i++) {
                  for (int j = 0; j < Matriz1.length; j++) {
                     System.out.print("Digite los elementos de la matriz1 [" + i + "] [" + j + "] = ");
                     Matriz1[i][j] = x.nextInt();
                  }
               }
               System.out.println(" ");
               // Segunda Matriz
               for (int i = 0; i < Matriz2.length; i++) {
                  for (int j = 0; j < Matriz2.length; j++) {
                     System.out.print("Digite los elementos de la matriz2 [" + i + "] [" + j + "] = ");
                     Matriz2[i][j] = x.nextInt();
                  }
               }
               // Suma
               for (int i = 0; i < Suma.length; i++) {
                  for (int j = 0; j < Suma.length; j++) {
                     Suma[i][j] = Matriz1[i][j] + Matriz2[i][j];
                  }
               }

               // Resultados
               for (int i = 0; i < dimensiones; i++) {
                  for (int j = 0; j < dimensiones; j++) {
                     System.out.print("[" + Suma[i][j] + "]");
                  }
                  System.out.println(" ");
               }
               break;
            }
            case 3: {
               int filas, columnas;

               System.out.print("Digite el valor de las filas: ");
               filas = x.nextInt();
               while (filas <= 0 && intentos < 3) {
                  intentos++;
                  System.out.println("No se puedes digitar numeros negativos");
                  System.out.println("Digite el valor de las filas de nuevo");
                  filas = x.nextInt();
               }
               if (intentos == 3) {
                  System.out.println("Ha intentado muchas veces, regresa mas tarde");
                  break;
               }

               System.out.print("Digite el valor de las columnas");
               columnas = x.nextInt();
               while (columnas <= 0 && intentos < 3) {
                  intentos++;
                  System.out.println("No se puedes digitar numeros negativos");
                  System.out.println("Digite el valor de las columnas de nuevo");
                  columnas = x.nextInt();
               }
               if (intentos == 3) {
                  System.out.println("Ha intentado muchas veces, regresa mas tarde");
                  break;
               }
               // Rellenamos la matriz
               int[][] Matriz = new int[filas][columnas];
               for (int i = 0; i < filas; i++) {
                  for (int j = 0; j < columnas; j++) {
                     Matriz[i][j] = 0;
                  }
               }

               System.out.println("La matriz es :");
               for (int i = 0; i < filas; i++) {
                  for (int j = 0; j < columnas; j++) {
                     System.out.print("[" + Matriz[i][j] + "]");
                  }
                  System.out.println(" ");
               }
               break;
            }
            case 4: {
               int filas, columnas;

               System.out.print("Digite el valor de las filas: ");
               filas = x.nextInt();

               while (filas <= 0 && intentos < 3) {
                  intentos++;
                  System.out.println("No se puedes digitar numeros negativos");
                  System.out.println("Digite el valor de las filas de nuevo: ");
                  filas = x.nextInt();
               }
               if (intentos == 3) {
                  System.out.println("Ha intentado muchas veces, regresa mas tarde");
                  break;
               }

               System.out.print("Digite el valor de las columnas: ");
               columnas = x.nextInt();
               while (columnas <= 0 && intentos < 3) {
                  intentos++;
                  System.out.println("No se puedes digitar numeros negativos");
                  System.out.println("Digite el valor de las columnas de nuevo: ");
                  columnas = x.nextInt();
               }
               if (intentos == 3) {
                  System.out.println("Ha intentado muchas veces, regresa mas tarde");
                  break;
               }
               int[][] Matriz = new int[filas][columnas];
               int[][] inversoAditivo = new int[filas][columnas];

               for (int i = 0; i < filas; i++) {
                  for (int j = 0; j < columnas; j++) {
                     System.out.print("Digite los elementos de la matriz1 [" + i + "] [" + j + "] = ");
                     Matriz[i][j] = x.nextInt();
                     inversoAditivo[i][j] = -Matriz[i][j];
                  }
               }
               System.out.println("Matriz original: ");
               for (int i = 0; i < filas; i++) {
                  for (int j = 0; j < columnas; j++) {
                     System.out.print("[" + Matriz[i][j] + "]");
                  }
                  System.out.println("");
               }
               System.out.print("");

               System.out.println("Matriz con inverso aditivo: ");
               for (int i = 0; i < filas; i++) {
                  for (int j = 0; j < columnas; j++) {
                     System.out.print("[" + inversoAditivo[i][j] + "]");
                  }
                  System.out.println("");
               }
               break;
            }
            case 5: {
               int dimensiones;
               System.out.println("Digite las dimensiones de la matriz");
               dimensiones = x.nextInt();
               while (dimensiones <= 0 && intentos < 3) {
                  intentos++;
                  System.out.println("No se puedes digitar numeros negativos");
                  System.out.println("Digite las dimensiones de la matriz de nuevo");
                  dimensiones = x.nextInt();
               }
               if (intentos == 3) {
                  System.out.println("Ha intentado muchas veces, regresa mas tarde");
                  break;
               }
               int[][] Matriz1 = new int[dimensiones][dimensiones];
               int[][] Matriz2 = new int[dimensiones][dimensiones];
               int[][] Resta = new int[dimensiones][dimensiones];

               // Primer Matriz
               for (int i = 0; i < Matriz1.length; i++) {
                  for (int j = 0; j < Matriz1.length; j++) {
                     System.out.print("Digite los elementos de la matriz1 [" + i + "] [" + j + "] = ");
                     Matriz1[i][j] = x.nextInt();
                  }
               }
               System.out.println(" ");
               // Segunda Matriz
               for (int i = 0; i < Matriz2.length; i++) {
                  for (int j = 0; j < Matriz2.length; j++) {
                     System.out.print("Digite los elementos de la matriz2 [" + i + "] [" + j + "] = ");
                     Matriz2[i][j] = x.nextInt();
                  }
               }
               // Resta
               for (int i = 0; i < Resta.length; i++) {
                  for (int j = 0; j < Resta.length; j++) {
                     Resta[i][j] = Matriz1[i][j] - Matriz2[i][j];
                  }
               }

               // Resultados
               for (int i = 0; i < dimensiones; i++) {
                  for (int j = 0; j < dimensiones; j++) {
                     System.out.print("[" + Resta[i][j] + "]");
                  }
                  System.out.println(" ");
               }

               break;
            }
            case 6: {
               int nfilas, ncomlumnas, Escalar;
               System.out.print("Digite el numero de las filas de la matriz: ");
               nfilas = x.nextInt();
               while (nfilas <= 0 && intentos < 3) {
                  intentos++;
                  System.out.println("No se puedes digitar numeros negativos");
                  System.out.println("Digite el numero de las filas de la matriz de nuevo: ");
                  nfilas = x.nextInt();
               }
               if (intentos == 3) {
                  System.out.println("Ha intentado muchas veces, regresa mas tarde");
                  break;
               }
               System.out.print("Digite el numero de columnas de la matriz: ");
               ncomlumnas = x.nextInt();
               while (ncomlumnas <= 0 && intentos < 3) {
                  intentos++;
                  System.out.println("No se puedes digitar numeros negativos");
                  System.out.println("Digite el numero de Columnas de la matriz de nuevo: ");
                  ncomlumnas = x.nextInt();
               }

               if (intentos == 3) {
                  System.out.println("Ha intentado muchas veces, regresa mas tarde");
                  break;
               }

               System.out.print("Digite el numero del escalar: ");
               Escalar = x.nextInt();

               int[][] Matriz = new int[nfilas][ncomlumnas];
               int[][] MatrizK = new int[nfilas][ncomlumnas];
               // Rellenar matriz
               for (int i = 0; i < nfilas; i++) {
                  for (int j = 0; j < ncomlumnas; j++) {
                     System.out.print("Digite los elementos de la matriz [" + i + "] [" + j + "] = ");
                     Matriz[i][j] = x.nextInt();
                  }
                  System.out.println(" ");
               }
               System.out.println("Matriz original: ");
               for (int i = 0; i < nfilas; i++) {
                  for (int j = 0; j < ncomlumnas; j++) {
                     System.out.print("[" + Matriz[i][j] + "]");
                  }
                  System.out.println("");
               }

               System.out.println("Matriz con escalar");
               for (int i = 0; i < nfilas; i++) {
                  for (int j = 0; j < ncomlumnas; j++) {
                     MatrizK[i][j] = Escalar * Matriz[i][j];
                     System.out.print("[" + MatrizK[i][j] + "]");
                  }
                  System.out.println(" ");
               }

               break;
            }
            case 7: {
               int nfilas, ncomlumnas, nfilas2, ncomlumnas2;
               System.out.print("Digite el numero de las filas de la matrizA: ");
               nfilas = x.nextInt();
               while (nfilas <= 0 && intentos < 3) {
                  intentos++;
                  System.out.println("No se puedes digitar numeros negativos");
                  System.out.println("Digite el numero de las filas de la matrizA de nuevo: ");
                  nfilas = x.nextInt();
               }
               if (intentos == 3) {
                  System.out.println("Ha intentado muchas veces, regresa mas tarde");
                  break;
               }
               System.out.print("Digite el numero de columnas de la matrizA: ");
               ncomlumnas = x.nextInt();
               while (ncomlumnas <= 0 && intentos < 3) {
                  intentos++;
                  System.out.println("No se puedes digitar numeros negativos");
                  System.out.println("Digite el numero de Columnas de la matrizA de nuevo: ");
                  ncomlumnas = x.nextInt();
               }
               if (intentos == 3) {
                  System.out.println("Ha intentado muchas veces, regresa mas tarde");
                  break;
               }

               System.out.print("Digite el numero de las filas de la matrizB: ");
               nfilas2 = x.nextInt();
               while (nfilas2 <= 0 && intentos < 3) {
                  intentos++;
                  System.out.println("No se puedes digitar numeros negativos");
                  System.out.println("Digite el numero de las filas de la matrizB de nuevo: ");
                  nfilas2 = x.nextInt();
               }
               if (intentos == 3) {
                  System.out.println("Ha intentado muchas veces, regresa mas tarde");
                  break;
               }
               System.out.print("Digite el numero de columnas de la matrizB: ");
               ncomlumnas2 = x.nextInt();
               while (ncomlumnas2 <= 0 && intentos < 3) {
                  intentos++;
                  System.out.println("No se puedes digitar numeros negativos");
                  System.out.println("Digite el numero de Columnas de la matrizB de nuevo: ");
                  ncomlumnas2 = x.nextInt();
               }
               if (intentos == 3) {
                  System.out.println("Ha intentado muchas veces, regresa mas tarde");
                  break;
               }
               if (ncomlumnas != nfilas2) {
                  System.out.println("No se pueden realizar las matrices");
               } else {
                  int[][] MatrizA = new int[nfilas][ncomlumnas];
                  int[][] MatrizB = new int[nfilas2][ncomlumnas2];
                  int[][] MatrizNueva = new int[nfilas][ncomlumnas2];

                  // Matriz A
                  for (int i = 0; i < nfilas; i++) {
                     for (int j = 0; j < ncomlumnas; j++) {
                        System.out.print("Digite los elementos de la matrizA [" + i + "] [" + j + "] = ");
                        MatrizA[i][j] = x.nextInt();
                     }
                  }
                  System.out.println(" ");
                  // Matriz B
                  for (int i = 0; i < nfilas2; i++) {
                     for (int j = 0; j < ncomlumnas2; j++) {
                        System.out.print("Digite los elementos de la matrizB [" + i + "] [" + j + "] = ");
                        MatrizB[i][j] = x.nextInt();
                     }
                  }
                  // Multiplicacion de las matrices
                  for (int i = 0; i < nfilas; i++) {
                     for (int j = 0; j < ncomlumnas2; j++) {
                        for (int q = 0; q < ncomlumnas; q++) {
                           MatrizNueva[i][j] += MatrizA[i][q] * MatrizB[q][j];
                        }
                        System.out.print("[" + MatrizNueva[i][j] + "]");
                     }
                     System.out.println(" ");
                  }
               }
               break;
            }
            case 8: {
               int dimensiones;
               System.out.println("Digite las dimensiones de la matriz");
               dimensiones = x.nextInt();
               while (dimensiones <= 0 && intentos < 3) {
                  intentos++;
                  System.out.println("No se puedes digitar numeros negativos");
                  System.out.println("Digite las dimensiones de la matriz de nuevo");
                  dimensiones = x.nextInt();
               }
               if (intentos == 3) {
                  System.out.println("Ha intentado muchas veces, regresa mas tarde");
                  break;
               }
               int[][] Matriz = new int[dimensiones][dimensiones];

               for (int i = 0; i < Matriz.length; i++) {
                  Matriz[i][i] = 1;
               }
               for (int i = 0; i < Matriz.length; i++) {
                  for (int j = 0; j < Matriz.length; j++) {
                     System.out.print("[" + Matriz[i][j] + "]");
                  }
                  System.out.println(" ");
               }

               break;
            }
            case 9: {
               double deter, a00, a01, a02, a10, a11, a12, a20, a21, a22;
               int[][] Matriz = new int[3][3];
               int[][] Inversa = new int[3][3];

               for (int i = 0; i < Matriz.length; i++) {
                  for (int j = 0; j < Matriz.length; j++) {
                     System.out.print("Digite los elementos de la matriz [" + i + "] [" + j + "] = ");
                     Matriz[i][j] = x.nextInt();
                  }
               }
               System.out.println("");

               for (int i = 0; i < Matriz.length; i++) {
                  for (int j = 0; j < Matriz.length; j++) {
                     System.out.print("[" + Matriz[i][j] + "]");
                  }
                  System.out.println(" ");
               }
               deter = (Matriz[0][0] * ((Matriz[1][1] * Matriz[2][2]) - (Matriz[1][2] * Matriz[2][1])))
                     - (Matriz[0][1] * ((Matriz[1][0] * Matriz[2][2]) - (Matriz[2][0] * Matriz[1][2])))
                     + (Matriz[0][2] * ((Matriz[1][0] * Matriz[2][1]) - (Matriz[2][0] * Matriz[1][1])));
               System.out.println("");
               System.out.println("El determinante de la matriz es: " + deter);
               System.out.println("");

               if (deter != 0) {
                  a00 = ((Matriz[1][1] * Matriz[2][2] - Matriz[2][1] * Matriz[1][2])) / deter;
                  a01 = (-(Matriz[1][0] * Matriz[2][2] - Matriz[2][0] * Matriz[1][2])) / deter;
                  a02 = ((Matriz[1][0] * Matriz[2][1] - Matriz[2][0] * Matriz[1][1])) / deter;
                  a10 = (-(Matriz[0][1] * Matriz[2][2] - Matriz[2][1] * Matriz[0][2])) / deter;
                  a11 = ((Matriz[0][0] * Matriz[2][2] - Matriz[2][0] * Matriz[0][2])) / deter;
                  a12 = (-(Matriz[0][0] * Matriz[2][1] - Matriz[2][0] * Matriz[0][1])) / deter;
                  a20 = ((Matriz[0][1] * Matriz[1][2] - Matriz[1][1] * Matriz[0][2])) / deter;
                  a21 = (-(Matriz[0][0] * Matriz[1][2] - Matriz[1][0] * Matriz[0][2])) / deter;
                  a22 = ((Matriz[0][0] * Matriz[1][1] - Matriz[1][0] * Matriz[0][1])) / deter;

                  Inversa[0][0] = (int) a00;
                  Inversa[0][1] = (int) a10;
                  Inversa[0][2] = (int) a20;
                  Inversa[1][0] = (int) a01;
                  Inversa[1][1] = (int) a11;
                  Inversa[1][2] = (int) a21;
                  Inversa[2][0] = (int) a02;
                  Inversa[2][1] = (int) a12;
                  Inversa[2][2] = (int) a22;

                  for (int i = 0; i < 3; i++) {
                     for (int j = 0; j < 3; j++) {
                        System.out.print("[" + Inversa[i][j] + "]");
                     }
                     System.out.println(" ");
                  }

               } else {
                  System.out.println("No tiene inversa");
               }
               break;
            }
            case 10: {
               double deter;

               int[][] Matriz = new int[3][3];

               for (int i = 0; i < Matriz.length; i++) {
                  for (int j = 0; j < Matriz.length; j++) {
                     System.out.print("Digite los elementos de la matriz [" + i + "] [" + j + "] = ");
                     Matriz[i][j] = x.nextInt();
                  }
               }

               for (int i = 0; i < Matriz.length; i++) {
                  for (int j = 0; j < Matriz.length; j++) {
                     System.out.print("[" + Matriz[i][j] + "]");
                  }
                  System.out.println("");
               }
               deter = (Matriz[0][0] * ((Matriz[1][1] * Matriz[2][2]) - (Matriz[1][2] * Matriz[2][1])))
                     - (Matriz[0][1] * ((Matriz[1][0] * Matriz[2][2]) - (Matriz[2][0] * Matriz[1][2])))
                     + (Matriz[0][2] * ((Matriz[1][0] * Matriz[2][1]) - (Matriz[2][0] * Matriz[1][1])));
               System.out.println("");
               System.out.println("El determinante de la matriz es: " + deter);
               break;
            }
         }// switch
         System.out.println("¿Quiere seguir usando el programa?");
         System.out.println("Aprieta 1 para Seguir");
         System.out.println("Aprieta 2 para Salir");
         ola = x.nextInt();
         intentos -= 3;
         if (ola == 2) {
            System.out.println("Muchas Gracias. Vuelva pronto");
         }
      } // while ola
      x.close();
   }
}
