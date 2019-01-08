package patterns.behavior.iterator;

/**
 * @author One
 * @description 迭代器模式实验
 * @date 2019/01/08
 */
public class IteratorLab {
    public static void main(String[] args) {
        FoodCollection foodCollection = new FoodCollection();
        foodCollection.addFood(new Food(3, "面包"));
        foodCollection.addFood(new Food(7, "面条"));
        foodCollection.addFood(new Food(10, "蛋糕"));
        Iterator<Food> iterator = foodCollection.getIterator();
        while (!iterator.isLast()){
            Food next = iterator.getNext();
            System.out.println(next);
        }
    }
}
