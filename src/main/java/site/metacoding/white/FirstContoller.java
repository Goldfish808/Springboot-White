package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstContoller {

	@GetMapping("/first")
	public String getData() {
		return "<h1>data : GET 을 테스트</h1>";
	}
	
	@PostMapping("/first")
	public String postData() {
		return "<h1>insert data : Post 를 테스트 </h1>";
	}
	
	@PutMapping("/first")
	public String putData() {
		return "<h1>update data : Put 을 테스트</h1>";
	}
	
	@DeleteMapping("/first")
	public String deleteData() {
		return "<h1>delete data : Delete 를 테스트</h1>";
	}
}
