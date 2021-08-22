package com.litesmilee.service;

import com.litesmilee.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 系统用户服务
 *
 * @author zhogjiane
 * @date 2021/08/22
 * @since 2021-04-05
 */
public interface SysUserService extends IService<SysUser> {

	/**
	 * 得到用户名
	 *
	 * @param username 用户名
	 * @return {@link SysUser}
	 */
	SysUser getByUsername(String username);

	/**
	 * 获取用户权限信息
	 *
	 * @param userId 用户id
	 * @return {@link String}
	 */
	String getUserAuthorityInfo(Long userId);

	/**
	 * 明确用户权限信息
	 *
	 * @param username 用户名
	 */
	void clearUserAuthorityInfo(String username);

	/**
	 * 明确用户id权威信息的作用
	 *
	 * @param roleId 角色id
	 */
	void clearUserAuthorityInfoByRoleId(Long roleId);

	/**
	 * 明确用户权限信息菜单id
	 *
	 * @param menuId 菜单id
	 */
	void clearUserAuthorityInfoByMenuId(Long menuId);


}
