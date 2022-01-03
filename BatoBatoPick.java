package BBP;

import java.util.Scanner;
/**
 *
 * @author blesse borromeo
 */
public class BatoBatoPick {

    public static void main(String[] args) {
        ControlPanel control = new ControlPanel();
        
        Scanner scanner = new Scanner(System.in);
        
        String leaveGame;
        
        System.out.println(control.greeting());
        
        do{
            System.out.println(control.enterMessage());
            
            int userChoiceRaw = scanner.nextInt();
            
            
            bbpChoice inputChoice = bbpChoice.valueOf(userChoiceRaw);
            
            control.userChoices(inputChoice);
            
            bbpChoice computerRandom = control.computerChoice();
            
            Player winner = control.resultTally();
            
            Result result = control.getResults();
            
            System.out.printf("     (You) %s \n", inputChoice.name());
            System.out.println("       VS ");
            System.out.printf("     (Computer) %s\n",computerRandom.name());
            if(Player.USER == winner){
                System.out.println("You Won");
            }
            
            if(Player.DRAW == winner){
                System.out.println("Draw");
            }
            if(Player.COMPUTER == winner){
                System.out.println("You Lose");
            }
            System.out.printf("Your Score: %d \n", result.getUserPoints());
            System.out.printf("Number of games: %d \n", result.getNumberOfGame());
            System.out.println("Try Again? Y for Yes, N for No");
            
            leaveGame = scanner.next();
            
        }while(leaveGame.toUpperCase().equals("Y"));
        
    }
    
}
