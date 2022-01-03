package BBP;

public enum bbpChoice {
    BATO(1,2), PAPEL(2,3), GUNTING(3,1), EMPTY(-1,-1); //number identifiers for the choices
    
    private int id; 
	private int winBy;
    
    bbpChoice(int id, int winBy){
        this.id = id; //checks if a certain value matches
        this.winBy = winBy; //checks what choice would win
    }
    public static bbpChoice valueOf(int inputChoice){
        for (bbpChoice choice: bbpChoice.values()){
            if(inputChoice == choice.id){
                return choice;
            }
        }
        return EMPTY;
    }
    public boolean isWinby(bbpChoice choice) {
    	return this.winBy == choice.id;
    }
}
