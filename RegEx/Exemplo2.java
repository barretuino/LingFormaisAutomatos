package teste.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Exemplo2 {
 
 public static void main(String[] args) {
 
  Pattern pattern = Pattern.compile("ese");
  Matcher matcher = pattern.matcher("ese esese das");
  while (matcher.find()) {
   System.out.println(matcher.start() + " - " + matcher.group());
  }
 
 }
 
}