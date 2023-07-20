package com.lineal.deal.search;

import com.lineal.deal.search.factory.DealSearchFactory;
import com.lineal.deal.search.service.IDealSearchService;
import org.junit.Test;

/**
 * @description: 交易查询工厂设计模式测试类
 * @author: lineal
 * @date: 2023/7/19
 * @version: 1.0
 **/
public class DealSearchFactoryTest {

    @Test
    public void test(){
        DealSearchFactory factory = new DealSearchFactory();
        IDealSearchService dealSearchService = factory.getDealSearchService(1);
        IDealSearchService searchService = factory.getDealSearchService(2);
        IDealSearchService service = factory.getDealSearchService(3);
//        IDealSearchService iDealSearchService = factory.getDealSearchService(4);
        dealSearchService.dealSearch();
        searchService.dealSearch();
        service.dealSearch();
//        iDealSearchService.dealSearch();
    }
}
