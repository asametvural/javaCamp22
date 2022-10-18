package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{ // DAO : Data Access Object
	public void add(Product product) {
		// sadece db' e erişim kodları buraya yazılır.
		System.out.println("JDBC ile veritabanına eklendi.");
	}
}
