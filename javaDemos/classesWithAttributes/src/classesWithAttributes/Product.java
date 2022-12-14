package classesWithAttributes;

public class Product {

	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı Blok Çalıştı.");
		this._id = id;
		this._renk = renk;
		this._name = name;
		this._price = price;
		this._description = description;
		this._stockAmount = stockAmount;
	}

	public Product() {

	}

	// Attribute & Field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _kod;
	private String _renk;

	// getter
	public int getId() {
		return _id;
	}

	// setter
	public void setId(int id) {
		// this._id = id; // --this-- o an içerisinde bulunan classtır
		_id = id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String name) {
		this._name = name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String description) {
		this._description = description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double price) {
		this._price = price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}

	public String get_kod() {
		return this._name.substring(0, 1) + _id;
	}

	public String get_Renk() {
		return _renk;
	}

	public void set_stockAmount(String renk) {
		this._renk = renk;
	}

}
