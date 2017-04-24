import java.util.ArrayList;

public class HelpDesk {

    //INSTANCE VARIABLES
    private ArrayPriorityQueue<Ticket> customers;
    private int currID;
    private String[] answers = {"Well, that's too bad.", "Life isn't fair, honey.", "Ain't nobody got time for that.", "EUREKA!!!", "Ask Mr. Brown.", "To be or not to be, that is the question.", "Have you utilized your Keys to Success yet?", "Ooh, girl, tell me about it.", "It's just your bad karma."};
    private ArrayList<Solved> previouslySolved;

    //CONSTRUCTOR
    public HelpDesk() {
	customers = new ArrayPriorityQueue<Ticket>();
	currID = 0;
	previouslySolved = new ArrayList<Solved>();
    }
    
    
    //METHODS
    public void addTicket(int VIPLevel, String problem, String custName) {
    
        Ticket newTicket = new Ticket(VIPLevel, currID, problem, custName);
	currID++;

        for (int x = 0; x < previouslySolved.size(); x++) {
	    if (newTicket.getProblem().equals(previouslySolved.get(x).getProblem())) {
		System.out.println(custName + "'s ticket has been found in previous solutions!");
		return;
	    }
	}
	
	customers.add(newTicket);
	System.out.println(custName + " needs help!");
        
    }
    
    public String solveTicket() {
    
        String sol = answers[(int)(Math.random()*answers.length)];
	String problem = customers.peekMin().getProblem();
	Solved temp = new Solved(problem, sol);

	customers.peekMin().setSolved();
        customers.peekMin().setSolution(sol);
        customers.removeMin();
	
	previouslySolved.add(temp);
	return sol;
    }

    public String toString() {
        return customers.toString();
    }
    
    //MAIN METHOD
    public static void main(String[] args) {

	HelpDesk xing = new HelpDesk();
	xing.addTicket(0, "needs new toaster", "vip guy");
	xing.addTicket(5, "needs new pillow", "not vip guy");
	xing.addTicket(3, "needs new blanket", "kinda vip guy");
	System.out.println(xing);
	xing.solveTicket();
	System.out.println(xing);
	xing.addTicket(1, "needs new toaster", "less vip guy");
	System.out.println(xing);
	
    }
    
}
