package com.allenn.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.allenn.entity.SysRoleMenu;

import java.util.List;

/**
 *
 * SysRoleMenu 表数据库控制层接口
 *
 */
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {

	/**
	 * 根据用户Id获取用户所在角色的权限
	 */
	public List<SysRoleMenu> selectRoleMenuByUserId(String uid);
	
}