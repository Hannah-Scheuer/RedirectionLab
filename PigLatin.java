public class PigLatin{
  public static String pigLatinSimple(String s){
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


}
