package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussluxianjieshaoDao;
import com.entity.DiscussluxianjieshaoEntity;
import com.service.DiscussluxianjieshaoService;
import com.entity.vo.DiscussluxianjieshaoVO;
import com.entity.view.DiscussluxianjieshaoView;

@Service("discussluxianjieshaoService")
public class DiscussluxianjieshaoServiceImpl extends ServiceImpl<DiscussluxianjieshaoDao, DiscussluxianjieshaoEntity> implements DiscussluxianjieshaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussluxianjieshaoEntity> page = this.selectPage(
                new Query<DiscussluxianjieshaoEntity>(params).getPage(),
                new EntityWrapper<DiscussluxianjieshaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussluxianjieshaoEntity> wrapper) {
		  Page<DiscussluxianjieshaoView> page =new Query<DiscussluxianjieshaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussluxianjieshaoVO> selectListVO(Wrapper<DiscussluxianjieshaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussluxianjieshaoVO selectVO(Wrapper<DiscussluxianjieshaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussluxianjieshaoView> selectListView(Wrapper<DiscussluxianjieshaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussluxianjieshaoView selectView(Wrapper<DiscussluxianjieshaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
