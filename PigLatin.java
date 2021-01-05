public class PigLatin{

  public static void main( String[]args ){
    String str = "the";
    System.out.println(pigLatin(str));
  }

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
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

}
