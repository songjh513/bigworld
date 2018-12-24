/*
 * Copyright 2015-2102 Fast(http://www.cloudate.net) Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wuyi.bigworld.biz.inspect.service;


import com.wuyi.bigworld.core.model.entity.user.RpUserInfo;
import com.wuyi.bigworld.core.model.page.PageBean;
import com.wuyi.bigworld.core.model.page.PageParam;

import java.util.List;

/**
 * 用户信息service接口
 */
public interface RpUserInfoService {
	
	/**
	 * 保存
	 */
	void saveData(RpUserInfo rpUserInfo);

	/**
	 * 更新
	 */
	void updateData(RpUserInfo rpUserInfo);

	/**
	 * 根据id获取数据
	 * 
	 * @param id
	 * @return
	 */
	RpUserInfo getDataById(String id);
	

	/**
	 * 获取分页数据
	 * 
	 * @param pageParam
	 * @return
	 */
	PageBean listPage(PageParam pageParam, RpUserInfo rpUserInfo);
	


	/**
	 * 根据商户编号获取商户信息
	 * @param merchantNo
	 * @return
	 */
	RpUserInfo getDataByMerchentNo(String merchantNo);
	
	/**
	 * 根据手机号获取商户信息
	 * @param mobile
	 * @return
	 */
	RpUserInfo getDataByMobile(String mobile);
	
	/**
	 * 获取所有用户
	 * @return
	 */
	List<RpUserInfo> listAll();
	
}