/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author Asus
 */
public class romania {
    
    public static void main(String[] args){
        Node n1 = new Node(1, "Arad");
        Node n2 = new Node(2, "Sibiu");
        Node n3 = new Node(3, "Rimnsiu");
        Node n4 = new Node(4, "Fagaras");
        
        Graph g = new Graph(false);
        g.insertEdge(n1, n2);
        g.insertEdge(n2, n1);
        g.insertEdge(n2, n3);
        g.insertEdge(n2, n4);
        
        dfs s = new dfs();
        s.dfs(g, n1);
        
        bfs b = new bfs();
        b.Search(g, n1);
        
    }
}
