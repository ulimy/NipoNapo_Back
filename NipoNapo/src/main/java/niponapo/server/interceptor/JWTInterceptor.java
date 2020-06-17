package niponapo.server.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import niponapo.server.exception.UnauthorizedException;
import niponapo.server.service.JWTService;

@Component
public class JWTInterceptor extends HandlerInterceptorAdapter {

	private static final String HEADER_AUTH = "Authorization";

	@Autowired
	private JWTService jwtService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		final String token = request.getHeader(HEADER_AUTH);

		try {
			if (token != null && jwtService.isUsable(token)) {
				return true;
			} else {
				throw new UnauthorizedException();
			}
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}
	
}
