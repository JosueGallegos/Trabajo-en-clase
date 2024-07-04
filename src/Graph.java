import java.util.ArrayList;
import java.util.List;
//import java.util.Set;

public class Graph<T> {

    private List<NodeGraph<T>> nodes;
    
  
    //
    public Graph() {
        this.nodes =  new ArrayList<>();
    }


     // Método para añadir un nodo
     public void addNode(NodeGraph<T> node) {
        nodes.add(node);
    }


    //
    public void addConnection(NodeGraph<T> node1, NodeGraph<T> node2){
        if (!node1.getFriends().contains(node2)) {
            node1.addFriend(node2);
        }
        if (!node2.getFriends().contains(node1)) {
            node2.addFriend(node1);
        }

    }

     // Método para obtener amigos de un nodo
    public List<T> getFriends(NodeGraph<T> node) {
        List<T> friends = new ArrayList<>();
        for (NodeGraph<T> friend : node.getFriends()) {
            friends.add(friend.getUser());
        }
        return friends;
    }

    // Método para recomendar amigos
    public List<T> recommendFriends(NodeGraph<T> node) {
        List<T> recommendations = new ArrayList<>();
        for (NodeGraph<T> friend : node.getFriends()) {
            for (NodeGraph<T> friendsFriend : friend.getFriends()) {
                if (!node.getFriends().contains(friendsFriend) && !recommendations.contains(friendsFriend.getUser()) && friendsFriend != node) {
                    recommendations.add(friendsFriend.getUser());
                }
            }
        }
        return recommendations;
    }

    //Metodo par imprimir
    public void printGraph(){
        for(NodeGraph<T> node : nodes){
            System.out.print("Vertex "+ node.getUser()+ ":");
            for(NodeGraph<T> neighbor : node.getFriends()){
                System.out.print(" -> "+ neighbor.getUser());
            }
            System.out.println();
        }

    }
    
    public List<NodeGraph<T>> getNodes() {
        return nodes;
    }


    





}