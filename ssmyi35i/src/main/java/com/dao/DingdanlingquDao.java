package com.dao;

import com.entity.DingdanlingquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingdanlingquVO;
import com.entity.view.DingdanlingquView;


/**
 * 订单领取
 * 
 * @author 
 * @email 
 * @date 2021-05-30 18:53:28
 */
public interface DingdanlingquDao extends BaseMapper<DingdanlingquEntity> {
	
	List<DingdanlingquVO> selectListVO(@Param("ew") Wrapper<DingdanlingquEntity> wrapper);
	
	DingdanlingquVO selectVO(@Param("ew") Wrapper<DingdanlingquEntity> wrapper);
	
	List<DingdanlingquView> selectListView(@Param("ew") Wrapper<DingdanlingquEntity> wrapper);

	List<DingdanlingquView> selectListView(Pagination page,@Param("ew") Wrapper<DingdanlingquEntity> wrapper);
	
	DingdanlingquView selectView(@Param("ew") Wrapper<DingdanlingquEntity> wrapper);
	
}
