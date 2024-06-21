import java.util.Comparator;

public class UserNumsComparator implements Comparator<User>{
    public int compare(User a, User b){
        if(a.getNums().size() > b.getNums().size()){
            return -1;
        }
        else if(a.getNums().size() < b.getNums().size()){
            return 1;
        } else if(a.equals(b)){
            return 0;
        }else return -1;
    }
    
}
