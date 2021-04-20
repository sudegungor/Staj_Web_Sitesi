import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.Email;

@Entity
public class FirmaBilgileri {
	
	
	@Id
	@GeneratedValue
	private int id;
	private String firma_adi;
	private String sektor;
	private String firma_tipi;
	private Date kurulus_tarihi;
	private String konum;
	private String personel_sayisi;
	private String hakkinda;
	private String url;
	private String adres;
	private String telefon;
	private String faks;
	@Email
	private String mail;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirma_adi() {
		return firma_adi;
	}
	public void setFirma_adi(String firma_adi) {
		this.firma_adi = firma_adi;
	}
	public String getSektor() {
		return sektor;
	}
	public void setSektor(String sektor) {
		this.sektor = sektor;
	}
	public String getFirma_tipi() {
		return firma_tipi;
	}
	public void setFirma_tipi(String firma_tipi) {
		this.firma_tipi = firma_tipi;
	}
	public Date getKurulus_tarihi() {
		return kurulus_tarihi;
	}
	public void setKurulus_tarihi(Date kurulus_tarihi) {
		this.kurulus_tarihi = kurulus_tarihi;
	}
	public String getKonum() {
		return konum;
	}
	public void setKonum(String konum) {
		this.konum = konum;
	}
	public String getPersonel_sayisi() {
		return personel_sayisi;
	}
	public void setPersonel_sayisi(String personel_sayisi) {
		this.personel_sayisi = personel_sayisi;
	}
	public String getHakkinda() {
		return hakkinda;
	}
	public void setHakkinda(String hakkinda) {
		this.hakkinda = hakkinda;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getFaks() {
		return faks;
	}
	public void setFaks(String faks) {
		this.faks = faks;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	

}
