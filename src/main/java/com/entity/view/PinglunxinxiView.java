package com.entity.view;

import com.entity.PinglunxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 评论信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-23 22:30:25
 */
@TableName("pinglunxinxi")
public class PinglunxinxiView  extends PinglunxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PinglunxinxiView(){
	}
 
 	public PinglunxinxiView(PinglunxinxiEntity pinglunxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, pinglunxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}