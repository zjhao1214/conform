package cn.zjh.conform.service.sercurity;


import org.springframework.security.core.AuthenticationException;

public class ImageCodeException extends AuthenticationException {
	public ImageCodeException(String msg, Throwable t) {
		super(msg, t);
	}

	public ImageCodeException(String msg) {
		super(msg);
	}
}
