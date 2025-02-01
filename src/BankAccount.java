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

    

    System.out.printf("Bob's final balance: $%.2f%n", x);
    }
}    


