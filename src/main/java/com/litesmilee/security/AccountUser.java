package com.litesmilee.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.Assert;

import java.util.Collection;

/**
 * 账户的用户
 *
 * @author liyongdong
 * @date 2021/08/22
 */
public class AccountUser implements UserDetails {

	/**
	 * 用户id
	 */
	private Long userId;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 用户名
	 */
	private final String username;

	/**
	 * 当局
	 */
	private final Collection<? extends GrantedAuthority> authorities;

	/**
	 * 账户不过期
	 */
	private final boolean accountNonExpired;

	/**
	 * 非锁定账户
	 */
	private final boolean accountNonLocked;

	/**
	 * 凭证不过期
	 */
	private final boolean credentialsNonExpired;

	/**
	 * 启用
	 */
	private final boolean enabled;

	public AccountUser(Long userId, String username, String password, Collection<? extends GrantedAuthority> authorities) {
		this(userId, username, password, true, true, true, true, authorities);
	}


	public AccountUser(Long userId, String username, String password, boolean enabled, boolean accountNonExpired,
	            boolean credentialsNonExpired, boolean accountNonLocked,
	            Collection<? extends GrantedAuthority> authorities) {
		Assert.isTrue(username != null && !"".equals(username) && password != null,
				"Cannot pass null or empty values to constructor");
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.accountNonExpired = accountNonExpired;
		this.credentialsNonExpired = credentialsNonExpired;
		this.accountNonLocked = accountNonLocked;
		this.authorities = authorities;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return this.accountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return this.accountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		return this.enabled;
	}
}
