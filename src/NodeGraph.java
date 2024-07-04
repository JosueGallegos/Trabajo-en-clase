import java.util.LinkedList;
import java.util.List;

public class NodeGraph<T> {

    private T user;
    private List<NodeGraph<T>> friends;
    private T value;


    public T getValue(){
        return value;
    }


    //Construtor 
    public NodeGraph(T user) {
        this.user = user;
        this.friends = new LinkedList<>();
    }


    
    public T getUser() {
        return user;
    }



    public void setUser(T user) {
        this.user = user;
    }


    public List<NodeGraph<T>> getFriends() {
        return friends;
    }



    public void setFriends(List<NodeGraph<T>> friends) {
        this.friends = friends;
    }



    // Agregar amigos
    public void addFriend(NodeGraph<T> friends){
        this.friends.add(friends);
    }



   



    

    

    




}