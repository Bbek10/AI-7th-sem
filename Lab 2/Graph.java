/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.HashMap;
import java.util.LinkedList;


/**
 *
 * @author Asus
 */
public class Graph {
    HashMap<Node, LinkedList<Node>> adjancencyMap;
    boolean directed;
    /**
     * @param args the command line arguments
     */
    public Graph(boolean b){
        directed = b;
        adjancencyMap = new HashMap<Node, LinkedList<Node>>();
    }
    public  void insertEdge(Node src, Node dest){
        if(!adjancencyMap.containsKey(src)) {
            LinkedList<Node> tmp = new LinkedList<Node>();  //emppty list create
            tmp.add(dest);
            adjancencyMap.put(src, tmp); //edge draw
            
        } else {
             LinkedList<Node> tmp = adjancencyMap.get(src);  //emppty list create
             tmp.add(dest);
              adjancencyMap.put(src, tmp);
             
      }
      
     
        
         }
    
     public LinkedList<Node> getAdjancencyMap(Node n){
            return adjancencyMap.get(n);
      }
    public static void main(String[] args) {
        
        // TODO code application logic here
        
    }
    
}
