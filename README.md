<h1>
Team HelpDesk
</h1>

<h2>
Xing Tao Shi, Taylor Wong, and James Zhang
</h2>

<h2>
DESIGN
</h2>

<h3>
Ticket
</h3>

Contains the attriubtes VIPLevel, ID, problem, custName, solution, and solved. Tickets are Comparable so that they can be compared with other Tickets to see which one has higher priority, and therefore determines where it falls in the queue. Also contains accessor methods for each variable and mutators for solved and solution variables (as these will need to be changed once ticket problems have been solved).


<h3>
ArrayPriority Queue implementing PriorityQueue
</h3>

Uses an ArrayList as the container to hold the Tickets which need to be solved. Methods include add (add Ticket), isEmpty, peekMin, removeMin, and toString-- all of which are generically typed (except toString which has to return a String).


<h3>
HelpDesk
</h3>

Contains an ArrayPriorityQueue customers, a currID (which handles which Ticket number is being served), answers (which is a set of generic answers given to solve the problems of customers), and previouslySolved (an ArrayList of type Solved which keeps track previously solved problems). The addTicket method adds a ticket to the queue; and the solveTicket method solves the ticket, removes the ticket form the queue, and returns the solution. The toString method simply converts customer queue into a string.

<h2>
PIZZAZZ
</h2>

<h3>
Solved
</h3>

Helps keep track of previously solved requests. Using this new class, we created an ArrayList in HelpDesk which kept track of previous solutions. We then added onto our add method so that if a problem had been previously solved, instead of being enqueued into the ArrayPriorityList, it would simply be filtered out and the customer would be given the previous solution.
