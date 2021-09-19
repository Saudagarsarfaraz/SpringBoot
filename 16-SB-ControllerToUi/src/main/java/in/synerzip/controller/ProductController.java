package in.synerzip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.synerzip.pojo.Product;



@Controller
public class ProductController {

	@GetMapping("/product")
	public ModelAndView getProductData() {
	     ModelAndView mav = new ModelAndView();
	     
	     Product pobj = new Product();
	     pobj.setProductId(101);
	     pobj.setProductName("KeyBoard");
	     pobj.setProductPrice(450.00);
	     
	     mav.addObject("product",pobj);
	     mav.setViewName("product-data");
	     return mav;
	}
}
