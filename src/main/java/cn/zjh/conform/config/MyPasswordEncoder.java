package cn.zjh.conform.config;

import org.springframework.security.crypto.password.PasswordEncoder;

public class MyPasswordEncoder implements PasswordEncoder {
	@Override
	public String encode(CharSequence charSequence) {
		return null;
	}

	@Override
	public boolean matches(CharSequence charSequence, String s) {
		return false;
	}
}
