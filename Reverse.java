
/**
 * A guess the password program.
 *
 * @author Andrew Rodriguez
 * @version 11/20/18
 */
public class Reverse
{
    public static final String SECRET_PASSWORD = "JOEYBEANZZ";
    
    static String obfuscate(String input)
    {
        return input.replace('J', 'Q').concat("YEEHAW").replace('B', 'E').concat("COWBOY");
    }
    
    public static void main(String [] args)
    {
        if (args.length != 1)
        {
            System.out.println("Wrong! You have to run this program with one argument:\njava Reverse <argument>");
            return;
        }
        
        if (args[0].equals(obfuscate(SECRET_PASSWORD)))
        {
            System.out.println("You win! Congratulations!");
        }
        else 
        {
            System.out.println("Wrong password! Try again!");
        }
    }
}
