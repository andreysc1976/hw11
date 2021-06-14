package fruits;

import java.util.ArrayList;

public class Box {
    private ArrayList<Fruit> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public boolean add(Fruit fruit){
        if (fruits.size()>0)
        {
            if (fruits.get(0).getClass().getName()!=fruit.getClass().getName()){
                System.out.println("В коробке лежат "+fruits.get(0).getClass().getName());
                return false;
            }
        }
        fruits.add(fruit);
        return true;
    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }

    public void clear(){
        fruits = new ArrayList<>();
    }

    public float getWeight(){
        float weight=0;
        for (Fruit fruit:fruits)
        {
            weight+=fruit.getWeight();
        }
        return weight;
    }

    public void pour(Box box){
        for (Fruit fruit: box.getFruits()) {
            if (!fruits.add(fruit))
            {
                return;
            }
        }
        box.clear();
    }

    @Override
    public String toString() {
        if (fruits.size()==0) return "пустая;";
        return " "+fruits.size()+" "+fruits.get(0).getClass().getName();

    }
}
