package com.example.Electronics;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class AcDao {
	@Autowired
	AcRepo ar;
	public String postAll(List<Ac> a) {
	  ar.saveAll(a);
	  return "Data saved";
	}
	public List<Ac> getAll() {
		return ar.findAll();
	}
	public Ac getById(int id) {
		return ar.findById(id).get();
	}
	public String getupdate(Ac a) {
		 ar.save(a);
		 return "updated";
		
	}
	public String getupdates(Ac a) {
		 ar.save(a);
		 return "updated";
		
	}
//	public List<Ac> getBybrand(String brand) {
//		return ar.getBybrand(brand);
//	}
//	public List<Ac> getPrice(int price) {
//		return ar.getPrice(price);
//	}
	public List<Ac> getPriceRange(int price) {
		return ar.getPriceRange(price);
	}
	public List<Ac> getPriceRanges(int n1,int n2) {
		return ar.getPriceRanges(n1,n2);
	}
	public Ac getMaxprice() {
		return ar.getMaxprice();
	}
	public Ac getMinprice() {
		return ar.getMinprice();
	}
	public Ac getByBrand(String brand) throws BrandNotFoundException {
		if(ar.getByBrand(brand).isEmpty()) {
			throw new BrandNotFoundException("This model not found");
		}
		else {
		return ar.getByBrand(brand).get();
		}
	}
	public String deleteById(int id) {
		ar.deleteById(id);
		return "data deleted";
	}
	public String post(Ac a) {
		ar.save(a);
		return "saved";
	}
	public List<Ac> getBycolor(String a) throws ColorException {
		return ar.getBycolor(a);
	}
//	public String posts(List<Ac> a) {
//	 ar.saveAll(a);
//	 return "saved";
//	}
	public List<Ac> getByBrands(String a,int b) throws BrandsNotFoundException {
		return ar.getByBrands(a,b);
	}

	

}
