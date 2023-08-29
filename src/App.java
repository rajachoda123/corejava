/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        String str = "aasonybbd";
        String[] sonies = str.split("sony");
        if ( sonies[1].length() - sonies[0].length() <=1 ) {
            System.out.println("its Mid");
        } else
        {
            System.out.println("it's not Mid");
        }
    }
}
