package com.collect.alipay.domain;

import java.io.Serializable;

/**
 * 用户模型
 * 
 * @author zhangkai
 * 
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private String id;

	/**
	 * 分销商Id
	 */
	private String distributorId;
	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 负责人姓名
	 */
	private String manager;

	/**
	 * 联系电话
	 */
	private String tel;

	/**
	 * 地址
	 */
	private String addr;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
