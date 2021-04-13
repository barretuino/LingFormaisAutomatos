package teste.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscaTelefone {

	public static void main(String[] args) {

		// Nosso padrão.
		String padrao = "\\d\\d\\d\\d-\\d\\d\\d\\d";
		
		// Nosso texto simulando uma lista cheia de telefones. (o \n é para
		// simular várias linhas)
		String lista = "12341234\n1324-1234\n9900-0000\n1234567\nXC484714";
		Pattern pattern = Pattern.compile(padrao);
		Matcher matcher = pattern.matcher(lista);
		while (matcher.find()) {
			System.out.println(matcher.start() + " - " + matcher.group());
		}

	}

}