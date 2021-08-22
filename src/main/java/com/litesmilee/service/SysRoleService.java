package com.litesmilee.service;

import com.litesmilee.entity.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 系统角色服务
 *
 * @author zhogjiane
 * @date 2021/08/22
 * @since 2021-04-05
 */
public interface SysRoleService extends IService<SysRole> {

	/**
	 * 通过id获取角色
	 *
	 * @param userId 用户id
	 * @return {@link List}<{@link SysRole}>
	 */
	List<SysRole> listRolesByUserId(Long userId);

}
