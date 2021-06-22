import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FirmaCalisanGiris {
	@GeneratedValue
	@Id
	private Integer firmaCalisanid;
	private String email;
	private String ad;
	private String soyad;
	private String sifre;
	private String firmaEmail;
	public Integer getFirmaCalisanid() {
		return firmaCalisanid;
	}
	public void setFirmaCalisanid(Integer firmaCalisanid) {
		this.firmaCalisanid = firmaCalisanid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	public String getFirmaEmail() {
		return firmaEmail;
	}
	public void setFirmaEmail(String firmaEmail) {
		this.firmaEmail = firmaEmail;
	}

}
