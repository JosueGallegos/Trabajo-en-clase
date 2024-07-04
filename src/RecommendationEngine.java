import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecommendationEngine<T extends User>{

    // Método para recomendar amigos
    public List<T> recommendFriends(NodeGraph<T> node, Graph<T> graph) {
        List<T> recommendations = new ArrayList<>();
        for (NodeGraph<T> potentialFriendNode : graph.getNodes()) {
            T potentialFriend = potentialFriendNode.getUser();
            if (!node.getFriends().contains(potentialFriendNode) && !node.getUser().equals(potentialFriend)) {
                double similarity = calculateSimilarity(node.getUser(), potentialFriend);
                if (similarity > 0.3) { // Umbral de recomendación
                    recommendations.add(potentialFriend);
                }
            }
        }
        return recommendations;
    }
    ///
    public double calculateSimilarity(T user1, T user2){
        Set<String> interest1 = new HashSet<>(user1.getInterests());
        Set<String> interest2 = new HashSet<>(user2.getInterests());
        Set<String> intersection = new HashSet<>(interest1);
        intersection.retainAll(interest2);
        Set<String> union = new HashSet<>(interest1);
        union.addAll(interest2);

        double resp = (double) intersection.size() / union.size();
        System.out.println("Valor - "+ resp);
        return resp;
        
    }

}