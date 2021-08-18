package br.com.fiap.investimento.test;

import br.com.fiap.investimento.reports.PFReport;
import br.com.fiap.investimento.reports.PJReport;
import br.com.fiap.investimento.reports.Report;

public class ReportTest {

	public static void main(String[] args) {
		
		Report r1 = new PJReport();
		r1.print("//localhost/print1");
		r1.pdf();
		
		Report r2 = new PFReport();
		r2.print("//localhost/print1");
		r2.pdf();
		
		if ( r2 instanceof PFReport ) {
			System.out.println("Sim");
		}
		
		
		/*
		PFReport pfr = new PFReport();
		pfr.print("//localhost/print1");
		pfr.pdf();
		
		System.out.println("");

		PJReport pjr = new PJReport();
		pjr.print("//localhost/print1");
		pjr.pdf();
		*/
	}

}
