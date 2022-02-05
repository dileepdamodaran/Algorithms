package datastruct;

public class GraphTest {

    public static void main (String args[]){
        Graph<Integer> g = new Graph<Integer>();
        g.addEdge(0,1, true);
        g.addEdge(0,4, true);
        g.addEdge(1,2, true);
        g.addEdge(1,3, true);
        g.addEdge(1,4, true);
        g.addEdge(2,3, true);
        g.addEdge(3,4, true);

       System.out.println("g.getVertexCount()"+g.getVertexCount());
       System.out.println(" g.getEdgesCount(true)"+ g.getEdgesCount(true));
       System.out.println("  g.hasEdge(1,2)"+  g.hasEdge(1,2));
       System.out.println(" g.hasVertex(5)"+ g.hasVertex(5));



    }
}
