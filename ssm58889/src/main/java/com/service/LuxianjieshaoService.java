package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LuxianjieshaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LuxianjieshaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LuxianjieshaoView;


/**
 * 路线介绍
 *
 * @author 
 * @email 
 * @date 2022-04-23 17:22:01
 */
public interface LuxianjieshaoService extends IService<LuxianjieshaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LuxianjieshaoVO> selectListVO(Wrapper<LuxianjieshaoEntity> wrapper);
   	
   	LuxianjieshaoVO selectVO(@Param("ew") Wrapper<LuxianjieshaoEntity> wrapper);
   	
   	List<LuxianjieshaoView> selectListView(Wrapper<LuxianjieshaoEntity> wrapper);
   	
   	LuxianjieshaoView selectView(@Param("ew") Wrapper<LuxianjieshaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LuxianjieshaoEntity> wrapper);
   	

}

