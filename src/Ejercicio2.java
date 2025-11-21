import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] monedas = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int mil=0;
        System.out.println("Dame la cantidad: ");
        int cantidad=sc.nextInt();
        for(int i=0;i<monedas.length;i++)
        {
            if(cantidad%monedas[i]==0)
            {
                mil++;
            }
            System.out.println("Se necesitan "+mil+" monedas de "+monedas[i]+" pesos");
           

        }

        
    }
}
