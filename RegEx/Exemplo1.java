package teste.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Exemplo1 {
 
 public static void main(String[] args) {
 
  // O padr�o ser� "es"
  Pattern pattern = Pattern.compile("es");
  // O texto ser� "busca simples"
  Matcher matcher = pattern.matcher("busca simples");
  while (matcher.find()) {
   System.out.println(matcher.start() + " - " + matcher.group());
  }
 
  }
 
}