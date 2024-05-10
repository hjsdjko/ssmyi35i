package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GoumaicaipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GoumaicaipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GoumaicaipinView;


/**
 * 购买菜品
 *
 * @author 
 * @email 
 * @date 2021-05-30 18:53:28
 */
public interface GoumaicaipinService extends IService<GoumaicaipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GoumaicaipinVO> selectListVO(Wrapper<GoumaicaipinEntity> wrapper);
   	
   	GoumaicaipinVO selectVO(@Param("ew") Wrapper<GoumaicaipinEntity> wrapper);
   	
   	List<GoumaicaipinView> selectListView(Wrapper<GoumaicaipinEntity> wrapper);
   	
   	GoumaicaipinView selectView(@Param("ew") Wrapper<GoumaicaipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GoumaicaipinEntity> wrapper);
   	
}

