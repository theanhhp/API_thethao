package thethao.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import thethao.model.Account;


@RestController
public class ControllerAccount {


	@PostMapping(value = "/new")	
	public Account createNew(@RequestBody Account account) {
		return account ;
		
	}
	
	@PutMapping(value = "/new")
	public Account updateNew (@RequestBody Account account) {
		return account ;
		
	}
	
	@DeleteMapping(value = "/new")
	public void delete (@RequestBody Long[] id) {
	
		
	}
	
}
