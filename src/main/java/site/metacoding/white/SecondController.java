package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

	@GetMapping("/second/{id}")
	public String getData(@PathVariable Integer id) {		//pk가 1인 것을 찾을거임
		return "id : "+id;
	}
	
	@GetMapping("/second")
	public String getData2(String title, String content) { //title 과 content 데이터를 받음
		return "Title : "+title+" Content : "+content;
	}
	
	@PostMapping("/second")
	public String postData(String title, String content) {
		return "Title : "+title+" Content : "+content;
	}
	
	@PutMapping("/second")
	public String putData(String title, String content) {
		return "Title : "+title+" Content : "+content;
	}
	
	@DeleteMapping("/second/{id}")
	public String deleteData(@PathVariable Integer id) {
		return id+" delete ok";
	}
}
