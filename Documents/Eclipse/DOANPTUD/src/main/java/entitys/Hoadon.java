package entitys;
// default package
// Generated Aug 9, 2019 8:28:56 PM by Hibernate Tools 3.5.0.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Hoadon generated by hbm2java
 */
@Entity
@Table(name = "HOADON", schema = "dbo", catalog = "DOANPTUD")
public class Hoadon implements java.io.Serializable {

	private String id;
	private Khachhang khachhang;
	private Nhanvien nhanvien;
	private Donhang donhang;
	private BigDecimal thanhtien;
	private Set<CtHoadon> ctHoadons = new HashSet<CtHoadon>(0);

	public Hoadon() {
	}

	public Hoadon(String id) {
		this.id = id;
	}

	public Hoadon(String id, Khachhang khachhang, Nhanvien nhanvien, Donhang donhang, BigDecimal thanhtien,
			Set<CtHoadon> ctHoadons) {
		this.id = id;
		this.khachhang = khachhang;
		this.nhanvien = nhanvien;
		this.donhang = donhang;
		this.thanhtien = thanhtien;
		this.ctHoadons = ctHoadons;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDKHACHHANG")
	public Khachhang getKhachhang() {
		return this.khachhang;
	}

	public void setKhachhang(Khachhang khachhang) {
		this.khachhang = khachhang;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDNHANVIEN")
	public Nhanvien getNhanvien() {
		return this.nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDDONHANG")
	public Donhang getDonhang() {
		return this.donhang;
	}

	public void setDonhang(Donhang donhang) {
		this.donhang = donhang;
	}

	@Column(name = "THANHTIEN", scale = 4)
	public BigDecimal getThanhtien() {
		return this.thanhtien;
	}

	public void setThanhtien(BigDecimal thanhtien) {
		this.thanhtien = thanhtien;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hoadon")
	public Set<CtHoadon> getCtHoadons() {
		return this.ctHoadons;
	}

	public void setCtHoadons(Set<CtHoadon> ctHoadons) {
		this.ctHoadons = ctHoadons;
	}

}