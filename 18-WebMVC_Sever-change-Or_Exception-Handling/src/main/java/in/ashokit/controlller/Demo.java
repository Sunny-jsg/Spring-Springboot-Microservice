package in.ashokit.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {
	@GetMapping("/wish")
	public String getWishMsg(Model model) {
		model.addAttribute("msg", "Good Evening...");
		return "index";
	}
	@GetMapping("/hii")
	public String getMsg(Model model) {
		String msg = "Hii, how are you";
		String s = null;
		s.length();
		model.addAttribute("msg", msg);
		return "index";
	}
	

}
