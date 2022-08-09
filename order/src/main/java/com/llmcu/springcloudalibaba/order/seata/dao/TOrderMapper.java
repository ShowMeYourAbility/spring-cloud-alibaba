//package com.llmcu.springcloudalibaba.order.seata.dao;
//
//import com.llmcu.springcloudalibaba.order.seata.pojo.TOrder;
//import org.apache.ibatis.annotations.*;
//import org.apache.ibatis.type.JdbcType;
//import org.mybatis.dynamic.sql.BasicColumn;
//import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
//import org.mybatis.dynamic.sql.select.CountDSLCompleter;
//import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
//import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
//import org.mybatis.dynamic.sql.update.UpdateDSL;
//import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
//import org.mybatis.dynamic.sql.update.UpdateModel;
//import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
//import org.mybatis.dynamic.sql.util.mybatis3.*;
//
//import javax.annotation.Generated;
//import java.util.Collection;
//import java.util.List;
//import java.util.Optional;
//
//import static com.llmcu.springcloudalibaba.order.seata.dao.TOrderDynamicSqlSupport.*;
//import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
//
////@Mapper
//public interface TOrderMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<TOrder>, CommonUpdateMapper {
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    BasicColumn[] selectList = BasicColumn.columnList(orderId, orderName, productId, productCnt, createTime, createBy, updateTime, updateBy);
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    @SelectProvider(type=SqlProviderAdapter.class, method="select")
//    @Results(id="TOrderResult", value = {
//        @Result(column="order_id", property="orderId", jdbcType=JdbcType.VARCHAR, id=true),
//        @Result(column="order_name", property="orderName", jdbcType=JdbcType.VARCHAR),
//        @Result(column="product_id", property="productId", jdbcType=JdbcType.VARCHAR),
//        @Result(column="product_cnt", property="productCnt", jdbcType=JdbcType.VARCHAR),
//        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
//        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
//        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
//        @Result(column="update_by", property="updateBy", jdbcType=JdbcType.VARCHAR)
//    })
//    List<TOrder> selectMany(SelectStatementProvider selectStatement);
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    @SelectProvider(type=SqlProviderAdapter.class, method="select")
//    @ResultMap("TOrderResult")
//    Optional<TOrder> selectOne(SelectStatementProvider selectStatement);
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    default long count(CountDSLCompleter completer) {
//        return MyBatis3Utils.countFrom(this::count, TOrderDynamicSqlSupport.TOrder, completer);
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    default int delete(DeleteDSLCompleter completer) {
//        return MyBatis3Utils.deleteFrom(this::delete, TOrderDynamicSqlSupport.TOrder, completer);
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    default int deleteByPrimaryKey(String orderId_) {
//        return delete(c ->
//            c.where(orderId, isEqualTo(orderId_))
//        );
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    default int insert(TOrder row) {
//        return MyBatis3Utils.insert(this::insert, row, TOrderDynamicSqlSupport.TOrder, c ->
//            c.map(orderId).toProperty("orderId")
//            .map(orderName).toProperty("orderName")
//            .map(productId).toProperty("productId")
//            .map(productCnt).toProperty("productCnt")
//            .map(createTime).toProperty("createTime")
//            .map(createBy).toProperty("createBy")
//            .map(updateTime).toProperty("updateTime")
//            .map(updateBy).toProperty("updateBy")
//        );
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    default int insertMultiple(Collection<TOrder> records) {
//        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TOrderDynamicSqlSupport.TOrder, c ->
//            c.map(orderId).toProperty("orderId")
//            .map(orderName).toProperty("orderName")
//            .map(productId).toProperty("productId")
//            .map(productCnt).toProperty("productCnt")
//            .map(createTime).toProperty("createTime")
//            .map(createBy).toProperty("createBy")
//            .map(updateTime).toProperty("updateTime")
//            .map(updateBy).toProperty("updateBy")
//        );
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    default int insertSelective(TOrder row) {
//        return MyBatis3Utils.insert(this::insert, row, TOrderDynamicSqlSupport.TOrder, c ->
//            c.map(orderId).toPropertyWhenPresent("orderId", row::getOrderId)
//            .map(orderName).toPropertyWhenPresent("orderName", row::getOrderName)
//            .map(productId).toPropertyWhenPresent("productId", row::getProductId)
//            .map(productCnt).toPropertyWhenPresent("productCnt", row::getProductCnt)
//            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
//            .map(createBy).toPropertyWhenPresent("createBy", row::getCreateBy)
//            .map(updateTime).toPropertyWhenPresent("updateTime", row::getUpdateTime)
//            .map(updateBy).toPropertyWhenPresent("updateBy", row::getUpdateBy)
//        );
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    default Optional<TOrder> selectOne(SelectDSLCompleter completer) {
//        return MyBatis3Utils.selectOne(this::selectOne, selectList, TOrderDynamicSqlSupport.TOrder, completer);
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    default List<TOrder> select(SelectDSLCompleter completer) {
//        return MyBatis3Utils.selectList(this::selectMany, selectList, TOrderDynamicSqlSupport.TOrder, completer);
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    default List<TOrder> selectDistinct(SelectDSLCompleter completer) {
//        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TOrderDynamicSqlSupport.TOrder, completer);
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    default Optional<TOrder> selectByPrimaryKey(String orderId_) {
//        return selectOne(c ->
//            c.where(orderId, isEqualTo(orderId_))
//        );
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    default int update(UpdateDSLCompleter completer) {
//        return MyBatis3Utils.update(this::update, TOrderDynamicSqlSupport.TOrder, completer);
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    static UpdateDSL<UpdateModel> updateAllColumns(TOrder row, UpdateDSL<UpdateModel> dsl) {
//        return dsl.set(orderId).equalTo(row::getOrderId)
//                .set(orderName).equalTo(row::getOrderName)
//                .set(productId).equalTo(row::getProductId)
//                .set(productCnt).equalTo(row::getProductCnt)
//                .set(createTime).equalTo(row::getCreateTime)
//                .set(createBy).equalTo(row::getCreateBy)
//                .set(updateTime).equalTo(row::getUpdateTime)
//                .set(updateBy).equalTo(row::getUpdateBy);
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    static UpdateDSL<UpdateModel> updateSelectiveColumns(TOrder row, UpdateDSL<UpdateModel> dsl) {
//        return dsl.set(orderId).equalToWhenPresent(row::getOrderId)
//                .set(orderName).equalToWhenPresent(row::getOrderName)
//                .set(productId).equalToWhenPresent(row::getProductId)
//                .set(productCnt).equalToWhenPresent(row::getProductCnt)
//                .set(createTime).equalToWhenPresent(row::getCreateTime)
//                .set(createBy).equalToWhenPresent(row::getCreateBy)
//                .set(updateTime).equalToWhenPresent(row::getUpdateTime)
//                .set(updateBy).equalToWhenPresent(row::getUpdateBy);
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    default int updateByPrimaryKey(TOrder row) {
//        return update(c ->
//            c.set(orderName).equalTo(row::getOrderName)
//            .set(productId).equalTo(row::getProductId)
//            .set(productCnt).equalTo(row::getProductCnt)
//            .set(createTime).equalTo(row::getCreateTime)
//            .set(createBy).equalTo(row::getCreateBy)
//            .set(updateTime).equalTo(row::getUpdateTime)
//            .set(updateBy).equalTo(row::getUpdateBy)
//            .where(orderId, isEqualTo(row::getOrderId))
//        );
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_order")
//    default int updateByPrimaryKeySelective(TOrder row) {
//        return update(c ->
//            c.set(orderName).equalToWhenPresent(row::getOrderName)
//            .set(productId).equalToWhenPresent(row::getProductId)
//            .set(productCnt).equalToWhenPresent(row::getProductCnt)
//            .set(createTime).equalToWhenPresent(row::getCreateTime)
//            .set(createBy).equalToWhenPresent(row::getCreateBy)
//            .set(updateTime).equalToWhenPresent(row::getUpdateTime)
//            .set(updateBy).equalToWhenPresent(row::getUpdateBy)
//            .where(orderId, isEqualTo(row::getOrderId))
//        );
//    }
//}