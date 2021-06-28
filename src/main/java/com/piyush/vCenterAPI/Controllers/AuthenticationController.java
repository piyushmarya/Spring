package com.piyush.vCenterAPI.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.piyush.vCenterAPI.Models.AuthenticationRequest;
import com.piyush.vCenterAPI.Models.AuthenticationResponse;
import com.piyush.vCenterAPI.Services.UserService;
import com.piyush.vCenterAPI.Utils.JwtUtils;

@RestController
@RequestMapping("/authenticate")
public class AuthenticationController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private JwtUtils jwtObj;

	@PostMapping
	public ResponseEntity<?> createJwt(@RequestBody AuthenticationRequest req) throws Exception {
		try {
		 authenticationManager.authenticate(
				 new UsernamePasswordAuthenticationToken(req.getUsername(), req.getPassword()));
		}
		catch(BadCredentialsException e) {
			throw new Exception("Invalid username/password", e);
		}
		
		final UserDetails userDetails = userService.loadUserByUsername(req.getUsername());
		final String jwt = jwtObj.generateToken(userDetails);
		
		return ResponseEntity.ok(new AuthenticationResponse(jwt)) ;
	}
}
