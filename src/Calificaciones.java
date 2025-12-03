import java.util.Random;
public class Calificaciones {
    public static void main(String[]args) {
    Random rd=new Random();
    int[][] tablacal=new int[30][5];
    int calRe=0;
    int calAp=0;
    for(int i=0;i<29;i++)
      for(int j=0;j<5;j++)
      {
        int cal=rd.nextInt(11);
        if(cal>=0 && cal<=6)
        {
            calRe++;
        }
        if(cal>=7 && cal<=10)
        {
            calAp++;
        }
        tablacal[i][j]=cal;
      }
        System.out.println("------------------");
		for(int i=0; i<29; i++) {
			System.out.print("| ");
			for(int j=0; j<4; j++) {
				System.out.print(tablacal[i][j]+" | ");
			}
			System.out.println("\n-----------------");
		}
        

}
}