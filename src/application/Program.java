package application;

import java.util.List;
import java.util.stream.Stream;

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
		
		
	}

}
