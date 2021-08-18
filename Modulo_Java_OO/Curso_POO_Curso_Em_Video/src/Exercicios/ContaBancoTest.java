package Exercicios;

public class ContaBancoTest {

	public static void main(String[] args) {
		
		System.out.println("Jubileu: ");
		ContaBanco jubileu = new ContaBanco(10.00, false);
		
		System.out.println(jubileu.abrirConta("Jubileu", "cp"));
		
		System.out.println(jubileu.fecharConta());
		
		System.out.println(jubileu.depositar(300.00));
		
		System.out.println(jubileu.sacar(450.01));
		
		System.out.println(jubileu.sacar(125.00));
		
		System.out.println(jubileu.pagarMensal());
		System.out.println(jubileu.pagarMensal());
		
		
		System.out.println("");
		jubileu.statusBancario();
		System.out.println("");

		System.out.println("Creusa: ");
		ContaBanco creusa = new ContaBanco(10.00, false);
		
		creusa.abrirConta("Creusa", "cc");		
		creusa.fecharConta();		
		creusa.depositar(500.00);	
		creusa.sacar(550.01);		
		creusa.sacar(125.00);		
		creusa.pagarMensal();
		creusa.pagarMensal();		
		
		creusa.statusBancario();

	}

}
