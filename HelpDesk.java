public class HelpDesk {

    private ArrayPriorityQueue<Ticket> customers;
    private int currID;
    private String[] answers = {"Well, that's too bad.", "Life isn't fair, honey.", "Ain't nobody got time for that.", "EUREKA!!!", "Ask Mr. Brown.", "To be or not to be, that is the question.", "Have you utilized your Keys to Success yet?", "Ooh, girl, tell me about it.", "It's just your bad karma."};
    
    public void addTicket(int VIPLevel, String problem, String custName) {
    
        Ticket newTicket = new Ticket(VIPLevel, currID, problem, custName);
        customers.add(newTicket);
        System.out.println(custName + "needs help!");
        
    }
    
    public String solveTicket() {
    
        String sol = answers[(int)(Math.random()*answers.length)];
        customers.peekMin().solved = true;
        customers.peekMin().solution = sol;
        customers.removeMin();
        return sol;
        
    }
    
}
