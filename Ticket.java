public class Ticket implements Comparable<Ticket> {
    
    private int VIPLevel;
    private int ID;
    private String problem;
    private String custName;
    private String solution;
    private boolean solved;

    //constructors
    public Ticket() {
	VIPLevel = 0;
	ID = 0;
	problem = "";
	custName = "";
	solution = "";
	solved = false;
    }

    public Ticket(int newVIPLevel, int newID, String newProblem, String newCustName) {
	this();
	VIPLevel = newVIPLevel;
	ID = newID;
	problem = newProblem;
	custName = newCustName;
    }
    
    //overriding methods
    public int compareTo(Ticket other) {

	if (this.getVIPLevel() > other.getVIPLevel()) { //current is greater
	    return -1;
	}
	else if (this.getVIPLevel() == other.getVIPLevel()) { //theyre equal
	    return 0;
	}
	else { //current is less than
	    return 1;
	}	
    }
    
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
    
    public String getSolution() {
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

    /*
    public static void main (String[] args) {
	
	Ticket james = new Ticket(100, 0, "im stressed", "james");
	Ticket xing = new Ticket(0, 0, "im stressed", "james");
	System.out.println(james.compareTo(xing));
 
    }
    */
}
