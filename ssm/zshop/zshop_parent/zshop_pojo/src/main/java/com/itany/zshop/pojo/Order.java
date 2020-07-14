package com.itany.zshop.pojo;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private Integer id;
    private Integer customerId;
    private Double price;
    private Date createDate;
    private String image;
    private String productName;
    private String productInfo;

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }



    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", price=" + price +
                ", createDate=" + createDate +
                ", image='" + image + '\'' +
                ", productName='" + productName + '\'' +
                ", productInfo='" + productInfo + '\'' +
                '}';
    }
}
