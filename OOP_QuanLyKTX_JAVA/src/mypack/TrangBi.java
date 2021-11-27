package mypack;
import java.util.ArrayList;
import java.util.List;
public class TrangBi {
	public String maLoaiPhong;
	
	//related = singular
	public LoaiPhong loaiPhong;
	
	//related plural
	public List<ThietBi> dsthietbi_loaiphong;
	
	//constructor
	public TrangBi() {}
	public TrangBi(String maLoaiPhong, LoaiPhong loaiPhong, ArrayList<ThietBi>  dsthietbi_loaiphong)
	{
		this.maLoaiPhong = maLoaiPhong;
		this.loaiPhong = loaiPhong;
		this.dsthietbi_loaiphong = dsthietbi_loaiphong;
	}
	public TrangBi(TrangBi trb)
	{
		this.maLoaiPhong = trb.maLoaiPhong;
		this.loaiPhong = trb.loaiPhong;
		this.dsthietbi_loaiphong = trb.dsthietbi_loaiphong;
	}
	//getter - setter
	public String getMaLoaiPhong() {
		return maLoaiPhong;
	}
	public void setMaLoaiPhong(String maLoaiPhong) {
		this.maLoaiPhong = maLoaiPhong;
	}
	public LoaiPhong getLoaiPhong() {
		return loaiPhong;
	}
	public void setLoaiPhong(LoaiPhong loaiPhong) {
		this.loaiPhong = loaiPhong;
	}
	public List<ThietBi> getDsthietbi_loaiphong() {
		return dsthietbi_loaiphong;
	}
	public void setDsthietbi_loaiphong(List<ThietBi> dsthietbi_loaiphong) {
		this.dsthietbi_loaiphong = dsthietbi_loaiphong;
	}
}
