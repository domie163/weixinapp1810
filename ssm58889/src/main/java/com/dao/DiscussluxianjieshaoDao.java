package com.dao;

import com.entity.DiscussluxianjieshaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussluxianjieshaoVO;
import com.entity.view.DiscussluxianjieshaoView;


/**
 * 路线介绍评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-23 17:22:01
 */
public interface DiscussluxianjieshaoDao extends BaseMapper<DiscussluxianjieshaoEntity> {
	
	List<DiscussluxianjieshaoVO> selectListVO(@Param("ew") Wrapper<DiscussluxianjieshaoEntity> wrapper);
	
	DiscussluxianjieshaoVO selectVO(@Param("ew") Wrapper<DiscussluxianjieshaoEntity> wrapper);
	
	List<DiscussluxianjieshaoView> selectListView(@Param("ew") Wrapper<DiscussluxianjieshaoEntity> wrapper);

	List<DiscussluxianjieshaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussluxianjieshaoEntity> wrapper);
	
	DiscussluxianjieshaoView selectView(@Param("ew") Wrapper<DiscussluxianjieshaoEntity> wrapper);
	

}
