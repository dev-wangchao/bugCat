package exce;

public class InventoryShortageException extends RuntimeException{

    private final String sku;    // 商品唯一编码
    private final int availableStock;   //可用库存
    private final String productName;   //商品需求

    public InventoryShortageException(String sku, int availableStock, String productName) {
        // 生成友好提示
        super(String.format("SKU:%s库存不足，可用库存:%d，商品需求:%s", sku, availableStock, productName));
        this.sku = sku;
        this.availableStock = availableStock;
        this.productName = productName;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + String.format("SKU:%s库存需求补货！", sku);
    }

    public String getSku() {
        return sku;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public String getProductName() {
        return productName;
    }
}
