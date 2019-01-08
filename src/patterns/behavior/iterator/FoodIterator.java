package patterns.behavior.iterator;

import java.util.List;

/**
 * @author One
 * @description 迭代器实现
 * @date 2019/01/08
 */
public class FoodIterator implements Iterator<Food> {
    private List<Food> list;
    private int position = 0;

    public FoodIterator(List<Food> list) {
        this.list = list;
    }

    @Override
    public Food getNext() {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Food food = list.get(position);
        position++;
        return food;
    }

    @Override
    public boolean isLast() {
        if (list != null && position >= list.size()) {
            return true;
        }
        return false;
    }
}
