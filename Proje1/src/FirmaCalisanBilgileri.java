import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.Email;


@Entity
public class FirmaCalisanBilgileri {
	
	@Id
	private int tc;
	private String ad;
	private String soyad;
	@Email
	private String mail;
	private String telefon;
	private Date dogum_tarihi;
	private String okul;
	private String bolum;
	private String sirket_adi;
	private int sirket_id;
	private int sene;
	private String unvan;
	
	
	
	public int getTc() {
		return tc;
	}
	public void setTc(int tc) {
		this.tc = tc;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
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
	public Date getDogum_tarihi() {
		return dogum_tarihi;
	}
	public void setDogum_tarihi(Date dogum_tarihi) {
		this.dogum_tarihi = dogum_tarihi;
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
	
	

}
