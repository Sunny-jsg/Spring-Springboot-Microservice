package in.ashokit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepository;

@Controller
public class ProductController {
	@Autowired
	private ProductRepository repo;
	 /**
     * This method loads the form with an empty Product object and returns the index page.
     */

	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("product", new Product());
		return "index";
	}
	 /**
     * This method saves the product details received from the form.
     * If validation errors exist, it reloads the form.
     * If the product is saved successfully, it shows a success message.
     */

	@PostMapping("/product")
	public String SaveProduct(@Validated @ModelAttribute("product") Product p, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "index";
		}
		p = repo.save(p);
		if (p.getPid() != null) {
			model.addAttribute("msg", "Product Saved");
		}
		return "index";
	}
	/**
     * This method retrieves all products from the database and passes them to the "data" page.
     */

	@GetMapping("/products")
	public String getAllProducts(Model model) {
		List<Product> list = repo.findAll();
		model.addAttribute("products", list);
		return "data";
	}
	/**
     * This method deletes a product by its ID and refreshes the list of products.
     */

	@GetMapping("/delete")
	public String delete(@RequestParam("pid") Integer pid, Model model) {
		repo.deleteById(pid);
		model.addAttribute("msg", "Product Deleted");
		model.addAttribute("products", repo.findAll());
		return "data";
	}
	/*
    * This method fetches a product by its ID for editing and returns the index page with product details.
    */
    @GetMapping("/edit")
	public String edit(@RequestParam("pid") Integer pid, Model model) {
		Optional<Product> byId = repo.findById(pid);
		if (byId.isPresent()) {
			Product product = byId.get();
			model.addAttribute("product", product);
		}
		return "index";
	}
}
