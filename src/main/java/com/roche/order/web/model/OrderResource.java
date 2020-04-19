package com.roche.order.web.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderResource {
    private String id;
    private Date date;
    private List<String> orderLines;
    private BigDecimal total;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<String> orderLines) {
        this.orderLines = orderLines;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
