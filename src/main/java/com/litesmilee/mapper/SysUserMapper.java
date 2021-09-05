package com.litesmilee.mapper;

import com.litesmilee.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 系统用户映射器
 *
 * @author liyongdong
 * @date 2021/08/22
 */
@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {

  /**
   * ids得到导航菜单
   *
   * @param userId 用户id
   * @return {@link List}<{@link Long}>
   */
  List<Long> getNavMenuIds(Long userId);

  /**
   * 通过菜单id列表
   *
   * @param menuId 菜单id
   * @return {@link List}<{@link SysUser}>
   */
  List<SysUser> listByMenuId(Long menuId);
}
