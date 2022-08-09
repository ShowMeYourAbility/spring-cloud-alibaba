package com.llmcu.springcloudalibaba.stock.dao;

import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

import javax.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;

public final class TStockDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    public static final TStock TStock = new TStock();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.product_id")
    public static final SqlColumn<String> productId = TStock.productId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.stock_cnt")
    public static final SqlColumn<Integer> stockCnt = TStock.stockCnt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.create_time")
    public static final SqlColumn<Date> createTime = TStock.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.create_by")
    public static final SqlColumn<String> createBy = TStock.createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.update_time")
    public static final SqlColumn<Date> updateTime = TStock.updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_stock.update_by")
    public static final SqlColumn<String> updateBy = TStock.updateBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    public static final class TStock extends AliasableSqlTable<TStock> {
        public final SqlColumn<String> productId = column("product_id", JDBCType.VARCHAR);

        public final SqlColumn<Integer> stockCnt = column("stock_cnt", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> createBy = column("create_by", JDBCType.VARCHAR);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> updateBy = column("update_by", JDBCType.VARCHAR);

        public TStock() {
            super("t_stock", TStock::new);
        }
    }
}