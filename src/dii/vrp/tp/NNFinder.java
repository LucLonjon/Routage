package dii.vrp.tp;

import dii.vrp.data.IDistanceMatrix;

/**
 * Finds nearest neighbors
 * @author Jorge E. Mendoza (dev@jorge-mendoza.com)
 * @version %I%, %G%
 * @since Jan 18, 2016
 *
 */
public class NNFinder{
	
	/**
	 * The sorted list of neighbors. Position <code>[i][j]</code> in this matrix contains the ID 
	 * of the <code>j</code>th closest neighbor of node <code>i</code>
	 */
	private final int[][] neighbors;
	
	/**
	 * Constructs a new NNFinder
	 * @param distances the distance matrix for building the neighbor list
	 * @param n the number of nodes in the instance
	 */
	public NNFinder(final IDistanceMatrix distances, final int n){
		this.neighbors=new int[n][n];
		//TODO EXO 3: YOUR CODE COMES HERE: YOU NEED TO INITIALIZE the neighbors matrix
	}
	/**
	 * Finds the <code>k</code>th nearest not-routed neighbor of node <code>i</code>
	 * @param i a node in the graph
	 * @param nodeStatus the status of the nodes. For each node <code>j</code> in the TSP instance, <code>nodeStatus[j]=true</code>
	 * if node <code>j</code> is already included in the TSP tour and <code>nodeStatus[j]=true</code> otherwise.
	 * @param k
	 * @return the <code>k</code>th nearest not-routed neighbor of node <code>i</code>
	 */
	public int findNN(int i, boolean[] nodeStatus, int k) {
		//TODO EXO 3: YOUR CODE COMES HERE
		return -1;
	}
	/**
	 * Finds the nearest not-routed neighbor of node <code>i</code>
	 * @param i a node in the graph
	 * @param nodeStatus the status of the nodes. For each node <code>j</code> in the TSP instance, <code>nodeStatus[j]=true</code>
	 * if node <code>j</code> is already included in the TSP tour and <code>nodeStatus[j]=true</code> otherwise.
	 * @return the nearest not-routed neighbor of node <code>i</code>
	 */
	public int findNN(int i, boolean[] nodeStatus) {
		//TODO EXO 3: YOUR CODE COMES HERE (HINT: CAN BE DONE IN ONE LINE OF CODE)
		return -1;
	}
	
	@Override
	public String toString(){
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<neighbors.length; i++){
			sb.append(i+"|\t");
			for(int j=0; j<neighbors[i].length; j++){
				sb.append(neighbors[i][j]+"\t");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}
