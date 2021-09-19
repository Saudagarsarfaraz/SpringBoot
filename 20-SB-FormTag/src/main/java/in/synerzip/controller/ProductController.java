package in.synerzip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.synerzip.entity.Product;
import in.synerzip.repository.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository productRepo;
	
	
	@GetMapping("/loadForm")
	public String loadForm(Model model) {
		Product prod = new Product();
		model.addAttribute("product", prod);		
		return "index";
	}
	
	@PostMapping("/saveForm")
	public String saveForm(Product product,Model model) {
		productRepo.save(product);
		model.addAttribute("pId",product.getProductId() );
		model.addAttribute("pName",product.getProductName() );
		model.addAttribute("pPrice",product.getProductPrice() );
		return "dashBoard";
	} 
	

}
