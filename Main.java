package pilhas;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	private int tamMaximo;
	private char[] dados;
	private int topo;
	
	public Main(int tam) {
		tamMaximo = tam;
		dados = new char[tam];
		topo = -1;
	}
	
	public boolean vazia() {
		if(topo == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean cheia() {
		if(topo == (tamMaximo-1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public char top() {
		return dados[topo];
	}
	
	public boolean push(char valor) {
		if(cheia()) {
			return false;
		}
		topo++;
		dados[topo] = valor;
		return true;
	}
	
	public char pop() {
		if(vazia()) {
			return 0;
		}
		topo--;
		return dados[topo];
	}
	
	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		
		do {
			String expressao = input.nextLine();
			int tamanho = expressao.length();
				
				Main pilha1 = new Main(tamanho);
				Main pilha2 = new Main(tamanho);
				boolean incorrect = false;
				
				for(int i = 0; i < tamanho; i++) {
				  char item = expressao.charAt(i);
				  	  if(item == '(') {
				  		  if(i == tamanho-1) {
				  			  incorrect = true;
				  		  }
						  pilha1.push(item);
					  }
					  else if(item == ')') {
						  if(i == 0) {
							  incorrect = true;
						  }
						  pilha2.push(item);
					  }
				}
				
					
				if(pilha1.vazia() && pilha2.vazia()) {
					
				}
				else if(pilha1.topo == pilha2.topo && incorrect == false) {
					System.out.println("correct");
				}
				else if(incorrect) {
					System.out.println("incorrect");
				}
				else {
					System.out.println("incorrect");
				}
			
		}while(input.hasNext());
	}
}