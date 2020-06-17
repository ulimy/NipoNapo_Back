package niponapo.server.service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import niponapo.server.exception.UnauthorizedException;

@Service("JWTService")
public class JWTServiceImpl implements JWTService {

	private static final String SALT = "UserSecret";

	@Override
	public <T> String create(String key, T data) {
		String jwt = Jwts.builder().setHeaderParam("typ", "JWT").claim(key, data)
				.signWith(SignatureAlgorithm.HS256, this.generateKey()).compact();
		return jwt;
	}

	@Override
	public boolean isUsable(String jwt) {
		try {
			Jws<Claims> claims = Jwts.parser().setSigningKey(this.generateKey()).parseClaimsJws(jwt);
			return true;

		} catch (Exception e) {
			throw new UnauthorizedException();
		}
	}

	@Override
	public byte[] generateKey() {
		
		byte[] key = null;
		
		try {
			
			key = SALT.getBytes("UTF-8");
			
		} catch (UnsupportedEncodingException e) {
		}

		return key;
	}

	@Override
	public int getUser_pid(String jwt) {
		
		Jws<Claims> claims = Jwts.parser().setSigningKey(this.generateKey()).parseClaimsJws(jwt);
		int user_pid = (Integer) claims.getBody().get("user_pid");

		return user_pid;
	}

	@Override
	public void destroy(String jwt, HttpServletResponse response) {

		return;

	}

}
