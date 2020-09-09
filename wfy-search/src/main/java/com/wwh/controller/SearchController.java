package com.wwh.controller;

import com.wwh.pojo.BaseResp;
import com.wwh.service.SearchCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/search")
public class SearchController {
    @Autowired
    SearchCompanyService searchCompanyService;

    @RequestMapping("/searchCompany/{index}")
    public BaseResp searchCompany(@PathVariable("index") String index) throws IOException {
        return searchCompanyService.search(index);
    }
}
