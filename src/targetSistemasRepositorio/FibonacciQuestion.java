package targetSistemasRepositorio;

//imports
import java.util.Scanner;

public class FibonacciQuestion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		
		System.out.println("Fibonacci de "+n+" = "+fib(n));
		if(eFib(n)) {
			System.out.println(n+" pertence a sequencia de Fibonacci");
		}else {
			System.out.println(n+" não pertence a sequencia de Fibonacci");
		}
		input.close();
	}

	
	/**
	 * 
	 * @param n O numero ao qual Fibonacci será calculado
	 * @return O numero da sequencia de Fibonacci referente a n
	 */
	public static int fib(int n){
		int resposta = 0;
		
		if(n == 0) {
			resposta = 0;
		}else if(n == 1) {
			resposta = 1;
		}else if(n >= 2){
			//Fibonacci é uma funcao recursiva que calcula a soma dos 2 Fibonaccis anteriores
			resposta = fib(n-1) + fib(n-2);
		}
		
		return resposta;
	}
	
	
	/**
	 * 
	 * @param n O numero que será procurado na sequencia de Fibonacci
	 * @return Retorna se o numero pertence ou não a sequencia
	 */
	public static boolean eFib(int n) {
		//Se o numero pertencer a sequencia de Fibonacci essa variavel receberá true
		boolean pertence = false;
		int cont = 0;
		
		do {
			if(fib(cont) == n) {
				pertence = true;
			}
			//passeia sequencialmente por cada numero de Fibonacci fim de achar o n entre eles
			cont++;
			
		}while(fib(cont) <= n); //Se passar para numeros já maiores que n nao precisa mais procurar
		
		return pertence;
	}
	
}
