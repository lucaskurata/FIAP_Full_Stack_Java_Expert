package br.com.fiap.investimento.test;

import java.util.List;
import br.com.fiap.investimento.dao.InvestidorPFDAO;
import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidoresPdfListaTest {

	public static void main(String[] args) {

		try {
			InvestidorPFDAO dao = new InvestidorPFDAO();
			List<InvestidorPF> lista = dao.listarTodos();
	
			for (InvestidorPF investidorPF : lista) {
				System.out.println(investidorPF);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
