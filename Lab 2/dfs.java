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
public class dfs {
    public void dfs(Graph g, Node root){
        root.Visit();
        LinkedList<Node> child  = g.getAdjancencyMap(root);  //rem ;
        if(child == null)
            return;
        for(Node c: child){
            
            if(!c.isVisited())
                dfs(g,c);
        }
    }   
}
