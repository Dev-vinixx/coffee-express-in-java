package coffee.recipe;

import java.util.NoSuchElementException;

public abstract class Recipe {
    //organic ingredients
    private int coffee;
    private int sugar;
    private double water;
    private double hoot_water;
    private boolean fire;

    //no organic ingredientst
    private int strainer;
    private int coffeeStrainer;

    //containers
    private boolean teapot;
    private boolean cup;
    private int coffee_cup;

    public Recipe(int coffee, int strainer, int sugar, double water, boolean fire, boolean teapot, boolean cup) {

        this.coffee = coffee;
        this.strainer = strainer;
        this.sugar = sugar;
        this.water = water;
        this.fire = fire;

        this.teapot = teapot;
        this.cup = cup;
    }

    public void coffeeStrainer() throws NoSuchElementException {
        if (coffee >= 4) {
            if (strainer >= 1) {
                coffeeStrainer = coffeeStrainer + 1;
                coffee = coffee - 4;
                strainer = strainer - 1;
            } else {
                throw new NoSuchElementException("the quantity of available strainers is insufficient to make the strain with coffee.");
            }
        } else {
            throw new NoSuchElementException("the quantity of available coffee spoons is insufficient to make the strain with coffee.");
        }
    }

    public void hootWater(double water) throws NoSuchElementException {
        if (teapot) {
            if (fire) {
                if (this.water >= water) {
                    hoot_water = hoot_water + water;
                    this.water = this.water - water;
                    fire = false;
                    teapot = false;
                } else {
                    throw new NoSuchElementException("the quantity of available water is insufficient to make the hoot water.");
                }
            } else {
                throw new NoSuchElementException("the fire is not available for use.");
            }
        } else {
            throw new NoSuchElementException("the teapot is not available for use.");
        }
    }
    public void coffeeCoup() throws NoSuchElementException {
        if (coffeeStrainer >= 1){
            if (hoot_water >= 500) {
                if (cup) {
                    coffee_cup = coffee_cup + 1;
                    coffeeStrainer = coffeeStrainer - 1;
                    hoot_water = hoot_water - 500;
                    cup = false;
                } else {
                    throw new NoSuchElementException("the cup is not available for use.");
                }
            } else {
                throw new NoSuchElementException("the quantity of available hoot water is insufficient to make the coffee.");
            }
        } else {
            throw new NoSuchElementException("the quantity of available coffee strainers is insufficient to make the coffee.");
        }
    }

    public String drinkCoffee() {
        if (coffee_cup >= 1) {
            return "success you drink the coffee: this here was very good.";
        }
        throw new NoSuchElementException("do you not have cups of coffee for the drink.");
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getHoot_water() {
        return hoot_water;
    }

    public void setHoot_water(double hoot_water) {
        this.hoot_water = hoot_water;
    }

    public boolean isFire() {
        return fire;
    }

    public void setFire(boolean fire) {
        this.fire = fire;
    }

    public int getStrainer() {
        return strainer;
    }

    public void setStrainer(int strainer) {
        this.strainer = strainer;
    }

    public int getCoffeeStrainer() {
        return coffeeStrainer;
    }

    public void setCoffeeStrainer(int coffeeStrainer) {
        this.coffeeStrainer = coffeeStrainer;
    }

    public boolean isTeapot() {
        return teapot;
    }

    public void setTeapot(boolean teapot) {
        this.teapot = teapot;
    }

    public boolean isCup() {
        return cup;
    }

    public void setCup(boolean cup) {
        this.cup = cup;
    }

    public int getCoffee_cup() {
        return coffee_cup;
    }

    public void setCoffee_cup(int coffee_cup) {
        this.coffee_cup = coffee_cup;
    }
}