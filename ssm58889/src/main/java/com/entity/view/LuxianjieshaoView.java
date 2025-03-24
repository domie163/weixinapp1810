package com.entity.view;

import com.entity.LuxianjieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 路线介绍
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-23 17:22:01
 */
@TableName("luxianjieshao")
public class LuxianjieshaoView  extends LuxianjieshaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LuxianjieshaoView(){
	}
 
 	public LuxianjieshaoView(LuxianjieshaoEntity luxianjieshaoEntity){
 	try {
			BeanUtils.copyProperties(this, luxianjieshaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
