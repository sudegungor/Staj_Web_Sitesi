import java.io.Serializable;
import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name =" ogrenciKisiselBilgileri1")
public class OgrenciKisiselBilgileri implements Serializable {
	
	@Id
	private

	String email;
	//Integer kisiselId;
	
	
	private String og_tc;
	private String ad;
	private String soyad;
	 
	private java.util.Date  dogum_tar;
	private String dogum_yer;
	private String nufus_kayit_yeri;
	private String medeni_hal;
	private String cinsiyet;
	private String sehir;
	private String ilce;
	private String adres;
	private String tel_no;
	private String ehliyet_bilgileri;
	private String gelenemail=" ";
	/*
	@OneToOne(mappedBy="ogrenciKisiselBilgi")
	private
	
	OgrenciGiris ogrencigiris;*/
	//OgrenciGiris cagir= new OgrenciGiris();
/*
	public OgrenciKisiselBilgileri() {
	OgrenciGiris cagir=new OgrenciGiris();
	gelenemail=cagir.getEmail();
	}
	
	
	*/
	
	 public void yazdir()
	 
     {

                    System.out.println("Gelen email :"+gelenemail);

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
	public java.util.Date getDogum_tar() {
		return dogum_tar;
	}
	public void setDogum_tar(java.util.Date dogum_tar) {
		this.dogum_tar = dogum_tar;
	}
	public String getOg_tc() {
		return og_tc;
	}
	public void setOg_tc(String og_tc) {
		this.og_tc = og_tc;
	}
/*
	public OgrenciGiris getOgrencigiris() {
		return ogrencigiris;
	}
	public void setOgrencigiris(OgrenciGiris ogrencigiris) {
		this.ogrencigiris = ogrencigiris;
	}
	*/
	
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

	/*public OgrenciOkulBilgileri getOkulbilgisi() {
		return okulbilgisi;
	}
	public void setOkulbilgisi(OgrenciOkulBilgileri okulbilgisi) {
		this.okulbilgisi = okulbilgisi;
	}*/
	public String getGelenemail() {
		return gelenemail;
	}
	public void setGelenemail(String gelenemail) {
		this.gelenemail = gelenemail;
	}

	

/*
	public OgrenciGiris getOgrencigiris() {
		return ogrencigiris;
	}

	public void setOgrencigiris(OgrenciGiris ogrencigiris) {
		this.ogrencigiris = ogrencigiris;
	}
*/
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}







	
	
	
	
	

}
