import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int item = sc.nextInt();
		int qtde = sc.nextInt();
		
		
		double total=0;
		
		if (item==1) {
			total=qtde*4.00;
		} else if (item==2)  {
			total=qtde*4.50;
		} else if (item==3)  {
			total=qtde*5.00;
		} else if (item==4)  {
			total=qtde*2.00;
		} else if (item==5) {
			total=qtde*1.50;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();

}
}
