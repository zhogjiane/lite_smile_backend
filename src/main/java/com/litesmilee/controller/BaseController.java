package com.litesmilee.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.litesmilee.service.*;
import com.litesmilee.utils.RedisUtil;
import javax.annotation.Resource;
import org.springframework.web.bind.ServletRequestUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * 基本控制器
 *
 * @author liyongdong
 * @date 2021/09/06
 */
public class BaseController {

  @Resource
  HttpServletRequest req;

  @Resource
  RedisUtil redisUtil;

  @Resource
  SysUserService sysUserService;

  @Resource
  SysRoleService sysRoleService;

  @Resource
  SysMenuService sysMenuService;

  @Resource
  SysUserRoleService sysUserRoleService;

  @Resource
  SysRoleMenuService sysRoleMenuService;

  /**
   * 获取页面
   *
   * @return {@link Page}
   */
  public Page getPage() {
    int current = ServletRequestUtils.getIntParameter(req, "cuurent", 1);
    int size = ServletRequestUtils.getIntParameter(req, "size", 10);

    return new Page(current, size);
  }

}
