package com.entity.view;

import com.entity.DingdanlingquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 订单领取
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-30 18:53:28
 */
@TableName("dingdanlingqu")
public class DingdanlingquView  extends DingdanlingquEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DingdanlingquView(){
	}
 
 	public DingdanlingquView(DingdanlingquEntity dingdanlingquEntity){
 	try {
			BeanUtils.copyProperties(this, dingdanlingquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
