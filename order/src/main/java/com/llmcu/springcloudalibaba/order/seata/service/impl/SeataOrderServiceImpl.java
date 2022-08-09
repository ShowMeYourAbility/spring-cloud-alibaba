//package com.llmcu.springcloudalibaba.order.seata.service.impl;
//
//import com.llmcu.springcloudalibaba.order.seata.dao.TOrderMapper;
//import com.llmcu.springcloudalibaba.order.seata.pojo.TOrder;
//import com.llmcu.springcloudalibaba.order.seata.service.SeataOrderService;
//import org.n3r.idworker.Sid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//
///**
// * xxxx
// *
// * @author liuling
// * @date 2022/8/9 18:14
// */
////@Service
//public class SeataOrderServiceImpl implements SeataOrderService {
//    @Autowired
//    private TOrderMapper tOrderMapper;
//    @Override
//    public void createOrder() {
//        TOrder tOrder = new TOrder();
//        tOrder.setOrderId(Sid.nextShort());
//        tOrder.setOrderName("orderName"+Sid.nextShort());
//        tOrder.setProductCnt("2");
//        tOrder.setCreateTime(new Date());
//        tOrder.setUpdateTime(new Date());
//        tOrder.setCreateBy("system");
//        tOrder.setUpdateBy("system");
//        tOrderMapper.insertSelective(tOrder);
//    }
//}
