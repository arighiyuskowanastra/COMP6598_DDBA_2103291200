import java.util.Scanner;

public class kelompok {
  public static void main(String[] args) {
      
    Scanner input = new Scanner(System.in);
	//deklarasi
    int width, rows;
		//input variable
         System.out.print("Masukkan Tinggi Trapesium : ");
         rows  = input.nextInt();
         System.out.print("Masukkan Luas Alas Trapesium : ");
         width  = input.nextInt();
        
		//kondisi
        for (int i = rows - 1; i >= 0; --i)
        {
            int blocks = width - i * 2;
            for (int j = 0; j < i; ++j)
            {
              System.out.print(" ");
            }
            for (int j = 0; j < blocks; ++j)
            {
			  //print
              System.out.print("X");
            }
			//output
            System.out.println();
        }

    }
}
