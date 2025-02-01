public class BankAccount
{

    public static void main (String [] args)
{
    
   double x = 2175.37;
    x -= 302.50;
    x += 50.03;
    x -= x / 2; 
    x += 20.00;
    x -= 1.00; 
    x += x;
    x += 1.00;

    x = Math.round(x * 100.0) / 100.0;

System.out.print("Bob's final balance: " + x);
    }
}    


