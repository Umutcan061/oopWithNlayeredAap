package oopWithNlayeredAap.DataAccess;

import oopWithNlayeredAap.Entities.Produtc;

public class JdbcProductDao implements BaseProductDao {

	@Override
	public void add(Produtc produtc) {

		
		System.out.println("Jdbc ile eklendi");
	}

}
