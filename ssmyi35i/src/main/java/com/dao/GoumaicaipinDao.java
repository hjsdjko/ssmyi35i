package com.dao;

import com.entity.GoumaicaipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GoumaicaipinVO;
import com.entity.view.GoumaicaipinView;


/**
 * 购买菜品
 * 
 * @author 
 * @email 
 * @date 2021-05-30 18:53:28
 */
public interface GoumaicaipinDao extends BaseMapper<GoumaicaipinEntity> {
	
	List<GoumaicaipinVO> selectListVO(@Param("ew") Wrapper<GoumaicaipinEntity> wrapper);
	
	GoumaicaipinVO selectVO(@Param("ew") Wrapper<GoumaicaipinEntity> wrapper);
	
	List<GoumaicaipinView> selectListView(@Param("ew") Wrapper<GoumaicaipinEntity> wrapper);

	List<GoumaicaipinView> selectListView(Pagination page,@Param("ew") Wrapper<GoumaicaipinEntity> wrapper);
	
	GoumaicaipinView selectView(@Param("ew") Wrapper<GoumaicaipinEntity> wrapper);
	
}
