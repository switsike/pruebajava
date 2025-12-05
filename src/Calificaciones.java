import java.util.Random;
public class Calificaciones {

    public static double promedio(int [][] m, int j)
    {
      int suma=0;
      for(int i=0; i<30; i++) {
				suma+=m[i][j];
    }
      return suma/30.0;
    }


    public static void main(String[]args) {
    Random rd=new Random();
    int[][] tablacal=new int[30][5];
    int calRe=0;
    int suma=0;
    double promediomat=0;
    for(int i=0;i<30;i++)
      for(int j=0;j<5;j++)
      {
        int cal=rd.nextInt(11);
        if(calRe==15 && cal>=0 && cal<=6)
        {
          cal=cal+7;
          if(cal>10)
          {
            int res=cal-10;
            cal=10-res;
          }
        }
        if(cal>=7 && cal<=10)
        {
          
        }
        else if(cal>=0 && cal<=6)
        {
            calRe++;
        }
        tablacal[i][j]=cal;
      }
        System.out.println("mat  qui  esp eti pro");
        System.out.println("-----------------------");
		for(int i=0; i<30; i++) {
			System.out.print("| ");
			for(int j=0; j<5; j++) {
				System.out.printf("%2d |",tablacal[i][j]);
			}
			System.out.println("\n----------------------");
		}

    System.out.printf("Promedio calificaciones matematicas: %.2f\n",promedio(tablacal,0));

}
}