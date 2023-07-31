import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.next();
        System.out.println( "Enter your last name:  " );
        String lastName = console.next();
        printNameCharacters( name );
        printlastNameCharacters( lastName );
        printNameLength( name, lastName );
        printFullName(name, lastName);
        console.close();
    }

    private static void printNameLength( String name, String lastName )
    {
        System.out.println("Name length is: "+(name.length()+lastName.length()));
    }

    private static void printNameCharacters( String name )
    {
    	for(int i = 0; i<name.length(); i++) {
    		System.out.println(name.charAt(i));
    	}
    	System.out.println();
    }
    
    private static void printlastNameCharacters( String lastName )
    {
    	for(int i = 0; i<lastName.length(); i++) {
    		System.out.println(lastName.charAt(i));
    	}
    	System.out.println();
    }
    
    private static void printFullName(String name, String lastName) {
    	System.out.print("Full name is: ");
    	System.out.println(name +" "+lastName);
    }


}
