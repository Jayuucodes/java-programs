import java. util. *;
public class stringfun
  {
  public static void main(string[]args) 
    {
      Scanner sc= new Scanner(system.in); 
        String str = sc.nextLine() ;
      System. out.println("statement is :"+str);
      int n = str. length() ;
      System. out.println("length of string is "+n) ;
      String repstr = str. replace(" " , "_") ;
      System. out.println(" replace string is :"+repstr) ;
      String substr = str. substring(0, 5) ;
      System. out.println("substring is :"+substr) ;
    System. out.println("lowercase string is:"+toLowerCase()) ;
      System. out.println("uppercase String is :"+toUpperCase() ) ;
    }
  }
