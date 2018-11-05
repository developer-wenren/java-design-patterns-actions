package patterns.structure;

/**
 * @author One
 * @description 装饰者模式
 * @date 2018/11/06
 */
public class DecoratorLab {
    public static void main(String[] args) {
        Drink coffee = new Coffee();
        System.out.println(coffee.getDescription() + ",cost:" + coffee.cost());
//        it's coffee,cost:25.0
         coffee = new Milk(coffee);
        System.out.println(coffee.getDescription() + ",cost:" + coffee.cost());
//        it's coffeewith milk,cost:28.0
        coffee = new Sugar(coffee);
        System.out.println(coffee.getDescription() + ",cost:" + coffee.cost());
//        it's coffeewith milkwith sugar,cost:31.0
    }
}


interface Drink {
    float cost();

    String getDescription();
}

class Coffee implements Drink {

    @Override
    public float cost() {
        return 25;
    }

    @Override
    public String getDescription() {
        return "it's coffee";
    }
}

class DrinkDecorator implements Drink {
    private Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return drink.cost();
    }

    @Override
    public String getDescription() {
        return drink.getDescription();
    }
}

class Milk extends DrinkDecorator {

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public float cost() {
        return super.cost() + 3;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "with milk";
    }
}

class Sugar extends DrinkDecorator {

    public Sugar(Drink drink) {
        super(drink);
    }

    @Override
    public float cost() {
        return super.cost() + 3;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "with sugar";
    }
}