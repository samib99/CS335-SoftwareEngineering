public abstract class MealDeals {
    public static Pizza TexasGrillPizza = new Chicken(new Peppers(new RedOnions(new SimplyNonVegPizza())));
    public static Pizza VegatrianDelightPizza = new Spinach(new RedOnions(new GreenOlives(new Broccoli(new SimplyVegPizza()))));
    public static Pizza NapoliPizza = new FetaCheese(new Spinach(new RomaTomatoes(new GreenOlives(new SimplyVegPizza()))));

    public static Discount VegatarianDiscount = new Discount();

}
