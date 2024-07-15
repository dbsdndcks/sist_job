package day0306.work;

public class CarVO {
	private String country;
	private String maker;
	private String model;
	private String car_year;
	private String car_ooption;
	
	private int price;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCar_year() {
		return car_year;
	}

	public void setCar_year(String car_year) {
		this.car_year = car_year;
	}

	public String getCar_ooption() {
		return car_ooption;
	}

	public void setCar_ooption(String car_ooption) {
		this.car_ooption = car_ooption;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public CarVO() {
		// TODO Auto-generated constructor stub
	}

	public CarVO(String country, String maker, String model, String car_year, String car_ooption, int price) {
		super();
		this.country = country;
		this.maker = maker;
		this.model = model;
		this.car_year = car_year;
		this.car_ooption = car_ooption;
		this.price = price;
	}

	@Override
	public String toString() {
		return "CarVO [country=" + country + ", maker=" + maker + ", model=" + model + ", car_year=" + car_year
				+ ", car_ooption=" + car_ooption + ", price=" + price + "]";
	}
	
	

}
