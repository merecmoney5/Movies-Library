package graph.classes.vertice;

import java.util.ArrayList;

/**
 * Vertex
 * Class to represent a vertex in a graph
 */
public class Vertex {
    private String id;
    private int numberOfNeighbors;
    private ArrayList<Vertex> neighbors = new ArrayList<Vertex>();
    private boolean visited;

    /**
     * Constructor to create a Vertex object receiving its id and list of Neighbors
     * @param id identifier of the Vertex
     * @param neighbors neighborhood of the Vertex
     */
    public Vertex(String id, ArrayList<Vertex> neighbors){
        setId(id);
        setNumberOfNeighbors(neighbors.size());
        setNeighbors(neighbors);
    }

    /**
     * Constructor to create a Vertex object receiving only its id
     * @param id identifier of the Vertex
     */
    public Vertex(String id){
        setId(id);
    }

    /**
     * Method to set id of a vertex
     * @param id identifier of the Vertex
     */
    public void setId(String id){
        this.id = id;
    }

    /**
     * Method to set number of Neighbors of a vertex.
     * This method is private due to it is only used in constructor that receives a list
     * neighbors of the vertex,besides to be careful of not being changed and have a
     * wrong value for the vertex.
     * @param numberOfNeighbors size of List of Neighbors received
     */
    private void setNumberOfNeighbors(int numberOfNeighbors){
        this.numberOfNeighbors = numberOfNeighbors;
    }

    /**
     * Method to set neighborhood of a vertex
     * @param neighbors list of neighbors
     */
    public void setNeighbors(ArrayList<Vertex> neighbors){
        //check if neighbors is empty, see if there's no error in for each
        for (Vertex vertice : neighbors) {
            this.neighbors.add(vertice);
        }
    }

    /**
     * Method to get Id of a vertex
     * @return id of vertex
     */
    public String getId(){
        return this.id;
    }

    /**
     * Method to get number of Neighbors
     * @return size of neighborhood for the vertex
     */
    public int getNumberOfNeighbors(){
        return this.numberOfNeighbors;
    }

    /**
     * Method to get list of Neighbors
     * @return an ArrayList with the elements that belong to neighborhood of the vertex
     */
    public ArrayList<Vertex> getNeighbors(){
        return this.neighbors;
    }

    /**
     * Method to add a new neighbor for the vertex
     * if neighbor is already adjacent with the vertex,it's not added
     * @param neighbor vertex to add as a neighbor
     */
    public void addNeighbor(Vertex neighbor) {
        //isNeighbor(neighbor) != true
        if (!isNeighbor(neighbor)) {
            this.neighbors.add(neighbor);
            this.numberOfNeighbors ++;
        }
    }

    /**
     * Method to remove adjacency of a vertex with other vertex
     * if neighbor isn't adjacent with the vertex,it's not removed
     * @param neighbor vertex to remove as a neighbor
     */
    public void removeNeighbor(Vertex neighbor){
        if (isNeighbor(neighbor)){
            this.neighbors.remove(neighbor);
            this.numberOfNeighbors --;
        }
    }

    /**
     * Method to check if a vertex is or isn't adjacent with this vertex
     * if it is adjacent with this vertex,value return is true
     * if it isn't adjacent,value return is false
     * @param vertex
     * @return
     */
    private boolean isNeighbor(Vertex vertex){
        return this.neighbors.contains(vertex);
    }

    @Override
    public String toString() {
        return "Id: " + getId() + " number of neighbors: " + this.numberOfNeighbors + getListOfNeighbors();
    }

    private String getListOfNeighbors() {
        String list = "\nNeighbors:";
        for (Vertex vertex: getNeighbors()) {
            list = list + "\n" + vertex.getId();
        }
        return list;
    }
}
