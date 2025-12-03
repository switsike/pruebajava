import java.util.Random;
public class NumeroRepetidos {
    public static void main(String[] args) {
        Random random=new Random();
        int[] numeros=new int[500];
        int[] repetidos=new int[51];

        for(int i=0;i<numeros.length;i++)
        {
            numeros[i]=random.nextInt(50) + 1;

        }
        for (int num : numeros) {
            repetidos[num]++;
        }

        // Mostrar conteos
        for (int i = 0; i < repetidos.length; i++)
            if(repetidos[i]>0)
                System.out.println("El número " + i + " aparece " + repetidos[i] + " veces.");
        }
    }
