import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OgrenciKisiselBilgileri {
	
	@Id
	private int og_tc;
	private String ad;
	private String soyad;
	private String email;
	private Date dogum_tar;
	private String dogum_yer;
	private String nufus_kayit_yeri;
	private String medeni_hal;
	private String cinsiyet;
	private String sehir;
	private String ilce;
	private String adres;
	private String tel_no;
	private String ehliyet_bilgileri;
	
	public int getOg_tc() {
		return og_tc;
	}
	public void setOg_tc(int og_tc) {
		this.og_tc = og_tc;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDogum_tar() {
		return dogum_tar;
	}
	public void setDogum_tar(Date dogum_tar) {
		this.dogum_tar = dogum_tar;
	}
	public String getDogum_yer() {
		return dogum_yer;
	}
	public void setDogum_yer(String dogum_yer) {
		this.dogum_yer = dogum_yer;
	}
	public String getNufus_kayit_yeri() {
		return nufus_kayit_yeri;
	}
	public void setNufus_kayit_yeri(String nufus_kayit_yeri) {
		this.nufus_kayit_yeri = nufus_kayit_yeri;
	}
	public String getMedeni_hal() {
		return medeni_hal;
	}
	public void setMedeni_hal(String medeni_hal) {
		this.medeni_hal = medeni_hal;
	}
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	public String getIlce() {
		return ilce;
	}
	public void setIlce(String ilce) {
		this.ilce = ilce;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getTel_no() {
		return tel_no;
	}
	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}	
	public String getEhliyet_bilgileri() {
		return ehliyet_bilgileri;
	}
	public void setEhliyet_bilgileri(String ehliyet_bilgileri) {
		this.ehliyet_bilgileri = ehliyet_bilgileri;
	}
	
	
	
	
	
	

}
