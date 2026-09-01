/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor em real para ser convertido: ");
		double ValorReal = scanner.nextDouble();
		ValorReal=ValorReal*5.49;
		System.out.println("O valor em Dolar eh: " + ValorReal);
		
	}
}
