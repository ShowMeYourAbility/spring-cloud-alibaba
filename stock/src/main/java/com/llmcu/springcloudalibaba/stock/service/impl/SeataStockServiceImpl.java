package com.llmcu.springcloudalibaba.stock.service.impl;

import com.llmcu.springcloudalibaba.stock.dao.TStockMapper;
import com.llmcu.springcloudalibaba.stock.pojo.TStock;
import com.llmcu.springcloudalibaba.stock.service.SeataStockService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * xxxx
 *
 * @author liuling
 * @date 2022/8/9 18:32
 */
@Service
public class SeataStockServiceImpl implements SeataStockService {
    @Autowired
    private  TStockMapper stockMapper;

    @Override
    public void createStock() {
        TStock stock = new TStock();
        stock.setStockCnt(100);
        stock.setProductId(Sid.nextShort());
        stock.setCreateBy("system");
        stock.setUpdateBy("system");
        stock.setCreateTime(new Date());
        stock.setUpdateTime(new Date());
        stockMapper.insertSelective(stock);
    }
}
