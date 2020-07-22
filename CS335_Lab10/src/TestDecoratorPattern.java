import java.text.DecimalFormat;

public class TestDecoratorPattern {
	
	public static void main(String[] args) {
		
		DecimalFormat dformat = new DecimalFormat("#.##");
		Pizza pizza = new SimplyVegPizza();
		
		pizza = new RomaTomatoes(pizza);
		pizza = new GreenOlives(pizza);
		pizza = new Spinach(pizza);
		pizza = new Peppers(pizza);
		pizza = new Pineapples(pizza);
		
		System.out.println("Desc: "+pizza.getDesc());
		System.out.println("Price: "+dformat.format(pizza.getPrice()));
		
		pizza = new SimplyNonVegPizza();
		
		pizza = new Meat(pizza);
		pizza = new Cheese(pizza);
		pizza = new Cheese(pizza);
		pizza = new Ham(pizza);
		pizza = new Mushrooms(pizza);
		
		System.out.println("Desc: "+pizza.getDesc());

		Pizza pizza1 = MealDeals.TexasGrillPizza;
		System.out.println("Desc "+pizza1.getDesc());
		System.out.println("Price "+pizza1.getPrice());


		}



}
