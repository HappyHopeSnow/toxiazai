package com.toxiazai.service;

import com.toxiazai.entity.SysUser;

import java.io.Serializable;

/**
 * @author Judas.n 2014年4月6日 22:49:26
 */
public interface UserServiceI {

	public Serializable saveUser(SysUser user);

	public SysUser getUser(String userId);
	
}
