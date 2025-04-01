package in.ashokit.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {
	@GetMapping("/test")
	public String getWishMsg(Model model) {
		int i =10/0;
		model.addAttribute("msg", "Good Evening...");
		return "index";
	}

}
