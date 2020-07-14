package com.itany.zshop.pojo;

import java.io.Serializable;
import java.util.Date;

public class Cart implements Serializable {
    private Integer id;
    private String name;
    private String customerName;
    private Double price;
    private String info;
    private String image;
    private Integer mounty;
    private Integer success;
    private String size;
    private Date Date;
    private String address;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getMounty() {
        return mounty;
    }

    public void setMounty(Integer mounty) {
        this.mounty = mounty;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", customerName='" + customerName + '\'' +
                ", price=" + price +
                ", info='" + info + '\'' +
                ", image='" + image + '\'' +
                ", mounty=" + mounty +
                ", success=" + success +
                ", size='" + size + '\'' +
                ", Date=" + Date +
                ", address='" + address + '\'' +
                '}';
    }
}
