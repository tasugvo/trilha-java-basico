import java.util.Scanner;


public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parametro:");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo parametro:");
		int parametroDois = terminal.nextInt();
		
		
		
		try {
			contar(parametroUm, parametroDois);
		}catch(ParametrosInvalidosExceptions e){
			System.out.println(e.getMessage());
		}
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosExceptions {
		
		
		if(parametroUm > parametroDois) {
			
			throw new ParametrosInvalidosExceptions("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		int contagem = parametroDois - parametroUm;
	
		for(int i=1; i <=contagem; i++) {
			System.out.println("Imprimindo o numero"+i);
		}
			
	}
	
}
