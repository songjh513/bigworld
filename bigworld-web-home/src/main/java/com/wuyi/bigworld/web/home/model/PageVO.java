package com.wuyi.bigworld.web.home.model;

import com.wuyi.bigworld.core.model.common.Result;
import com.wuyi.bigworld.core.model.result.CommonErrorCode;

import java.util.List;

/**
 * Created  by songjh on 2018-11-09 07:26.
 */
public class PageVO<T> extends Result {

   private  PageInfo pageInfo;

   private List<T> modelList;


    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<T> getModelList() {
        return modelList;
    }

    public void setModelList(List<T> modelList) {
        this.modelList = modelList;
    }
}
