public class CafeSabor implements PedidoCafe {
    private String sabor;
 
    public CafeSabor(String sabor) {
        this.sabor = sabor;
    }
 
    public String getSabor() {
        return this.sabor;
    }
 
    public void pedirCafe(CafeMenuContext context) {
        System.out.println("Servir cafe sabor " + sabor + " para numero do pedido " + context.getTable());
    }
}

