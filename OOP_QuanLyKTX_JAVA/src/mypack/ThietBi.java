package mypack;

public class ThietBi {

	public String maThietBi;
	public String tenThietBi;

	
	public ThietBi() {}
	public ThietBi(String maThietBi, String tenThietBi)
	{
		this.maThietBi = maThietBi;
		this.tenThietBi = tenThietBi;
	}
	public ThietBi(ThietBi tb)
	{
		maThietBi = tb.maThietBi;
		tenThietBi = tb.tenThietBi;
	}
	//getter - setter
	public String getMaThietBi() {
		return maThietBi;
	}
	public void setMaThietBi(String maThietBi) {
		this.maThietBi = maThietBi;
	}
	public String getTenThietBi() {
		return tenThietBi;
	}
	public void setTenThietBi(String tenThietBi) {
		this.tenThietBi = tenThietBi;
	}
}