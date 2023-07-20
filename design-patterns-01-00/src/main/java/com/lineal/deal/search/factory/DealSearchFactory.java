package com.lineal.deal.search.factory;

import com.lineal.deal.search.service.IDealSearchService;
import com.lineal.deal.search.service.impl.FuturesDealSearchService;
import com.lineal.deal.search.service.impl.FxDealSearchService;
import com.lineal.deal.search.service.impl.SpotDealSearchService;

/**
 * @description: 交易查询工厂类
 * @author: lineal
 * @date: 2023/7/18
 * @version: 1.0
 **/
public class DealSearchFactory {

    public IDealSearchService getDealSearchService(Integer flag){
        if (flag == 1) return new FuturesDealSearchService();
        if (flag == 2) return new FxDealSearchService();
        if (flag == 3) return new SpotDealSearchService();
        throw new RuntimeException("未找到符合符合条件的交易查询服务");
    }
}
