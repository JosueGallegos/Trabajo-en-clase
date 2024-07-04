import java.util.List;
//import java.util.Set;

public class User {

    public String name;
    public int age;
    public List<String> interests;
    

    // Constructor
    public User(String name, int age, List<String> interests) {
        this.name = name;
        this.age = age;
        this.interests = interests;
    }

    // Gest y Sets
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }
   
    

  
    

    

    


}