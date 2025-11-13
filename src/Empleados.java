import java.util.Scanner;
public class Empleados
{
	public static void main(String[] args) {
		int numeroEmpleados=3;
		Scanner sc=new Scanner(System.in);
		String[] nombres=new String[numeroEmpleados];
		int [] horas=new int[numeroEmpleados];
		int horastrabajadas=0;
		int i;
		double suma=0;

		System.out.println("Longitud de la array: "+numeroEmpleados);
		for(i=0;i<numeroEmpleados;i++)
		{
			System.out.println("Introduce el nombre del empleado:");
			nombres[i]=sc.nextLine();
			System.out.println("Introduce las horas trabajadas:");
			horas[i]=sc.nextInt();
			sc.nextLine();
		}
		for(i=0;i<numeroEmpleados;i++)
		{
			suma=suma+horas[i];
			System.out.println("Empleado "+(i+1)+": "+nombres[i]+" Horas trabajadas: "+horas[i]+" Se le pagara: "+(horas[i]*50)+" Pesos");
			
		}
		System.out.printf("promedio de horas trabajadas: %.2f",suma/numeroEmpleados);

		
	}
}