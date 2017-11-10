
package retrofit.techindustan.com.retrofitsample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("product_id")
    @Expose
    private String productId;
    @SerializedName("product_name")
    @Expose
    private String productName;
    @SerializedName("product_original_price")
    @Expose
    private String productOriginalPrice;
    @SerializedName("product_new_price")
    @Expose
    private String productNewPrice;
    @SerializedName("product_detail")
    @Expose
    private String productDetail;
    @SerializedName("product_brand")
    @Expose
    private String productBrand;
    @SerializedName("product_image")
    @Expose
    private String productImage;
    @SerializedName("product_sizes")
    @Expose
    private String productSizes;
    @SerializedName("product_colors")
    @Expose
    private String productColors;
    @SerializedName("product_currency")
    @Expose
    private String productCurrency;
    @SerializedName("store_name")
    @Expose
    private String storeName;
    @SerializedName("store_id")
    @Expose
    private String storeId;
    @SerializedName("product_image_thumbnails")
    @Expose
    private ProductImageThumbnails productImageThumbnails;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductOriginalPrice() {
        return productOriginalPrice;
    }

    public void setProductOriginalPrice(String productOriginalPrice) {
        this.productOriginalPrice = productOriginalPrice;
    }

    public String getProductNewPrice() {
        return productNewPrice;
    }

    public void setProductNewPrice(String productNewPrice) {
        this.productNewPrice = productNewPrice;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductSizes() {
        return productSizes;
    }

    public void setProductSizes(String productSizes) {
        this.productSizes = productSizes;
    }

    public String getProductColors() {
        return productColors;
    }

    public void setProductColors(String productColors) {
        this.productColors = productColors;
    }

    public String getProductCurrency() {
        return productCurrency;
    }

    public void setProductCurrency(String productCurrency) {
        this.productCurrency = productCurrency;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public ProductImageThumbnails getProductImageThumbnails() {
        return productImageThumbnails;
    }

    public void setProductImageThumbnails(ProductImageThumbnails productImageThumbnails) {
        this.productImageThumbnails = productImageThumbnails;
    }

}
