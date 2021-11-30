package dii.vrp.tp;
import dii.vrp.data.IDistanceMatrix;


public class NaiveNNHeuristic  implements ITSPHeuristic{

	
	private IDistanceMatrix distances;
	
	private int initNode = 0;
	
	
	public  NaiveNNHeuristic(final IDistanceMatrix distances) {
		
		this.distances = distances;
		
	}
	
	@Override
	public void setInitNode(int i) {
		
		this.initNode = i;
	}
	
	@Override
	public TSPSolution run(){
		
		TSPSolution newsolution = new TSPSolution();
		int  node = 1;
		int  position  = (int) Double.MAX_VALUE;
		
		
		
		
		
		
	}
	
	
}
