package Bt5;

public class ProductionEmployee extends Employee {
    private int productCount;
    private double pricePerProduct;

    public ProductionEmployee(int productCount, double pricePerProduct) {
        this.productCount = productCount;
        this.pricePerProduct = pricePerProduct;
    }

    @Override
    public double calculateSalary() {
        return productCount * pricePerProduct;
    }
}