package BBP;

import java.util.Random;

public class ControlPanel {
    
    private bbpChoice userOption = bbpChoice.EMPTY;
    private bbpChoice computerOption = bbpChoice.EMPTY;
    private Result sumResult = new Result();
    
    public String greeting() {
        return "       Bato Bato Pick Game \n     ";
    }
    public String enterMessage(){ //displays all the choices
        return "        Press 1 for BATO \n"
        		+"        Press 2 for PAPEL \n"
        		+ "        Press 3 for  GUNTING\n";
    }
    public void userChoices(bbpChoice inputChoice){
        this.userOption = inputChoice;
    }
    public bbpChoice computerChoice(){ //generates a random number for the computer choice
        int randomNumberBetween1and3 = new Random().nextInt(3)+1;
        bbpChoice computerRandom = bbpChoice.valueOf(randomNumberBetween1and3);
        this.computerOption = computerRandom;
        return computerRandom;
    }
    public Player resultTally(){ 
        sumResult.addTally();
        //determines who will win
        if (computerOption.equals(userOption)){
            return Player.DRAW;
        }
        if(computerOption.isWinby(userOption)){
        	sumResult.addUserPoints();
            return Player.USER;
        }
        return Player.COMPUTER;
    }
    public Result getResults(){
        return sumResult;
    }
}
