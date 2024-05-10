package com.entity.view;

import com.entity.GoumaicaipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 购买菜品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-30 18:53:28
 */
@TableName("goumaicaipin")
public class GoumaicaipinView  extends GoumaicaipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GoumaicaipinView(){
	}
 
 	public GoumaicaipinView(GoumaicaipinEntity goumaicaipinEntity){
 	try {
			BeanUtils.copyProperties(this, goumaicaipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
