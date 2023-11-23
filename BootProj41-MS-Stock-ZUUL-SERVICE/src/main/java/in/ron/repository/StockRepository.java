package in.ron.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ron.entity.StockPrice;

public interface StockRepository extends JpaRepository<StockPrice, Integer> {
	public StockPrice findByCompanyName(String companyName);
}
