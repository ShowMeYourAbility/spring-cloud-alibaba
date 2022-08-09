package com.llmcu.springcloudalibaba.stock.dao;

import com.llmcu.springcloudalibaba.stock.pojo.TStock;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.*;

import javax.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static com.llmcu.springcloudalibaba.stock.dao.TStockDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface TStockMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<TStock>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    BasicColumn[] selectList = BasicColumn.columnList(productId, stockCnt, createTime, createBy, updateTime, updateBy);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TStockResult", value = {
        @Result(column="product_id", property="productId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="stock_cnt", property="stockCnt", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_by", property="updateBy", jdbcType=JdbcType.VARCHAR)
    })
    List<TStock> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TStockResult")
    Optional<TStock> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TStock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TStock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    default int deleteByPrimaryKey(String productId_) {
        return delete(c -> 
            c.where(productId, isEqualTo(productId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    default int insert(TStock row) {
        return MyBatis3Utils.insert(this::insert, row, TStock, c ->
            c.map(productId).toProperty("productId")
            .map(stockCnt).toProperty("stockCnt")
            .map(createTime).toProperty("createTime")
            .map(createBy).toProperty("createBy")
            .map(updateTime).toProperty("updateTime")
            .map(updateBy).toProperty("updateBy")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    default int insertMultiple(Collection<TStock> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TStock, c ->
            c.map(productId).toProperty("productId")
            .map(stockCnt).toProperty("stockCnt")
            .map(createTime).toProperty("createTime")
            .map(createBy).toProperty("createBy")
            .map(updateTime).toProperty("updateTime")
            .map(updateBy).toProperty("updateBy")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    default int insertSelective(TStock row) {
        return MyBatis3Utils.insert(this::insert, row, TStock, c ->
            c.map(productId).toPropertyWhenPresent("productId", row::getProductId)
            .map(stockCnt).toPropertyWhenPresent("stockCnt", row::getStockCnt)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(createBy).toPropertyWhenPresent("createBy", row::getCreateBy)
            .map(updateTime).toPropertyWhenPresent("updateTime", row::getUpdateTime)
            .map(updateBy).toPropertyWhenPresent("updateBy", row::getUpdateBy)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    default Optional<TStock> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TStock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    default List<TStock> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TStock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    default List<TStock> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TStock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    default Optional<TStock> selectByPrimaryKey(String productId_) {
        return selectOne(c ->
            c.where(productId, isEqualTo(productId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TStock, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    static UpdateDSL<UpdateModel> updateAllColumns(TStock row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(productId).equalTo(row::getProductId)
                .set(stockCnt).equalTo(row::getStockCnt)
                .set(createTime).equalTo(row::getCreateTime)
                .set(createBy).equalTo(row::getCreateBy)
                .set(updateTime).equalTo(row::getUpdateTime)
                .set(updateBy).equalTo(row::getUpdateBy);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TStock row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(productId).equalToWhenPresent(row::getProductId)
                .set(stockCnt).equalToWhenPresent(row::getStockCnt)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(createBy).equalToWhenPresent(row::getCreateBy)
                .set(updateTime).equalToWhenPresent(row::getUpdateTime)
                .set(updateBy).equalToWhenPresent(row::getUpdateBy);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    default int updateByPrimaryKey(TStock row) {
        return update(c ->
            c.set(stockCnt).equalTo(row::getStockCnt)
            .set(createTime).equalTo(row::getCreateTime)
            .set(createBy).equalTo(row::getCreateBy)
            .set(updateTime).equalTo(row::getUpdateTime)
            .set(updateBy).equalTo(row::getUpdateBy)
            .where(productId, isEqualTo(row::getProductId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: t_stock")
    default int updateByPrimaryKeySelective(TStock row) {
        return update(c ->
            c.set(stockCnt).equalToWhenPresent(row::getStockCnt)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(createBy).equalToWhenPresent(row::getCreateBy)
            .set(updateTime).equalToWhenPresent(row::getUpdateTime)
            .set(updateBy).equalToWhenPresent(row::getUpdateBy)
            .where(productId, isEqualTo(row::getProductId))
        );
    }
}