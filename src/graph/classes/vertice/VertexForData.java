package graph.classes.vertice;

import java.util.ArrayList;

public class VertexForData extends Vertex{
    private Object data;

    public VertexForData(String id, ArrayList<Vertex> neighbors, Object data){
        super(id, neighbors);
        this.data = data;
    }

    public VertexForData(String id, Object data){
        super(id);
        this.data = data;
    }

    public void setData(Object data){
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return super.toString() + "\ndata:\n" + this.data;
    }
}
