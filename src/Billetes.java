import java.util.Scanner;
public class Billetes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] monedas = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int mil=0;
        System.out.println("Dame la cantidad: ");
        int cantidad=sc.nextInt();
        for(int i=0;i<monedas.length;i++)
        {
            if(cantidad%monedas[0]==0)
            {
                mil=cantidad/monedas[0];
                cantidad=cantidad-(mil*monedas[0]);
            }
            else if(cantidad%monedas[i]==0)
            {
                mil=cantidad/monedas[i];
                cantidad=cantidad-(mil*monedas[i]);
            }
            else
            {
                mil=cantidad/monedas[i];
                cantidad=cantidad-(mil*monedas[i]);
            }
            if(monedas[i]>=20){
            System.out.println("Se necesitan "+mil+" Billetes de "+monedas[i]+" pesos");
            }
            else{
            System.out.println("Se necesitan "+mil+" Monedas de "+monedas[i]+" pesos");
            }
           

        }

        
    }
}
