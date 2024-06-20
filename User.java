import java.util.ArrayList;
import java.util.Objects;

public class User {
    public String name;
    public ArrayList<Integer> nums;

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(obj == null || getClass() != obj.getClass()) return false;

        User user = (User) obj;
        return Objects.equals(name, user.name);
    }

    public User(String name,ArrayList<Integer> nums){
        this.name = name;
        this.nums = nums;
    }

    public void setNum(int num){
        nums.add(num);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
    
    public ArrayList<Integer> getNums(){
        return nums;
    }

    @Override
    public String toString() {
        return name;
    }
}


