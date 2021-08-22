package com.litesmilee.controller;

import com.litesmilee.common.lang.Result;
import com.litesmilee.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author liyongdong
 * @date 2021/08/22
 */
@RestController
public class TestController {

	@Autowired
	SysUserService sysUserService;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@PreAuthorize("hasRole('admin')")
	@GetMapping("/test")
	public Result test() {
		return Result.succ(sysUserService.list());
	}

	// 普通用户、超级管理员
	@PreAuthorize("hasAuthority('sys:user:list')")
	@GetMapping("/test/pass")
	public Result pass() {

		// 加密后密码
		String password = bCryptPasswordEncoder.encode("111111");

		boolean matches = bCryptPasswordEncoder.matches("111111", password);

		System.out.println("匹配结果：" + matches);

		return Result.succ(password);
	}

}
