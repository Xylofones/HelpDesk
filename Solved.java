public class Solved {

    private String problem;
    private String solution;

    public Solved() {

	problem = "";
	solution = "";
	
    }

    public Solved(String newProblem, String newSolution) {

	problem = newProblem;
	solution = newSolution;
	
    }

    public String getProblem() {
	return problem;
    }

    public String getSolution() {
	return solution;
    }

    public String setProblem(String newProblem) {
	String retVal = problem;
	problem = newProblem;
	return retVal;
    }

    public String setSolution(String newSolution) {
	String retVal = solution;
	solution = newSolution;
	return retVal;
    }
    
}


