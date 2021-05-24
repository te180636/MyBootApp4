package jp.te4a.spring.boot.myapp5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="/post", method=RequestMethod.POST)
	public ModelAndView postFormat(@RequestParam("text1") String text1) {
		//return "this is Spring Boot Sample";
		ModelAndView mv = new ModelAndView("index"); 
		mv.addObject("msg","you write " + text1 + " !!!");
		return mv;
	}

}
