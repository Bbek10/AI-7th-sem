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
public class Node {
    int nodeID;
    String name;
    boolean visited;
    
    public Node(int id, String str){
    nodeID = id;
    name = str;
    visited = false;
    
    }
    public void Visit(){
        visited = true;
        System.out.print(name+ "is visited\n");
    }
    
    public boolean isVisited(){
       return visited;
    }
    
}
