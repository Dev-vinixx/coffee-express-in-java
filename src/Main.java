import coffee.Coffee;

public class Main {
    public static void main(String[] args) {
        try {
            Coffee coffee = new Coffee(15, 10, 15, 500, true, true, true);
            coffee.coffeeStrainer();
            coffee.hootWater(500);
            coffee.coffeeCoup();
            System.out.println(coffee.drinkCoffee());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}