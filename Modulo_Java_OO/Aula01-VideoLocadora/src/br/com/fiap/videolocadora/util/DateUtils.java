package br.com.fiap.videolocadora.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {

	public static Date stringToDate(String strData) {
		Date dataConvertida = new Date();
		try {
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			dataConvertida = formato.parse(strData);
		}catch (ParseException e) {
			e.printStackTrace();
		}
		return dataConvertida;
	}
	
	public static int calcularIdade(Date dataNascimento) {
		GregorianCalendar hoje = new GregorianCalendar(); //data atual
		
		GregorianCalendar nascimento = new GregorianCalendar(); // data nascimento
		nascimento.setTime(dataNascimento);
		
		int anoAtual = hoje.get(Calendar.YEAR);
		int anoNasc = nascimento.get(Calendar.YEAR);
		
		int idade = anoAtual - anoNasc;
		
		return idade;
	}
	
}
