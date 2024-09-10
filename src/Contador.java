import java.util.Scanner;
public class Contador extends Exception{

	public static class ParametrosInvalidosException extends Exception{}
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
			}
		
		catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}

		terminal.close();
	}
		

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois){
			throw new ParametrosInvalidosException();
		}
		
		for (int i=parametroUm; i <= parametroDois; i++){
			System.out.println("Numero:\t");
			System.out.println(i);
		}
			
	}
}
