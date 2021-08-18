/*
Duas pessoas querem abrir uma conta no banco, o Jubileu e a Creusa. O Jubileu optou por abrir uma conta poupan�a, e ir� deposita 300 reais na sua conta. A Creusa, possuir mais dinheiro e quer depositar 500 reais em uma conta corrente. Para isso, eles precisam abrir uma conta no banco. Os atributos e m�todos da ContaBanco est�o expostos abaixo, com base nesse diagrama de classes.

Requisitos: 

1. O tipo da conta s� aceita dois caracteres, cc e cp. Conta corrente e conta poupan�a, respectivamente.
2. Na hora de abrir conta, eu mudo o status de falso para verdadeiro. � nesse momento que decido qual conta vou abrir, e caso seja uma cp j� recebe um presente de 150 reais, ou caso escolha abrir uma conta corrente, seu presente � de 50 reais.
3. Para fechar conta, o Jubileu ou a Creusa n�o v�o poder ter dinheiro dentro da sua conta.
4. Para fazer um dep�sito ou sacar, a conta j� deve ter sido aberta com status verdadeiro. No caso do saque, eu devo j� ter dinheiro dentro, e o valor do saque n�o deve ser superior ao seu saldo.
5. A mensalidade vai ser cobrada diretamente do saldo. Na hora que for chamado a mensalidade, o cliente com cc pagar� 12 reais, e o cliente com cp pagar� 20 reias de mensalidade.
6. Voc� precisar� usar o m�todo getter e setter para TODOS os atributos.
7.  � necess�rio ter um m�todo construtor, onde o seu status ser� definido como zero e o saldo definido como zero, pois a conta est� fechada.
 */

package Exercicios;

import java.util.Random;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private Double saldo;
	private boolean status;
	
	public final Double mensalidadeCc = 12.00;
	public final Double mensalidadeCp = 20.00;
		
	public ContaBanco(Double saldo, boolean status) {
		this.setStatus(false);
		this.setSaldo(0.0);
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String abrirConta(String dono, String tipo) {
		
		Random random = new Random();
		
		this.setTipo(tipo);
		this.setStatus(true);
		this.setDono(dono);
		this.setNumConta(random.nextInt(90000000 - 10000000));
		if(this.getTipo() == "cp") {
			this.setSaldo(150.00);
		}else {
			this.setSaldo(50.00);
		}
		
		return "Conta aberta com sucesso";
	}
	
	public String fecharConta() {
		if(this.getSaldo() == 0.00) {
			return "Conta fechada com sucesso!";
		}else if(this.getSaldo() < 0.00) {
			return "Erro, saldo negativo (D�bito) no valor de R$" + this.getSaldo();
		}else {
			return "Erro! A conta n�o poder� ser fechada pois h� saldo dispon�vel na conta no valor de R$" + this.getSaldo();
		}
	}
	
	public String depositar(Double valor) {
		if(this.isStatus() == true) {
			this.setSaldo(this.getSaldo() + valor);
			return "Deposito realizado com sucesso, saldo atual: " + this.getSaldo();
		}else {
			return "Erro! A conta n�o existe/desativada, tentar novamente";
		}
	}
	
	public String sacar(Double quantSacada) {
		if(this.isStatus() == true && quantSacada <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - quantSacada);
			return "Saque realizado com sucesso, saldo atual: " + this.getSaldo();
		}else {
			return "Erro! A conta n�o existe/desativada ou voc� tentou sacar dinheiro mais do que tem de saldo, tentar novamente";
		}
	}
	
	public String pagarMensal() {
		if(this.getTipo() == "cc") {
			this.setSaldo(saldo - mensalidadeCc);
			return "Mensalidade de R$" + mensalidadeCc + " cobrada referente a Conta Corrente! Saldo atual de: R$" + getSaldo();
		}else {
			this.setSaldo(saldo - mensalidadeCp);
			return "Mensalidade de R$" + mensalidadeCp + " cobrada referente a Conta Poupan�a! Saldo atual de: R$" + getSaldo();
		}
	}
	
	public void statusBancario() {
		System.out.println("Dono da conta: " + this.getDono());
		System.out.println("Status da conta: " + this.isStatus());
		System.out.println("N�mero da conta: " + this.getNumConta());
		System.out.println("Tipo da conta: " + this.getTipo());
		System.out.println(("Saldo da conta: R$" + this.getSaldo()));
	}
	
}
