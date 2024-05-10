package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingdanlingquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingdanlingquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingdanlingquView;


/**
 * 订单领取
 *
 * @author 
 * @email 
 * @date 2021-05-30 18:53:28
 */
public interface DingdanlingquService extends IService<DingdanlingquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingdanlingquVO> selectListVO(Wrapper<DingdanlingquEntity> wrapper);
   	
   	DingdanlingquVO selectVO(@Param("ew") Wrapper<DingdanlingquEntity> wrapper);
   	
   	List<DingdanlingquView> selectListView(Wrapper<DingdanlingquEntity> wrapper);
   	
   	DingdanlingquView selectView(@Param("ew") Wrapper<DingdanlingquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingdanlingquEntity> wrapper);
   	
}

