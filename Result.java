package BBP;

public class Result {
    private int userPoints;
    private int numberOfGame;
    
    public void addUserPoints(){ //tallies the total points of user
        userPoints++;
    }
    public void addTally(){ //tallies the total number of games played
        numberOfGame++;
    }
    
    public int getNumberOfGame() {return numberOfGame;}
    public int getUserPoints() {return userPoints;}
}
