package co.grandcircus.HotelSearch;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HotelSearchController {

	@Autowired
	private HotelRepository repo;
	
	@RequestMapping("/")
	public String index() {
		return "homepage";
	}
	
	@RequestMapping("result")
	public String showResult() {
		return "result";
	}
 	
	@PostMapping("result")
	public String displayResult(Model model, @RequestParam String city, Sort sort) {
		model.addAttribute("city", city);
		List<Hotel> hotels = repo.findByCity(city, Sort.by("pricePerNight"));
		model.addAttribute("hotels", hotels);
	
		
		return "result";
	}
}
