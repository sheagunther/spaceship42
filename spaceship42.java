import java.io.FileNotFoundException;
import java.util.Scanner;


public class spaceship42 {

	int answerToTheQuestion = 42;
	
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	   
	   Scanner console = new Scanner(System.in);
	   
		System.out.println("Welcome text!");
		System.out.println("Get command>");
		
		String command = console.nextLine();

      command = command.toLowerCase();
      Scanner firstWordGrabber = new Scanner(command);
      String firstWord = firstWordGrabber.next();

      String[] tokenizedCommand = convertTextCommandToStringArray(command);   
		
		
      while(!firstWord.equals("quit")){
         parseCommand(tokenizedCommand); 
         System.out.println("");
         
         System.out.println("Player's next command: ");

         command = console.nextLine();  
         firstWordGrabber = new Scanner(command);
         firstWord = firstWordGrabber.next();
         tokenizedCommand = convertTextCommandToStringArray(command);
     }
      
      

	}

	 public static String[] convertTextCommandToStringArray(String command){

       Scanner commandToParse = new Scanner(command);

       // dataFieldCount is the number of tokens in command
       int dataFieldCount = 0;
       while (commandToParse.hasNext()){
           dataFieldCount++;
           commandToParse.next();
       }

       commandToParse = new Scanner(command);// reset the Scanner 
       String[] tokenizedCommand = new String[dataFieldCount];

       int cycleCount = 0;
       while (commandToParse.hasNext()){
           String commandToken = commandToParse.next();
           commandToken = commandToken.toLowerCase();
           tokenizedCommand[cycleCount] = commandToken;
           cycleCount++;
       }

       return tokenizedCommand;

   }
	 
	 
	 public static void parseCommand (String[] tokenizedCommand) throws FileNotFoundException{
       int dataFieldCount = tokenizedCommand.length;

       // PARSING FUNCTIONS ===========================================================
       
   }
	
	
}

