package br.com.fiap.investimento.test;

import javax.swing.JOptionPane;

import br.com.fiap.investimento.business.AplicacaoBusiness;
import br.com.fiap.investimento.model.Fundo;
import br.com.fiap.investimento.model.InvestidorPF;

public class AplicacaoTest {

	public static void main(String[]args) {
		try {
			
			double valor = 100;
			
			InvestidorPF investidorPF = new InvestidorPF(1, "Flavio");
			Fundo fundo = new Fundo(1, "Fundo 1");
			
			AplicacaoBusiness aplicacaoBusiness  = new AplicacaoBusiness();
			aplicacaoBusiness.aplicar(fundo, investidorPF, valor);
			
			JOptionPane.showMessageDialog(null, "Aplicação efetuada com sucesso");
			
		}catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
			
		}
	}
}
