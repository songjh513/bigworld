package com.wuyi.bigworld.biz.framework.api.engine;

import com.wuyi.bigworld.biz.framework.api.DispatchContext;
import com.wuyi.bigworld.biz.framework.api.RequestData;
import com.wuyi.bigworld.biz.framework.api.ResponseData;

/**
 * Created  by songjh on 2018-10-14 11:50.
 */
public interface ApiEngine {

   String run(DispatchContext dispatchContext);

}
