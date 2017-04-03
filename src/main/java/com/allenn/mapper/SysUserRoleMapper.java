package com.allenn.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.allenn.entity.SysUserRole;

import java.util.List;

/**
 *
 * SysUserRole 表数据库控制层接口
 *
 */
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {

	List<String> selectPermissionByUid(String uid);

}