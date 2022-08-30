package site.metacoding.white;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Fourth;
import site.metacoding.white.domain.dto.RespDto;

@RestController
public class FourthController {
	
	@GetMapping("/four")
	public Fourth getData() {
		Fourth f = new Fourth();
		f.setTitle("제목");
		f.setContent("내용");
		return f; //DispatcherServlet 가 Fourth 오브젝트를 리턴받고
					//해당 오브젝트를 MessageConverter로 전달
	}
	
	@GetMapping("/four/data")
	public ResponseEntity<?> getData2() {
		Fourth f = new Fourth();
		f.setTitle("제목");
		f.setContent("내용");
		ResponseEntity<?> resp = new ResponseEntity<>(f, HttpStatus.OK);
		return resp;
	}
	
	@GetMapping("/four/dto")
	public RespDto<?> getData3() {
		Fourth f = new Fourth();
		f.setTitle("제목");
		f.setContent("내용");		
		return new RespDto<>(-1, "통신 성공", f);
	}

}
