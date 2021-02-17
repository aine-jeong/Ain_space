import java.util.HashSet;
import java.util.Iterator;

class Myclass{
    private int id;
    private String name;
    
    public Myclass() {
        
    }

    public Myclass(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Myclass [id=" + id + ", name=" + name + "]";
    }
    
    public void displayInfo() {
        System.out.println("학번: " + this.id);
        System.out.println("이름: " + this.name);
    }
    
}

public class Ex10_Set_Object {
    public static void main(String[] args) {
        HashSet<Myclass> hset = new HashSet<Myclass>();
        hset.add(new Myclass(1, "Abc"));
        hset.add(new Myclass(2, "Def"));
        hset.add(new Myclass(3, "Asdf")); // 새로운 주소가 들어가는 것 (= 다른 값) / 같은 것이 들어가는게 x
        
        //개선된 for문으로 출력
        for(Myclass m : hset) {
            m.displayInfo();
        }
        
        //iterator로 출력
        Iterator<Myclass> itr = hset.iterator();
        while(itr.hasNext()) {
            Myclass mc = itr.next();
            mc.displayInfo();           // = itr.next().displayInfo();
        }
            
    }
}




