package com.litesmilee.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 系统角色菜单
 *
 * @author zhogjiane
 * @date 2021/08/22
 * @since 2021-04-05
 */
@Data
public class SysRoleMenu {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  /**
   * 角色id
   */
  private Long roleId;

  /**
   * 菜单id
   */
  private Long menuId;


}
