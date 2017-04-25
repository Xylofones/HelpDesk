import java.util.ArrayList;
import cs1.Keyboard;

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
	System.out.println(custName + "'s ticket has been added. His ID is " + currID + ".");
        
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

	//OLD TESTING
	/*
	HelpDesk xing = new HelpDesk();
	xing.addTicket(0, "needs new toaster", "vip guy");
	xing.addTicket(5, "needs new pillow", "not vip guy");
	xing.addTicket(3, "needs new blanket", "kinda vip guy");
	System.out.println(xing);
	xing.solveTicket();
	System.out.println(xing);
	xing.addTicket(1, "needs new toaster", "less vip guy");
	System.out.println(xing);
	*/

	//CLI
	HelpDesk xing = new HelpDesk();
	
	int newVIPLevel;
	int choice;
	String newProblem;
	String newCustName;
	boolean open = true;
	
	while(open){
	    System.out.println("Please enter your VIPLevel where 0 is the highest");
	    newVIPLevel = Keyboard.readInt();
	    System.out.println("Please enter your problem");
	    newProblem = Keyboard.readString();
	    System.out.println("Please enter your name");
	    newCustName = Keyboard.readString();
	    xing.addTicket(newVIPLevel, newProblem, newCustName);

	    System.out.println("Would you like to solve a ticket, add another ticket, or stop here?");
	    System.out.println("Insert 1 for solve and then add another one");
	    System.out.println("Insert 2 for add");
	    System.out.println("Insert 3 for stop");
	    choice = Keyboard.readInt();

	    if (choice == 1) {
		System.out.println("The next problem is about to be solved");
		System.out.println("WOW WE FOUND A SOLUTION. It is:");
		System.out.println("\t" + xing.solveTicket());
		System.out.println("He has been removed from our list of customers.");
	    }
	    else if (choice == 2) {

	    }
	    else {
		open = false;
	    }
	    
	
	}
	System.out.println("We are now closed");
	
    }
    
}
