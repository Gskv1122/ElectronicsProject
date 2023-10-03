package com.example.Electronics;

import java.util.List;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class AcService {
	@Autowired
	AcDao ad;
	public String postAll(List<Ac> a) {
		return ad.postAll(a);
	}
	 
		public List<Ac> getAll() {
		return ad.getAll();
			
		}
		public Ac getById(int id) {
			return ad.getById(id);
		}
		public String getupdate(Ac a) {
			return ad.getupdate(a);
		}
//		public String getupdates(Ac a) {
//			return ad.getupdates(a);
//		}
//		public List<Ac> getBybrand(String b) {
//			return ad.getBybrand(b);
//		}
//		public List<Ac> getPrice(int a) {
//			return ad.getPrice(a);
//		}
		public List<Ac> getPriceRange(int a) {
			return ad.getPriceRange(a);
		}
		public List<Ac> getPriceRanges(int a,int b) {
			return ad.getPriceRanges(a,b);
		}
		public Ac getMaxprice() {
			return ad.getMaxprice();
		}
		public Ac getMinprice() {
			return ad.getMinprice();
		}
		public Ac getByBrand(String brand) throws BrandNotFoundException{
			return ad.getByBrand(brand);
		}
		public String deleteById(int id) {
			return ad.deleteById(id);
		}
		public String post(Ac a) throws PriceException {
			Ac x=a;
			//try {
			if(x.getPrice()>=50000) {
				throw new PriceException("Above 50K");
			}
			else {
				return ad.post(a);
			}
			//}
//			catch(Exception e) {
//				return "Enter valid ";
//			}
			
		}
		public List<Ac> getBycolor(String a) throws ColorException {
			if(!(ad.getBycolor(a).equals("white"))) {
				throw new ColorException("This model not found");
			}
			else {
			return ad.getBycolor(a);
			}
			
		}
		public String posts(List<Ac> a) throws ModelYearException {
			for(int i=0;i<a.size();i++) {
			if(a.get(i).getModelYear()>2020) {
			  ad.post(a.get(i));
			}
			else {
				throw new ModelYearException("this is not englible");
						
				}
		}
			return "Successfully saved";
		}
		public List<Ac> getByBrands(String a,int b) throws BrandsNotFoundException {
			List<Ac> ab=ad.getByBrands(a, b);
			if(ab.size()==0) {
				throw new BrandsNotFoundException("Brand and price not match");
			}
			else {
				return ad.getByBrands(a, b);
			}
		}
	}


