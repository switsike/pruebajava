
public class Empleados
{
	public static void main(String[] args) {
		int horastrabajadas=0;
		int i;
		double suma=0;
		Empleado[] empleados= new Empleado[3];
		empleados[0]= new Empleado("daniel",0);
		empleados[1]= new Empleado("Victor",2);
		empleados[2]= new Empleado("Jesus",6);

		System.out.println("Longitud de la array: "+Empleado.length);
		for(i=0;i<Empleado.length;i++)
		{
			Empleado empleadoactual= empleados[i];
			suma=suma+empleadoactual.getHoras();
		}

		for(i=0;i<empleados.length;i++)
		{
			System.out.println("Empleado "+(i+1)+": "+empleadoactual.getnombre()+" Horas trabajadas: "+empleadoactual.getHoras()+" Se le pagara: "+(empleadoactual.getHoras()*50)+" Pesos");
			
		}
		System.out.printf("promedio de horas trabajadas: %.2f",suma/3);

		
	}
}