package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussluxianjieshaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussluxianjieshaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussluxianjieshaoView;


/**
 * 路线介绍评论表
 *
 * @author 
 * @email 
 * @date 2022-04-23 17:22:01
 */
public interface DiscussluxianjieshaoService extends IService<DiscussluxianjieshaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussluxianjieshaoVO> selectListVO(Wrapper<DiscussluxianjieshaoEntity> wrapper);
   	
   	DiscussluxianjieshaoVO selectVO(@Param("ew") Wrapper<DiscussluxianjieshaoEntity> wrapper);
   	
   	List<DiscussluxianjieshaoView> selectListView(Wrapper<DiscussluxianjieshaoEntity> wrapper);
   	
   	DiscussluxianjieshaoView selectView(@Param("ew") Wrapper<DiscussluxianjieshaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussluxianjieshaoEntity> wrapper);
   	

}

