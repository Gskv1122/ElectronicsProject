package com.example.Electronics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AcController {
	@Autowired
	AcService as;
	@PostMapping(value="/postAll")
	public String postAll(@RequestBody List<Ac> a) {
		return as.postAll(a);
	}
	@GetMapping(value="/getAll") 
	public List<Ac> getAll() {
		return as.getAll();
	}
	@GetMapping(value="/getById/{id}")
	public Ac getById(@PathVariable int id) {
		return as.getById(id);
	}
	@PutMapping(value="/update")
	public String getupdate(@RequestBody Ac a) {
		return as.getupdate(a);
	}
//	@PatchMapping(value="/update")
//	public String getupdates(@RequestBody Ac a) {
//		return as.getupdates(a);
//	}
//	@GetMapping(value="/getBybrand/{b}")
//	public List<Ac> getBybrand(@PathVariable String b) {
//		return as.getBybrand(b);
//	}
//	@GetMapping(value="/getPrice/{num}")
//	public List<Ac> getPrice(@PathVariable int num) {
//		return as.getPrice(num);
//	}
	@GetMapping(value="/getPriceRange/{num}")
	public List<Ac> getPriceRange(@PathVariable int num) {
		return as.getPriceRange(num);
	}
	@GetMapping(value="/getPriceRanges/{num1}/{num2}")
	public List<Ac> getPriceRanges(@PathVariable int num1,@PathVariable int num2) {
		return as.getPriceRanges(num1,num2);
	}
	@GetMapping(value="/getMinprice") 
	public Ac getMinprice() {
		return as.getMinprice();
	}
	@GetMapping(value="/getByBrand/{brand}")
	public Ac getByBrand(String brand) throws BrandNotFoundException {
		return as.getByBrand(brand);
	}
	@DeleteMapping(value="/delete/{id}")
	public String deleteById(@PathVariable int id) {
		return as.deleteById(id);
	}
	@PostMapping(value="/postThis")
	public String post(@RequestBody Ac a) throws PriceException {
		return as.post(a);
	}
	@GetMapping(value="/getBycolor/{color}")
	public List<Ac> getBycolor(@PathVariable String color) throws ColorException {
		return as.getBycolor(color);
	}
	@PostMapping(value="/post")
	public String posts(@RequestBody List<Ac> a) throws ModelYearException {
		return as.posts(a);
	}
	@GetMapping(value="/getByBrands/{a}/{b}")
	public List<Ac> getByBrands(@PathVariable String a,@PathVariable int b) throws BrandsNotFoundException {
		return as.getByBrands(a,b);
	}


}
