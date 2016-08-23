public class Test {
	private static CafeSabor[] flavors = new CafeSabor[100];
	/** The tables for the orders. */
	private static CafeMenuContext[] tables = new CafeMenuContext[100];
	private static int ordersMade = 0;
	private static CoffeeFlavorFactory flavorFactory;

	public static void takeOrders(String flavorIn, int table) {
		flavors[ordersMade] = flavorFactory.getCoffeeFlavor(flavorIn);
		tables[ordersMade++] = new CafeMenuContext(table);
	}

	public static void main(String[] args) {
		flavorFactory = new CoffeeFlavorFactory();

		takeOrders("Cappuccino", 2);
		takeOrders("Cappuccino", 2);
		takeOrders("Frappe", 1);
		takeOrders("Frappe", 1);
		takeOrders("Xpresso", 1);
		takeOrders("Frappe", 897);
		takeOrders("Cappuccino", 97);
		takeOrders("Cappuccino", 97);
		takeOrders("Frappe", 3);
		takeOrders("Xpresso", 3);
		takeOrders("Cappuccino", 3);
		takeOrders("Xpresso", 96);
		takeOrders("Frappe", 552);
		takeOrders("Cappuccino", 121);
		takeOrders("Xpresso", 121);

		for (int i = 0; i < ordersMade; ++i) {
			flavors[i].pedirCafe(tables[i]);
		}
		System.out.println(" ");
		System.out.println("total CoffeeFlavor objects made: "
				+ flavorFactory.getTotalCoffeeFlavorsMade());
	}
}
