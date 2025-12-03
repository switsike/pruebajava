import java.util.Random;
public class VentasPorMes {
    public static void main(String[]args)
    {
        int cant=51;
        Random rd=new Random();
        int[] leche=new int[31];
        int[] panales=new int[31];
        int[] cerveza=new int[31];
        int[] sumatotaldia=new int[31];
        int max=-1;
        int men=0;
        int sumaleche=0;
        int sumacer=0;
        int sumapan=0;
        int diamax=0;
        int sumamen=0;

        for(int i=0;i<leche.length;i++)
        {
            leche[i]=rd.nextInt(51);
            panales[i]=rd.nextInt(51);
            cerveza[i]=rd.nextInt(51);
        }

        for(int i=0;i<leche.length;i++)
        {
            sumatotaldia[i]=leche[i]+panales[i]+cerveza[i];
            sumaleche+=leche[i];
            sumacer+=cerveza[i];
            sumapan+=panales[i];
        }
        for(int i=0;i<sumatotaldia.length;i++)
        {
            if(sumatotaldia[i]>max)
            {
                diamax=i + 1;
                max=sumatotaldia[i];
                men=sumatotaldia[i];
            }
        }
        for(int i=0;i<sumatotaldia.length;i++)
        {
            if(sumatotaldia[i]<men)
            {
                sumamen= i + 1;
                men=sumatotaldia[i];
            }
        }
        System.out.println("El dia que hubo mas ventas fue el dia "+diamax);
        System.out.println("El dia que hubo menos ventas fue el dia "+sumamen);
        System.out.println("Total de ventas de cada producto en el mes del producto leche: "+sumaleche);
        System.out.println("Total de ventas de cada producto en el mes del producto cerveza: "+sumacer);
        System.out.println("Total de ventas de cada producto en el mes del producto pañales: "+sumapan);

    }
}
