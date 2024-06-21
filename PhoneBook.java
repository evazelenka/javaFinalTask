import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class PhoneBook {
  private static HashMap<User, ArrayList<Integer>> phoneBook = new HashMap<>();
  
  
  public void sortPhoneBook(){

    UserNumsComparator ucomp = new UserNumsComparator();
    TreeSet<User> users = new TreeSet<User>(ucomp);
    users.addAll(phoneBook.keySet());
    
    for(User u : users){
      System.out.println(u.toString() + phoneBook.get(u));
    }

  }
  
  public void add(User user, Integer phoneNum) {
    if(phoneBook.containsKey(user)){

      user.setNum(phoneNum);
      phoneBook.get(user).add(phoneNum);
    
    }else{

      ArrayList<Integer> pN = new ArrayList<>();
      pN.add(phoneNum);
      user.setNum(phoneNum);
      phoneBook.put(user, pN);
    
    }
  }

  public HashMap<User, ArrayList<Integer>> getPhoneBook() {
    
    return phoneBook;
    
  }

  public ArrayList<Integer> getValue(User user){
    
    return phoneBook.get(user);
    
  }
}
