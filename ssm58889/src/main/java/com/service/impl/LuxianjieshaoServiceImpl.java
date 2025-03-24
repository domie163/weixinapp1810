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


import com.dao.LuxianjieshaoDao;
import com.entity.LuxianjieshaoEntity;
import com.service.LuxianjieshaoService;
import com.entity.vo.LuxianjieshaoVO;
import com.entity.view.LuxianjieshaoView;

@Service("luxianjieshaoService")
public class LuxianjieshaoServiceImpl extends ServiceImpl<LuxianjieshaoDao, LuxianjieshaoEntity> implements LuxianjieshaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LuxianjieshaoEntity> page = this.selectPage(
                new Query<LuxianjieshaoEntity>(params).getPage(),
                new EntityWrapper<LuxianjieshaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LuxianjieshaoEntity> wrapper) {
		  Page<LuxianjieshaoView> page =new Query<LuxianjieshaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LuxianjieshaoVO> selectListVO(Wrapper<LuxianjieshaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LuxianjieshaoVO selectVO(Wrapper<LuxianjieshaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LuxianjieshaoView> selectListView(Wrapper<LuxianjieshaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LuxianjieshaoView selectView(Wrapper<LuxianjieshaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
