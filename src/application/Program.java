package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
        
		
		List<Seller> list = sellerDao.findAll();
		for(Seller obj : list) {
		 System.out.println(obj);
		}
		System.out.println("==== TEST 2:  seller insert ========");
		Department department = new Department(3, "Fashion");
		Seller newSeller = new Seller(null, "james", "james@gmail.com", new Date(), 3250.0, department );
		sellerDao.insert(newSeller);
		System.out.println("New id = " + newSeller.getId());
		System.out.println("New name  = " + newSeller.getDepartment());
		
		System.out.println("==== TEST 3:  seller update ========");
		Seller updateSeller = new Seller(9, "James", "james@gmail.com", new Date(), 4000.0, department);
		 sellerDao.update(updateSeller);
		
		System.out.println("==== TEST 4:  seller delete ========");
		sellerDao.deleteById(9);
	}

}
