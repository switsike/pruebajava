import java.util.Scanner;
public class Trabajadores {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        Trabajador[] trabajadores = new Trabajador[3];
 
        for (i = 0; i < trabajadores.length; i++) {
            System.out.print("Dame el nombre del trabajador: ");
            String nombre=sc.nextLine();
            System.out.print("Horas trabajadas por "+nombre+": ");
            int horas=sc.nextInt();
            System.out.print("Sexo (H/M): ");
            char sexo=sc.next().charAt(0);
            sc.nextLine();
            Trabajador trabajador=new Trabajador(nombre,horas,sexo);
            trabajadores[i]=trabajador;
        }
            for(i=0;i<trabajadores.length;i++){
                Trabajador trabajadoractual=trabajadores[i];
                int sueldo=trabajadoractual.getHoras()*100;
                System.out.println("Trabajador "+i+1);
                System.out.println("Nombre: "+trabajadoractual.getNombre()+": Horas trabajadas: "+trabajadoractual.getHoras()+", Sueldo a pagar: "+sueldo+" pesos");
            }

        }
    }
