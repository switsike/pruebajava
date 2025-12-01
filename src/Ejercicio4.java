public class Ejercicio4 {
    public static void main(String[]args)
    {
        int[] leche={3,2,1};
        int[] panales={3,2,1};
        int[] cerveza={3,0,1};
        int[] sumatotaldia=new int[3];
        int max=-1;
        int men=0;
        for(int i=0;i<leche.length;i++)
        {
            sumatotaldia[i]=leche[i]+panales[i]+cerveza[i];
        }
        for(int i=0;i<sumatotaldia.length;i++)
        {
            if(sumatotaldia[i]>max)
            {
                max=i + 1;
                men=sumatotaldia[i];
            }
        }
        for(int i=0;i<sumatotaldia.length;i++)
        {
            if(sumatotaldia[i]<=men)
            {
                men= i + 1;
            }
        }
        System.out.println("El dia que hubo mas ventas fue el dia "+max);
        System.out.println("El dia que hubo mas ventas fue el dia "+men);

    }
}
