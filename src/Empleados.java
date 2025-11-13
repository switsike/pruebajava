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
			horastrabajadas+=horas[i];
			System.out.println("Empleado: "+nombres[i]+" Horas trabajadas: "+horas[i]);
			System.out.println("promedio de horas trabajadas: "+horastrabajadas/numeroEmpleados);
		}

		
	}
}