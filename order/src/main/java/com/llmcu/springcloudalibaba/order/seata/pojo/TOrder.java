package com.llmcu.springcloudalibaba.order.seata.pojo;

import javax.annotation.Generated;
import java.util.Date;

public class TOrder {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.order_id")
    private String orderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.order_name")
    private String orderName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.product_id")
    private String productId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.product_cnt")
    private String productCnt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.create_by")
    private String createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.update_time")
    private Date updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.update_by")
    private String updateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.order_id")
    public String getOrderId() {
        return orderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.order_id")
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.order_name")
    public String getOrderName() {
        return orderName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.order_name")
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.product_id")
    public String getProductId() {
        return productId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.product_cnt")
    public String getProductCnt() {
        return productCnt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.product_cnt")
    public void setProductCnt(String productCnt) {
        this.productCnt = productCnt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.create_by")
    public String getCreateBy() {
        return createBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.create_by")
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.update_time")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.update_by")
    public String getUpdateBy() {
        return updateBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.update_by")
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TOrder other = (TOrder) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderName() == null ? other.getOrderName() == null : this.getOrderName().equals(other.getOrderName()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProductCnt() == null ? other.getProductCnt() == null : this.getProductCnt().equals(other.getProductCnt()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderName() == null) ? 0 : getOrderName().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductCnt() == null) ? 0 : getProductCnt().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderName=").append(orderName);
        sb.append(", productId=").append(productId);
        sb.append(", productCnt=").append(productCnt);
        sb.append(", createTime=").append(createTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append("]");
        return sb.toString();
    }
}