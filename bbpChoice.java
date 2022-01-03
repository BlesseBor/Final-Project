package BBP;

public enum bbpChoice {
    BATO(1,2), PAPEL(2,3), GUNTING(3,1), EMPTY(-1,-1);
    
    private int id;
	private int winBy;
    
    bbpChoice(int id, int winBy){
        this.id = id;
        this.winBy = winBy;
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
