/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.LinkedList;

/**
 *
 * @author Asus
 */
public class bfs {
    public void Search(Graph g, Node root){
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node cur = queue.removeFirst();
            
            if(!cur.isVisited()){
            
                cur.Visit();
                LinkedList<Node> child  = g.getAdjancencyMap(cur);  
                if(child == null)
                    return;
                for(Node c:child){
                    queue.push(c);
                }
            }}
    }
}
