public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.id = 1;
        product.name = "Laptop";
        product.price = 100;

        productManager.add(product);

        DatabaseHelper.Crud.Create();
        DatabaseHelper.Connection.createConnection();
    }
}
