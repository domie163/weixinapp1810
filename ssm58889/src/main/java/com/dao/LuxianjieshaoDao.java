package com.dao;

import com.entity.LuxianjieshaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LuxianjieshaoVO;
import com.entity.view.LuxianjieshaoView;


/**
 * 路线介绍
 * 
 * @author 
 * @email 
 * @date 2022-04-23 17:22:01
 */
public interface LuxianjieshaoDao extends BaseMapper<LuxianjieshaoEntity> {
	
	List<LuxianjieshaoVO> selectListVO(@Param("ew") Wrapper<LuxianjieshaoEntity> wrapper);
	
	LuxianjieshaoVO selectVO(@Param("ew") Wrapper<LuxianjieshaoEntity> wrapper);
	
	List<LuxianjieshaoView> selectListView(@Param("ew") Wrapper<LuxianjieshaoEntity> wrapper);

	List<LuxianjieshaoView> selectListView(Pagination page,@Param("ew") Wrapper<LuxianjieshaoEntity> wrapper);
	
	LuxianjieshaoView selectView(@Param("ew") Wrapper<LuxianjieshaoEntity> wrapper);
	

}
