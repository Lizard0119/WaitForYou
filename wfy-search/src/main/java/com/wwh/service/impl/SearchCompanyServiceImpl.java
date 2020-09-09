package com.wwh.service.impl;

import com.wwh.pojo.BaseResp;
import com.wwh.service.SearchCompanyService;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchCompanyServiceImpl implements SearchCompanyService {

    @Autowired
    RestHighLevelClient client;

    @Override
    public BaseResp search(String index) {
        SearchRequest searchRequest = new SearchRequest("wfy-province2city2company");
        searchRequest.types("doc");

        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

        searchSourceBuilder.query(QueryBuilders.multiMatchQuery(index, "","").field("",5));

        return null;
    }
}
