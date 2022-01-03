package BBP;

public class Result {
    private int userPoints;
    private int numberOfGame;
    
    public void addUserPoints(){
        userPoints++;
    }
    public void addTally(){
        numberOfGame++;
    }
    
    public int getNumberOfGame() {return numberOfGame;}
    public int getUserPoints() {return userPoints;}
}
