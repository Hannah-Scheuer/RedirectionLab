import java.util*;
public class MakeStars{

  public static void main( String[]args ){
      //use the standard input (terminal input)
      //as the string that you read from
      Scanner n = new Scanner( System.in );
      while (n.hasNextLine()){
        Scanner s = new Scanner (n.nextLine())
        String temp = "";
        temp = s.next();
        for (int i=0; i< temp.length();i++){
          System.out.print("*");
        }
        System.out.print(" ");
      }
      //use hasNextLine()/nextLine() to loop over
      //all of the data

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()

  }

}
