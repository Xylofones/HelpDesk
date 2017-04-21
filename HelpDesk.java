public class HelpDesk {

    private ArrayPriorityQueue<Ticket> customers;
    private int currID;
    
    public void addTicket(int VIPLevel, String problem, String custName) {
    
        Ticket newTicket = new Ticket(VIPLevel, currID, problem, custName);
        customers.add(newTicket);
        System.out.println(custName + "needs help!");
        
    }
    
}
