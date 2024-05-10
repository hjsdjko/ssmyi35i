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


import com.dao.DingdanlingquDao;
import com.entity.DingdanlingquEntity;
import com.service.DingdanlingquService;
import com.entity.vo.DingdanlingquVO;
import com.entity.view.DingdanlingquView;

@Service("dingdanlingquService")
public class DingdanlingquServiceImpl extends ServiceImpl<DingdanlingquDao, DingdanlingquEntity> implements DingdanlingquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingdanlingquEntity> page = this.selectPage(
                new Query<DingdanlingquEntity>(params).getPage(),
                new EntityWrapper<DingdanlingquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingdanlingquEntity> wrapper) {
		  Page<DingdanlingquView> page =new Query<DingdanlingquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingdanlingquVO> selectListVO(Wrapper<DingdanlingquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingdanlingquVO selectVO(Wrapper<DingdanlingquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingdanlingquView> selectListView(Wrapper<DingdanlingquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingdanlingquView selectView(Wrapper<DingdanlingquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
