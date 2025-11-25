import java.util.Random;
public class Ejercicio3 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] numeros=new int[500];
        for(int i=0;i<numeros.length;i++)
            {
                numeros[i]=random.nextInt(10);
                for(int num:numeros){
                    if(num==0){
                        System.out.println("Cero");
                    }
                    else if(num==1){
                        System.out.println("Uno");
                    }
                    else if(num==2){
                        System.out.println("Dos");
                    }
                    else if(num==3){
                        System.out.println("Tres");
                    }
                    else if(num==4){
                        System.out.println("Cuatro");
                    }
                    else if(num==5){
                        System.out.println("Cinco");
                    }
                    else if(num==6){
                        System.out.println("Seis");
                    }
                    else if(num==7){
                        System.out.println("Siete");
                    }
                    else if(num==8){
                        System.out.println("Ocho");
                    }
                    else if(num==9){
                        System.out.println("Nueve");
                }
                
                
            }

    }
    
}
