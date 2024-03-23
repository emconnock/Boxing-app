import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException  {
        
        BoxingSession boxingSession = new BoxingSession();

        System.out.println("\nWelcome to your Boxing Session \n\nLet's go!\n\n");
        Scanner scanner = new Scanner(System.in);

        boolean validChoice;
        do {
            System.out.println("Choose a session: \n[1] 5 min box / 1 min rest \n[2] 3 min box / 1 min rest \n[3] 1 min box / 10 sec rest \n[4] Custom ");
            validChoice = true;

        switch(scanner.nextInt()) {

            case 1:
                boxingSession.setTimeOfRounds(300); 
                boxingSession.setRestTime(60);
                System.out.println("How many rounds would you like to box for?");
                boxingSession.setNumOfRounds(scanner.nextInt());
                break;
            case 2:
                boxingSession.setTimeOfRounds(180);
                boxingSession.setRestTime(60);
                System.out.println("How many rounds would you like to box for?");
                boxingSession.setNumOfRounds(scanner.nextInt());
                break;
            case 3:
                boxingSession.setTimeOfRounds(60);
                boxingSession.setRestTime(10);
                System.out.println("How many rounds would you like to box for?");
                boxingSession.setNumOfRounds(scanner.nextInt());
                break;
            case 4:
                System.out.println("Custom");
                custom(scanner, boxingSession);
                break;
            default: //The default case is exectuted if the input does not match any of the case values
                System.out.println("Invalid choice! Please enter one of the choices available:\n");
                validChoice = false;
                break;
    }
} while (!validChoice); //If validChoice is false, indicating that the user's input was invalid, 
                        //the loop will continue, prompting the user to enter another choice. If 
                        // validChoice is true, indicating that the user's input was valid, the loop will terminate.
 
        System.out.println("\nNumber of rounds: " + boxingSession.getNumOfRounds());
        System.out.println("Time of rounds: " + boxingSession.getTimeOfRounds() + " seconds");
        System.out.println("Rest time: " + boxingSession.getRestTime()+ " seconds");
        System.out.println("Round end warning: " + boxingSession.getRoundEndWarning() + " seconds");

        System.out.println("\nPress 'Enter' to start the session?"); //Touch the screen/button in app
        scanner.nextLine();
        scanner.nextLine();
        scanner.close();

        for (int i = 5; i >= 1; i --){
            System.out.print("\033\143");  
            System.out.println("Session will start in " + i + " seconds");
            TimeUnit.SECONDS.sleep(1);
        }

        System.out.print("\033\143");  //Clear the console to switch views (boxing session about to start)
        System.out.println("BOX");
    }
       

    private static void custom(Scanner scanner, BoxingSession boxingSession) {

        System.out.print("Enter time of rounds (seconds): ");
        boxingSession.setTimeOfRounds(scanner.nextInt());

        System.out.print("Enter rest time (seconds): ");
        boxingSession.setRestTime(scanner.nextInt());

        System.out.print("How many rounds would you like to box for?");
        boxingSession.setNumOfRounds(scanner.nextInt());

        boolean validChoice;
        do {
            System.out.print("Select which difficulty you would like for your session: \n[1] Beginner \n[2] Intermediate \n[3] Advanced\n ");
            int difficultyLevel = scanner.nextInt();
            validChoice = true;

        if (difficultyLevel == 1 || difficultyLevel == 2 || difficultyLevel == 3){
            String difficultyLevelChoice = Constants.DIFFICULTY_LEVEL.get(difficultyLevel);
            System.out.println(difficultyLevelChoice); 
       } else {
        System.out.println("Invalid choice! Please enter one of the choices available:\n");
        validChoice = false;
       }
    } while (!validChoice);

        
        
        //throw new UnsupportedOperationException("Unimplemented method 'custom'");
    }
}
  