import javafx.scene.layout.HBox;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T> al;

    public Box() {
        this.al = new ArrayList<>();
    }

    public float getWeight(){
        return al.get(0).getWeight() * al.size();
    }

    public void addFruit (T fruit){
        al.add(fruit);
    }
    public boolean compare(Box box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.00001;
    }
    public void cloneList (Box<T> clone){
        for (T t:al) {
            clone.addFruit(t);
        }
        al.clear();
    }
}
