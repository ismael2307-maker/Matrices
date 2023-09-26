public class Matriz3 {
    public static void main(String[] args){
   
        int[][] Matriz=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Matriz[i][j]=(i*Matriz.length)+(j+1);
                System.out.print(Matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
