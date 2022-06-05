package org.share.domain;

import java.math.BigDecimal;

public class Position {
    Share share;
    Integer quantity;
    BigDecimal price;

    public Position(Share share, Integer quantity, BigDecimal price) {
        this.share = share;
        this.quantity = quantity;
        this.price = price;
    }

    public Share getShare() {
        return share;
    }

    public void setShare(Share share) {
        this.share = share;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Position{" +
                "share=" + share +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
