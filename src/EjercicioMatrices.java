public class EjercicioMatrices {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int [] [] matrizSegunda= {
            {9,8,7},
            {6,5,4},
            {3,2,1}
        };
        int[][] sumaMatriz = new int[3][3];
            for(int j=0,i=0;j<matriz.length;i++,j++){
                sumaMatriz[i][j]=matriz[i][j]+matrizSegunda[i][j];
        }
            for(int j=0;j<sumaMatriz.length;j++){
                System.out.println("La suma de la matriz en la posicion ["+j+"]["+j+"] es: "+sumaMatriz[j][j]);
            }
        
        }
    }

