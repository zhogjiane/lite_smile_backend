package com.litesmilee.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhogjiane
 * @since 2021-04-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    @NotBlank(message = "用户名不能为空")
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     *
     */
    private String avatar;

    /**
     * 电子邮件
     */
    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    private String email;

    /**
     * 城市
     */
    private String city;

    /**
     * 最后一次登录
     */
    private LocalDateTime lastLogin;

    /**
     * 系统角色
     */
    @TableField(exist = false)
    private List<SysRole> sysRoles = new ArrayList<>();

}
