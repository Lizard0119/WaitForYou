package com.wwh.service;

import com.wwh.pojo.BaseResp;

import java.io.IOException;

public interface SearchCompanyService {
    BaseResp search(String index) throws IOException;
}
