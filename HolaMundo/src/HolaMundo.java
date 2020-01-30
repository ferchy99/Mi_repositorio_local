import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un numero");
		int num = teclado.nextInt();
		num*=num;
		System.out.println("El cuadrado del numero es "+num+"");

	}
}
