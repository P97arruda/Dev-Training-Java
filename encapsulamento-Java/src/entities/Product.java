package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    // calcula valor total em estoque
    public double totalValueInStock() {
        return price * quantity;
    }

    // adiciona produtos
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    // remove produtos
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // sobrescreve toString para exibir informações
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
