package com.allenn.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.allenn.entity.SysMenu;

import java.util.List;

/**
 *
 * SysMenu 表数据库控制层接口
 *
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {

	List<String> selectMenuIdsByuserId(String uid);

}