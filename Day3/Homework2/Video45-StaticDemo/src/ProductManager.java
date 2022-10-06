public class ProductManager {
    public void add(Product product){
        if(ProductValidator.isValid(product)){
            System.out.println("added : " + product.name);
        }else{
            System.out.println("product is not validate");
        }
    }
}
