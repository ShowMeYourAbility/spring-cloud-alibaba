package com.llmcu.springcloudalibaba.order.seata.service.impl;

import com.llmcu.springcloudalibaba.order.seata.dao.TOrderMapper;
import com.llmcu.springcloudalibaba.order.seata.feign.SeataStockService;
import com.llmcu.springcloudalibaba.order.seata.pojo.TOrder;
import com.llmcu.springcloudalibaba.order.seata.service.SeataOrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.skywalking.apm.toolkit.trace.Tag;
import org.apache.skywalking.apm.toolkit.trace.Tags;
import org.apache.skywalking.apm.toolkit.trace.Trace;
import org.n3r.idworker.Sid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/8/9 18:14
 */
@Service
public class SeataOrderServiceImpl implements SeataOrderService {
    @Autowired
    private TOrderMapper tOrderMapper;
    @Autowired
    private SeataStockService seataStockService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    @GlobalTransactional
    @Trace
//    @Tag(key="createOrder",value="arg[0]")
    @Tags({@Tag(key="param",value="arg[0]"),@Tag(key="result",value="returnedObj")})
    public boolean createOrder(String cnt) {
        logger.info("现在开始createOrder{}",cnt);
        TOrder tOrder = new TOrder();
        tOrder.setOrderId(Sid.nextShort());
        tOrder.setOrderName("orderName" + Sid.nextShort());
        tOrder.setProductCnt(cnt);
        tOrder.setCreateTime(new Date());
        tOrder.setUpdateTime(new Date());
        tOrder.setCreateBy("system");
        tOrder.setUpdateBy("system");
        tOrderMapper.insertSelective(tOrder);

        seataStockService.createStock();

//        int a = 1 / 0;
        return true;
    }
}
