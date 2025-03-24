package com.entity.view;

import com.entity.DiscussluxianjieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 路线介绍评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-23 17:22:01
 */
@TableName("discussluxianjieshao")
public class DiscussluxianjieshaoView  extends DiscussluxianjieshaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussluxianjieshaoView(){
	}
 
 	public DiscussluxianjieshaoView(DiscussluxianjieshaoEntity discussluxianjieshaoEntity){
 	try {
			BeanUtils.copyProperties(this, discussluxianjieshaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
