Team HelpDesk

<h1>
DESIGN:
</h1>

<h2>
Ticket
</h2>

<p>
Contains the attriubtes VIPLevel, ID, problem, custName, solution, and solved. Tickets are Comparable so that they can be compared with other Tickets to see which one has higher priority, and therefore determines where it falls in the queue. Also contains accessor methods for each variable and mutators for solved and solution variables (as these will need to be changed once ticket problems have been solved).
</p>

<h2>
ArrayPriority Queue
</h2>

Uses an ArrayList as the container to hold the Tickets which need to be solved,
