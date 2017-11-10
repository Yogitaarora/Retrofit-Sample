
package retrofit.techindustan.com.retrofitsample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductImageThumbnails {

    @SerializedName("product_image_100_100")
    @Expose
    private String productImage100100;
    @SerializedName("product_image_200_200")
    @Expose
    private String productImage200200;
    @SerializedName("product_image_300_300")
    @Expose
    private String productImage300300;

    public String getProductImage100100() {
        return productImage100100;
    }

    public void setProductImage100100(String productImage100100) {
        this.productImage100100 = productImage100100;
    }

    public String getProductImage200200() {
        return productImage200200;
    }

    public void setProductImage200200(String productImage200200) {
        this.productImage200200 = productImage200200;
    }

    public String getProductImage300300() {
        return productImage300300;
    }

    public void setProductImage300300(String productImage300300) {
        this.productImage300300 = productImage300300;
    }

}
