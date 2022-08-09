package com.llmcu.springcloudalibaba.stock.pojo;

import javax.annotation.Generated;
import java.util.Date;

public class TStock {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.product_id")
    private String productId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.stock_cnt")
    private Integer stockCnt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.create_by")
    private String createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.update_time")
    private Date updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.update_by")
    private String updateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.product_id")
    public String getProductId() {
        return productId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.stock_cnt")
    public Integer getStockCnt() {
        return stockCnt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.stock_cnt")
    public void setStockCnt(Integer stockCnt) {
        this.stockCnt = stockCnt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.create_by")
    public String getCreateBy() {
        return createBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.create_by")
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.update_time")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.update_by")
    public String getUpdateBy() {
        return updateBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.update_by")
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
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
        TStock other = (TStock) that;
        return (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getStockCnt() == null ? other.getStockCnt() == null : this.getStockCnt().equals(other.getStockCnt()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getStockCnt() == null) ? 0 : getStockCnt().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productId=").append(productId);
        sb.append(", stockCnt=").append(stockCnt);
        sb.append(", createTime=").append(createTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append("]");
        return sb.toString();
    }
}