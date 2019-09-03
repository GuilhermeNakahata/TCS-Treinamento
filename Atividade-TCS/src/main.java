import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		System.out.println(" Digite \n 1 para moto \n 2 para carro \n 3 para caminhao");
		Scanner sc = new Scanner(System.in);
		int Decisao = sc.nextInt();
		menu Menu = new menu(Decisao);
		
	}
}
