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


import com.dao.GoumaicaipinDao;
import com.entity.GoumaicaipinEntity;
import com.service.GoumaicaipinService;
import com.entity.vo.GoumaicaipinVO;
import com.entity.view.GoumaicaipinView;

@Service("goumaicaipinService")
public class GoumaicaipinServiceImpl extends ServiceImpl<GoumaicaipinDao, GoumaicaipinEntity> implements GoumaicaipinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GoumaicaipinEntity> page = this.selectPage(
                new Query<GoumaicaipinEntity>(params).getPage(),
                new EntityWrapper<GoumaicaipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GoumaicaipinEntity> wrapper) {
		  Page<GoumaicaipinView> page =new Query<GoumaicaipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GoumaicaipinVO> selectListVO(Wrapper<GoumaicaipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GoumaicaipinVO selectVO(Wrapper<GoumaicaipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GoumaicaipinView> selectListView(Wrapper<GoumaicaipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GoumaicaipinView selectView(Wrapper<GoumaicaipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
