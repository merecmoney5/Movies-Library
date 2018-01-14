package graph.classes.graph;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import graph.classes.vertice.Vertex;
import graph.classes.vertice.VertexForData;

/**
 *
 * Graph
 *
 */
public class Graph {
    private int numberOfVertices;
    private int numberOfEdges;
    private Hashtable<String, Vertex> setOfVertex = new Hashtable<>();

    public Graph(ArrayList<?> vertices) {
        setVertices(vertices);
    }

    public Graph(){

    }

    public void setVertices(ArrayList<?> vertices){
        if (vertices.isEmpty()){
            return;
        }else if (vertices.get(0) instanceof Vertex) {
            for (Object vertice:vertices) {
                addVertex((Vertex)vertice);
            }
            return;
        }else if (vertices.get(0) instanceof String) {
            for (Object vertice:vertices) {
                addVertex((String)vertice);
            }
        }
    }

    public void setSetOfVertex(Hashtable<String, Vertex> setOfVertex) {
        this.setOfVertex = setOfVertex;
    }

    public Vertex getVertex(String id){
        if (setOfVertex.containsKey(id)) {
            return setOfVertex.get(id);
        }
        else {
            System.out.println("id " + id + " not found");
            return null;
        }
    }

    public void addVertex(Vertex vertex){
        if (!isKey(vertex.getId())){
            this.setOfVertex.put(vertex.getId(),vertex);
            increaseNumberOfVertices();
        }
    }

    public void addVertex(String id) {
        // isKey(id) != true
        if (!isKey(id)) {
            Vertex vertex = new Vertex(id);
            this.setOfVertex.put(id, vertex);
            increaseNumberOfVertices();
        }
    }

    /**
     * Add vertex with a data object
     * @param id
     * @param data
     */
    public void addVertex(String id, Object data){
        if (!isKey(id)) {
            Vertex vertex = new VertexForData(id,data);
            this.setOfVertex.put(id,vertex);
            increaseNumberOfVertices();
        }
    }

    public void removeVertex(String id){
        // when we remove a vertex in the graph,we must remove all adjacency with other
        //vertices
        if (isKey(id)) {
            Vertex vertex = this.setOfVertex.get(id);
            //remove adjacency of this vertex and edges incident with it
            for (Vertex node:vertex.getNeighbors()) {
                //change implementation to remove neighbor, string instead of node
                //System.out.println(id + " " + node.getId());
                node.removeNeighbor(vertex);
                decreaseNumberOfEdges();
            }
            this.setOfVertex.remove(id);
            decreaseNUmberOfVertices();
        }else {
            System.out.println("given id isn't in set of Vertex");
        }
    }

    private String getVertexByValue(Vertex node){
        Iterator<String> iterator = getIterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            if (this.setOfVertex.get(key) == node){
                return key;
            }
        }
        return null;
    }

    public void addEdge(String vertex1,String vertex2){
        if (isKey(vertex1) && isKey(vertex2)){
            if (vertex1.equals(vertex2)) {
                Vertex vertex = this.setOfVertex.get(vertex1);
                vertex.addNeighbor(vertex);
                increaseNumberOfEdges();
                return;
            }
            Vertex vertexObject1 = this.setOfVertex.get(vertex1);
            Vertex vertexObject2 = this.setOfVertex.get(vertex2);
            vertexObject1.addNeighbor(vertexObject2);
            vertexObject2.addNeighbor(vertexObject1);
            increaseNumberOfEdges();
        }
    }

    public void removeEdge(String vertex1,String vertex2){
        System.out.println("removido");
        if (isKey(vertex1) && isKey(vertex2)){
            if (vertex1.equals(vertex2)) {
                Vertex vertex = this.setOfVertex.get(vertex1);
                vertex.removeNeighbor(vertex);
                decreaseNumberOfEdges();
                return;
            }
            Vertex vertexObject1 = this.setOfVertex.get(vertex1);
            Vertex vertexObject2 = this.setOfVertex.get(vertex2);
            vertexObject1.removeNeighbor(vertexObject2);
            vertexObject2.removeNeighbor(vertexObject1);
            decreaseNumberOfEdges();
        }
    }

    private void increaseNumberOfVertices(){
        this.numberOfVertices ++;
    }

    private void decreaseNUmberOfVertices(){
        this.numberOfVertices --;
    }

    private void increaseNumberOfEdges(){
        this.numberOfEdges ++;
    }

    private void decreaseNumberOfEdges(){
        this.numberOfEdges --;
    }

    private boolean isKey(String id){
        return setOfVertex.containsKey(id);
    }

    @Override
    public String toString() {
        return "The graph G has " + numberOfVertices + " vertices, "
                + numberOfEdges + " edges" + "\nset Of Vertices: \n" +
                getListOfVertices();
    }

    public String getListOfVertices(){
        String vertices = "\n";
        Iterator<String> iterator = getIterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            vertices = vertices + "key " + key + " value " + setOfVertex.get(key) + "\n";
        }
        return vertices;
    }

    private Iterator<String> getIterator(){
        //Set<String> keys = this.setOfVertex.keySet();
        //Iterator<String> iterator = keys.iterator();
        return this.setOfVertex.keySet().iterator();
    }
}
