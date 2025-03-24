package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 票务信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-23 17:22:01
 */
@TableName("piaowuxinxi")
public class PiaowuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PiaowuxinxiEntity() {
		
	}
	
	public PiaowuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 票务名称
	 */
					
	private String piaowumingcheng;
	
	/**
	 * 单价
	 */
					
	private Float danjia;
	
	/**
	 * 票数
	 */
					
	private Integer piaoshu;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 开卖时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date kaimaishijian;
	
	/**
	 * 结束时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jieshushijian;
	
	/**
	 * 购票地点
	 */
					
	private String goupiaodidian;
	
	/**
	 * 票务详情
	 */
					
	private String piaowuxiangqing;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：票务名称
	 */
	public void setPiaowumingcheng(String piaowumingcheng) {
		this.piaowumingcheng = piaowumingcheng;
	}
	/**
	 * 获取：票务名称
	 */
	public String getPiaowumingcheng() {
		return piaowumingcheng;
	}
	/**
	 * 设置：单价
	 */
	public void setDanjia(Float danjia) {
		this.danjia = danjia;
	}
	/**
	 * 获取：单价
	 */
	public Float getDanjia() {
		return danjia;
	}
	/**
	 * 设置：票数
	 */
	public void setPiaoshu(Integer piaoshu) {
		this.piaoshu = piaoshu;
	}
	/**
	 * 获取：票数
	 */
	public Integer getPiaoshu() {
		return piaoshu;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：开卖时间
	 */
	public void setKaimaishijian(Date kaimaishijian) {
		this.kaimaishijian = kaimaishijian;
	}
	/**
	 * 获取：开卖时间
	 */
	public Date getKaimaishijian() {
		return kaimaishijian;
	}
	/**
	 * 设置：结束时间
	 */
	public void setJieshushijian(Date jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	/**
	 * 获取：结束时间
	 */
	public Date getJieshushijian() {
		return jieshushijian;
	}
	/**
	 * 设置：购票地点
	 */
	public void setGoupiaodidian(String goupiaodidian) {
		this.goupiaodidian = goupiaodidian;
	}
	/**
	 * 获取：购票地点
	 */
	public String getGoupiaodidian() {
		return goupiaodidian;
	}
	/**
	 * 设置：票务详情
	 */
	public void setPiaowuxiangqing(String piaowuxiangqing) {
		this.piaowuxiangqing = piaowuxiangqing;
	}
	/**
	 * 获取：票务详情
	 */
	public String getPiaowuxiangqing() {
		return piaowuxiangqing;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
