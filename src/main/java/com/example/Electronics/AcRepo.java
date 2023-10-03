package com.example.Electronics;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AcRepo extends JpaRepository<Ac, Integer> {
	@Query(value = "select * from ac_table where brand like?", nativeQuery = true)
	public List<Ac> getBybrand(String brand);

	@Query(value = "select * from ac_table where price =?", nativeQuery = true)
	public List<Ac> getPrice(int price);

	@Query(value = "select * from ac_table where price >?", nativeQuery = true)
	public List<Ac> getPriceRange(int price);

	@Query(value = "select * from ac_table where price >? and price < ?", nativeQuery = true)
	public List<Ac> getPriceRanges(int num1, int num2);

	@Query(value = "select * from ac_table where price=(select max(price) from ac_table) limit 1", nativeQuery = true)
	public Ac getMaxprice();

	@Query(value = "select * from ac_table where price=(select min(price) from ac_table) limit 1", nativeQuery = true)
	public Ac getMinprice();// limit means suppose have same price more than 1;

	@Query(value = "select * from ac_table where brand = ? ", nativeQuery = true)
	public Optional<Ac> getByBrand(String brand);
	@Query(value = "select * from ac_table where color like ? ", nativeQuery = true)
	public List<Ac> getBycolor(String color);
	@Query(value = "select * from ac_table where brand like ? and price ?", nativeQuery = true)
	public List<Ac> getByBrands(String a,int b);

}
