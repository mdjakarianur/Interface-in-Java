interface Bank{
 double account();
} 
public class SIBL implements Bank{
 public double account ()
 {
 System.out.println("Account System in SIBL”);
 }
} 

public class DBBL implements Bank{
 public double account ()
 {
 System.out.println("Account System in DBBL”);
 }
}

class TestInterface{
 public static void main(String[] args){
 SIBL b=new SIBL();
 b. account ();
 DBBL d=new DBBL();
 d. account ();
 }
}
