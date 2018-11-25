package com.wuyi.bigworld.web.home.templete;

import com.wuyi.bigworld.core.model.enums.ErrorCodeEnum;
import com.wuyi.bigworld.core.model.exception.BigWorldException;
import com.wuyi.bigworld.core.model.result.CommonErrorCode;
import com.wuyi.bigworld.web.home.model.PageVO;
import org.slf4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created  by songjh on 2018-11-08 22:04.
 */
public class WebCommonOperateTemplate {

    public static Object operate(Logger logger, String bizName, CommonOperateCallback callback) {

        long startTime = System.currentTimeMillis();
        String log = "执行业务【" + bizName + "】,处理结果：";
        try {

            callback.before();

            Object resultVO = callback.execute();

            callback.after();

            return buildSuccessResult(resultVO);

        } catch (BigWorldException e) {
            return buildFailResult(e);
        } catch (Exception e) {
            return buildFailCommonResult(e);
        }
    }

    private static Map<String, Object> buildFailResult(BigWorldException e) {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("status", "failed");
        resultMap.put("code", e.getErrorCode());
        resultMap.put("message", e.getErrorMessage());
        return resultMap;
    }

    private static Map<String, Object> buildFailCommonResult(Exception e) {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("status", "failed");
        resultMap.put("code", ErrorCodeEnum.SYSTEM_ERROR.getErrorCode());
        resultMap.put("message", ErrorCodeEnum.SYSTEM_ERROR.getErrorMessage());
        return resultMap;
    }

    private static Map<String, Object> buildSuccessResult(Object resultVO) {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("status", "success");
        if (resultVO instanceof PageVO) {
            PageVO pageVO = (PageVO) resultVO;
            resultMap.put("pageInfo", pageVO.getPageInfo());
            resultMap.put("data", pageVO.getModelList());
        } else {
            resultMap.put("data", resultVO);
        }
        return resultMap;
    }
}
