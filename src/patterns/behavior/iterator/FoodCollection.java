package patterns.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author One
 * @description
 * @date 2019/01/08
 */
public class FoodCollection {
    private List<Food> list = new ArrayList<Food>();

    public void addFood(Food food) {
        list.add(food);
    }

    public void removeFood(Food food) {
        list.remove(food);
    }

    public Iterator<Food> getIterator() {
        return new FoodIterator(list);
    }

}
