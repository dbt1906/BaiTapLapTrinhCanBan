package ReviewLTCB;

public class Milk {
	private String name;
	private double weight;
	private int price;
	private Specification spec;
	private Manufactor manufactor;
	private Date productionDate;
	private Date expiredDate;
	/**
	 * @param name ten
	 * @param weight can nang
	 * @param price gia
	 * @param spec quy cach dong hop
	 * @param manufactor nha san xuat
	 * @param productionDate ngay san xuat
	 * @param expiredDate han su dung
	 */
	public Milk(String name, double weight, int price, Specification spec, Manufactor manufactor, Date productionDate,
			Date expiredDate) {
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.spec = spec;
		this.manufactor = manufactor;
		this.productionDate = productionDate;
		this.expiredDate = expiredDate;
	}
	/** Kiem tra cong ty nay co ten trung voi ten cong ty kia khong
	  tra ve true neu co va false neu khong **/
	public boolean sameCompany(Milk that) {
		return this.getName().equals(that.getName());
	}
	/**  tinh the tich cua hop sua**/
	public double volumn() {
		return this.spec.volumn();
	}
	/**
	 * kiem tra lieu hop sua co the tich lon hon hop sua khac khong
	 * @param that hop sua khac
	 * @return tra ve true neu hop sua co the tich lon hon hop sua khac
	 */
	public boolean greaterThan(Milk that) {
		return this.volumn()>that.volumn();
	}
	/**
	 * Kiem tra lieu ngay san xuat cua hop sua co xay ra sau 1 ngay nao do khong
	 * @param that 1 ngay nao do
	 * @return tra ve true neu co
	 */
	public boolean produceAfter(Date that) {
		return this.getProductionDate().after(that);
	}
	/**
	 * Kiem tra lieu san pham het han chua tinh den ngay 15/12/2021
	 * @return tra ve true neu san pham da het han va false neu san pham con han
	 */
	public boolean isExpired() {
		return new Date(15,12,2021).after(this.getExpiredDate());
	}
	/**
	 * 
	 * @return
	 */
	public double discount() {
		String discount;
		int year = this.getProductionDate().getYear();
		int month = this.getProductionDate().getMonth();
		int day = this.getProductionDate().getDay();
		if(!this.getProductionDate().after(new Date(1,1,2019))) {
			return this.price*0.3;}
			else if (!this.getProductionDate().after(new Date(1,6,2020))){
			return this.price*0.1;
			}
			else
				return 0;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the spec
	 */
	public Specification getSpec() {
		return spec;
	}
	/**
	 * @param spec the spec to set
	 */
	public void setSpec(Specification spec) {
		this.spec = spec;
	}
	/**
	 * @return the manufactor
	 */
	public Manufactor getManufactor() {
		return manufactor;
	}
	/**
	 * @param manufactor the manufactor to set
	 */
	public void setManufactor(Manufactor manufactor) {
		this.manufactor = manufactor;
	}
	/**
	 * @return the productionDate
	 */
	public Date getProductionDate() {
		return productionDate;
	}
	/**
	 * @param productionDate the productionDate to set
	 */
	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}
	/**
	 * @return the expiredDate
	 */
	public Date getExpiredDate() {
		return expiredDate;
	}
	/**
	 * @param expiredDate the expiredDate to set
	 */
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}
	
}
