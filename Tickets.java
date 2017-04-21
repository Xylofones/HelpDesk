public class Ticket {
    
    private int VIPLevel;
    private int ID;
    private String problem;
    private String custName;
    private String solution;
    private boolean solved;
    
    //accessors
    public int getVIPLevel() {
        return VIPLevel;
    }
    
    public int getID() {
        return ID;   
    }
    
    public String getProblem() {
        return problem;   
    }

    public String getCustName() {
        return custName;   
    }
    
    public int getSolution() {
        return solution;   
    }
    
    public boolean isSolved() {
        return solved;   
    }
    
    //mutators
    public boolean setSolved(boolean newSolved) {
        boolean old = solved;
	solved = newSolved;
	return old;
    }
    
    public String setSolution(String newSolution) {
        String old = solution;
	solution = newSolution;   
	return old;
    }

}
