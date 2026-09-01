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
	    double Soma;

		System.out.println("Digite a nota1 do aluno: ");
		double ValorReal1 = scanner.nextDouble();
		System.out.println("Digite a nota2 do aluno: ");
		double ValorReal2 = scanner.nextDouble();
		System.out.println("Digite a nota3 do aluno: ");
		double ValorReal = scanner.nextDouble();
		
		Soma = ValorReal1 + ValorReal2 + ValorReal;
		Soma = Soma/3;
		
		System.out.println("O valor da media eh: " + Soma);
		
	}
}
