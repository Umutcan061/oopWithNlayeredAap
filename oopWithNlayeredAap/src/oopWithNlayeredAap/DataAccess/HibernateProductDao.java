package oopWithNlayeredAap.DataAccess;

import oopWithNlayeredAap.Entities.Produtc;

public class HibernateProductDao implements BaseProductDao {

	@Override
	public void add(Produtc produtc) {
		System.out.println("Hibernate ile eklendi");
		
	}

}
