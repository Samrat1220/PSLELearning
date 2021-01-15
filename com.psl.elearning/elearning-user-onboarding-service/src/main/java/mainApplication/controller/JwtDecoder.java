package mainApplication.controller;

import java.io.UnsupportedEncodingException;

import org.apache.tomcat.util.codec.binary.Base64;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import mainApplication.model.UserClaimsModel;
import mainApplication.repository.UserClaimRepo;

@RestController
public class JwtDecoder {


	@Autowired
	private UserClaimRepo userRepo;
	
	@PostMapping(value="/user",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String decoder(@RequestHeader(value="Authorization") String token) throws UnsupportedEncodingException, ParseException {
		
		String payload =token.split("\\.")[1];
		JSONParser jsonParser=new JSONParser();
		
		String decode = new String(Base64.decodeBase64(payload),"UTF-8");
		JSONObject jsonObject = (JSONObject)jsonParser.parse(decode);
		
		UserClaimsModel userClaim=new UserClaimsModel();
		
		if(!userRepo.existsBysub((String)jsonObject.get("sub"))) 
		{
			userClaim.setSub((String) jsonObject.get("sub"));
			userClaim.setEmail((String) jsonObject.get("email"));
			userClaim.setAud((String) jsonObject.get("aud"));
			userClaim.setAuth_time((Long) jsonObject.get("auth_time"));
			userClaim.setExp((Long) jsonObject.get("exp"));
			
			userRepo.save(userClaim);
			
			System.out.println((String) jsonObject.get("event_id"));
			System.out.println((String) jsonObject.get("email"));
			System.out.println((String) jsonObject.get("aud"));
			System.out.println((Long) jsonObject.get("auth_time"));
			System.out.println((Long) jsonObject.get("exp"));
			
		}
		return  new String(Base64.decodeBase64(payload),"UTF-8");
		
	}

}
