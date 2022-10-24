package oopWithNlayeredAap;

import oopWithNlayeredAap.Business.ProductManager;
import oopWithNlayeredAap.DataAccess.JdbcProductDao;
import oopWithNlayeredAap.Entities.Produtc;
import oopWithNlayeredAap.core.logging.DatabaseLogger;
import oopWithNlayeredAap.core.logging.FileLogger;
import oopWithNlayeredAap.core.logging.Logger;

public class Main {

	public static void main(String[] args) throws Exception {

		Produtc produtc1= new Produtc(1,"Laptop",100);
		Logger[] loggers= {new DatabaseLogger(),new FileLogger()};
		
	ProductManager productManager= new ProductManager(new JdbcProductDao(),loggers);
	productManager.add(produtc1);
		
	}

}
