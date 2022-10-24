package oopWithNlayeredAap.Business;

import oopWithNlayeredAap.DataAccess.BaseProductDao;
import oopWithNlayeredAap.Entities.Produtc;
import oopWithNlayeredAap.core.logging.Logger;

public class ProductManager {
	private BaseProductDao productDao;
	private Logger[] loggers;

	public ProductManager(BaseProductDao productDao,Logger[] loggers) {
		this.productDao = productDao;
		this.loggers=loggers;
	}

	public void add(Produtc produtc) throws Exception {

		if (produtc.getUnitPrice() < 10) {
			throw new Exception("Sayı 10dan küçük olamaz");

		}
		productDao.add(produtc);
		for (Logger logger : loggers) {
			logger.log(produtc.getName());
		}

	}

}
