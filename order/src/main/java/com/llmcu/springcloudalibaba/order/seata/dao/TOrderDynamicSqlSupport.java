//package com.llmcu.springcloudalibaba.order.seata.dao;
//
//import org.mybatis.dynamic.sql.AliasableSqlTable;
//import org.mybatis.dynamic.sql.SqlColumn;
//
//import javax.annotation.Generated;
//import java.sql.JDBCType;
//import java.util.Date;
//
//public final class TOrderDynamicSqlSupport {
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    public static final TOrder TOrder = new TOrder();
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.order_id")
//    public static final SqlColumn<String> orderId = TOrder.orderId;
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.order_name")
//    public static final SqlColumn<String> orderName = TOrder.orderName;
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.product_id")
//    public static final SqlColumn<String> productId = TOrder.productId;
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.product_cnt")
//    public static final SqlColumn<String> productCnt = TOrder.productCnt;
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.create_time")
//    public static final SqlColumn<Date> createTime = TOrder.createTime;
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.create_by")
//    public static final SqlColumn<String> createBy = TOrder.createBy;
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.update_time")
//    public static final SqlColumn<Date> updateTime = TOrder.updateTime;
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: t_order.update_by")
//    public static final SqlColumn<String> updateBy = TOrder.updateBy;
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    public static final class TOrder extends AliasableSqlTable<TOrder> {
//        public final SqlColumn<String> orderId = column("order_id", JDBCType.VARCHAR);
//
//        public final SqlColumn<String> orderName = column("order_name", JDBCType.VARCHAR);
//
//        public final SqlColumn<String> productId = column("product_id", JDBCType.VARCHAR);
//
//        public final SqlColumn<String> productCnt = column("product_cnt", JDBCType.VARCHAR);
//
//        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);
//
//        public final SqlColumn<String> createBy = column("create_by", JDBCType.VARCHAR);
//
//        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);
//
//        public final SqlColumn<String> updateBy = column("update_by", JDBCType.VARCHAR);
//
//        public TOrder() {
//            super("t_order", TOrder::new);
//        }
//    }
//}