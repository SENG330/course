// From Head First Design Patterns
//base classes
public abstract class Beverage {
	String description = “Unknown Beverage”;
	
	public String getDescription() { 
		return description;
	}
	public abstract double cost(); }
}

public abstract class CondimentDecorator extends Beverage { 
	public abstract String getDescription();
}    

// concrete Beverage classes
public class Espresso extends Beverage {
	public Espresso() { 
		description = "Espresso";
	}
	public double cost() { 
		return 1.99;
	}
}

public class HouseBlend extends Beverage { 
	public HouseBlend() {
		description = "House Blend Coffee"; 
	}
	public double cost() { 
		return .89;
	} 
}

//concrete Decorators
public class Mocha extends CondimentDecorator { 
	Beverage beverage;
	public Mocha(Beverage beverage) { 
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + “, Mocha”;
	}
	public double cost() {
		return .20 + beverage.cost();
	} 
}
//whip, vanilla, caramel etc.

//Test / client code
public class StarbuzzCoffee {
	public static void main(String args[]) { 
		Beverage beverage = new Espresso(); 
		// no decorators
		System.out.println(beverage.getDescription() + “ $” + beverage.cost()); 
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2); //decorate
		System.out.println(beverage2.getDescription() + “ $” + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Mocha(new Whip(beverage3)); // decorate
		System.out.println(beverage3.getDescription() + “ $” + beverage3.cost());
	} 
}