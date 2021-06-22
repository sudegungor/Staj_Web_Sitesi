import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.Email;


@Entity
@Table(name = "firmaCalisanBilgileri1")
public class FirmaCalisanBilgileri {
	@GeneratedValue
	@Id
	private
	Integer id;
	private String tc;
	private String ad;
	private String soyad;
	@Email
	private String mail;
	private String telefon;
	private java.util.Date dogum_tarihi;
	private String okul;
	private String bolum;
	private String sirket_adi;
	private int sirket_id;
	private int sene;
	private String unvan;
	private String firmaEmail;
	private String yorum;
	
	
	

	
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	public String getOkul() {
		return okul;
	}
	public void setOkul(String okul) {
		this.okul = okul;
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
	public String getSirket_adi() {
		return sirket_adi;
	}
	public void setSirket_adi(String sirket_adi) {
		this.sirket_adi = sirket_adi;
	}
	public int getSirket_id() {
		return sirket_id;
	}
	public void setSirket_id(int sirket_id) {
		this.sirket_id = sirket_id;
	}
	public int getSene() {
		return sene;
	}
	public void setSene(int sene) {
		this.sene = sene;
	}
	public String getUnvan() {
		return unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public java.util.Date getDogum_tarihi() {
		return dogum_tarihi;
	}
	public void setDogum_tarihi(java.util.Date dogum_tarihi) {
		this.dogum_tarihi = dogum_tarihi;
	}
	public String getFirmaEmail() {
		return firmaEmail;
	}
	public void setFirmaEmail(String firmaEmail) {
		this.firmaEmail = firmaEmail;
	}
	public String getYorum() {
		return yorum;
	}
	public void setYorum(String yorum) {
		this.yorum = yorum;
	}
	
	

}
