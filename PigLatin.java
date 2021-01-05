import java.util.*;
public class PigLatin{

  public static void main( String[]args ){
    Scanner n = new Scanner( System.in );
    while (n.hasNextLine()){
      Scanner s = new Scanner (n.nextLine());
      String temp = "";
      while (s.hasNext()){
        temp = s.next();
        System.out.print(pigLatinBest(temp));
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    if (s.length()==1){
      return s + "hay";
    }
    char[] vowels = new char[]{'a','e','i','o','u'};
    char start = s.charAt(0);
    boolean vowel = false;
    for (int i =0; i<4;i++){
      if (start == vowels[i]){
        vowel = true;
      }
    }
    String out = "";
    if (vowel){
      out = s + "hay";
    }
    else{
      out = s.substring(1)+ Character.toString(start) + "ay";
    }
    return out;
  }


  public static String pigLatin(String s){
    s = s.toLowerCase();
    if (s.length()==1){
      return s + "hay";
    }
    char[] vowels = new char[]{'a','e','i','o','u'};
    char start = s.charAt(0);
    boolean vowel = false;
    for (int i =0; i<4;i++){
      if (start == vowels[i]){
        vowel = true;
      }
    }
    String[] diagraphs = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    String starting = s.substring(0,2);
    boolean dia = false;
    for (int i =0; i<diagraphs.length;i++){
      if (starting.equals(diagraphs[i])){
        dia = true;
      }
    }

    String out = "";
    if (vowel){
      out = s + "hay";
    }
    else if (dia){
      out = s.substring(2) + starting + "ay";
    }
    else{
      out = s.substring(1)+ Character.toString(start) + "ay";
    }
    return out;
  }

  public static String pigLatinBest(String s){
    s = s.toLowerCase();
    if (s.length()==1){
      return s + "hay";
    }
    char[] vowels = new char[]{'a','e','i','o','u'};
    char start = s.charAt(0);
    boolean vowel = false;
    for (int i =0; i<4;i++){
      if (start == vowels[i]){
        vowel = true;
      }
    }
    String[] diagraphs = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    String starting = s.substring(0,2);
    boolean dia = false;
    for (int i =0; i<diagraphs.length;i++){
      if (starting.equals(diagraphs[i])){
        dia = true;
      }
    }
    char ending = s.charAt(s.length()-1);
    boolean special = false;
    if (!Character.isLetter(ending)&&!Character.isDigit(ending)){
      special = true;
    }

    String out = "";
    if (special){
      if (!Character.isLetter(start)){
        out = s;
      }
      else if (vowel){
        out = s.substring(0,s.length()-1) + "hay" + ending;
      }
      else if (dia){
        out = s.substring(2,s.length()-1) + starting + "ay" + ending;
      }
      else{
        out = s.substring(1,s.length()-1)+ Character.toString(start) + "ay"+ending;
      }
    }
    else{
      if (!Character.isLetter(start)){
        out = s;
      }
      else if (vowel){
        out = s + "hay";
      }
      else if (dia){
        out = s.substring(2) + starting + "ay";
      }
      else{
        out = s.substring(1)+ Character.toString(start) + "ay";
      }
    }
    return out;
  }

}
