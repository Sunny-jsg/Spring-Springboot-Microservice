package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.Product;
import in.ashokit.repository.ProductRepository;

@Controller
public class ProductController {
	@Autowired
	 private ProductRepository repo;
	@GetMapping("/products")
	public String LoadProduct(Model model) {
		model.addAttribute("products", repo.findAll());
		return "data";
	}
	@GetMapping("/")
	public String loadProduct(Model model) {
		model.addAttribute("p", new Product());
		return "index";
		
	}
	@PostMapping("/product")
	public String saveProduct(@ModelAttribute("p")Product p, Model model) {
		p =repo.save(p);
		if(p.getPid()!= null) {
			model.addAttribute("msg", "Product Saved ");
		}
		return "index";
	}
	

}
