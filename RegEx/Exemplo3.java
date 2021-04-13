package teste.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Exemplo3 {
 public static void main(String[] args) {
  // Esse padrão busca de a até z e A até Z.
  Matcher matcher = Pattern.compile("[a-zA-Z]").matcher(
   "A b C d x 5 7 1 - x _");
  while (matcher.find()) {
   System.out.println(matcher.start() + " - " + matcher.group());
  }
 }
}
