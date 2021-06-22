import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class OgrenciSoru implements Serializable{
	@Id
	private
	Integer soruId;
	private String email;
	private String firmaEmail;
	private String ogrenciCevap;
	private String firmaAdi;
	public Integer getSoruId() {
		return soruId;
	}
	public void setSoruId(Integer soruId) {
		this.soruId = soruId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirmaAdi() {
		return firmaAdi;
	}
	public void setFirmaAdi(String firmaAdi) {
		this.firmaAdi = firmaAdi;
	}
	public String getOgrenciCevap() {
		return ogrenciCevap;
	}
	public void setOgrenciCevap(String ogrenciCevap) {
		this.ogrenciCevap = ogrenciCevap;
	}
	public String getFirmaEmail() {
		return firmaEmail;
	}
	public void setFirmaEmail(String firmaEmail) {
		this.firmaEmail = firmaEmail;
	}

}
