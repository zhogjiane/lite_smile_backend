package com.litesmilee.service;

import com.litesmilee.common.dto.SysMenuDto;
import com.litesmilee.entity.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhogjiane
 * @since 2021-04-05
 */
public interface SysMenuService extends IService<SysMenu> {

  /**
   * 获得当前用户导航
   *
   * @return {@link List}<{@link SysMenuDto}>
   */
  List<SysMenuDto> getCurrentUserNav();

  /**
   * 树
   *
   * @return {@link List}<{@link SysMenu}>
   */
  List<SysMenu> tree();

}
