import java.util.HashMap;
import java.util.Map;


public class CoffeeFlavorFactory {
	private Map<String, CafeSabor> sabores = new HashMap<String, CafeSabor>();
	 
    public CafeSabor getCoffeeFlavor(String nomeSabor) {
        CafeSabor flavor = sabores.get(nomeSabor);
        if (flavor == null) {
            flavor = new CafeSabor(nomeSabor);
            sabores.put(nomeSabor, flavor);
        }
        return flavor;
    }
 
    public int getTotalCoffeeFlavorsMade() {
        return sabores.size();
    }
}
