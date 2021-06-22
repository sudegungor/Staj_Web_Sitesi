import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "OgrenciDil")
public class OgrenciYabanciDil {
	@Id
	private Integer id;
	private String email;
	private String dil_adi;
	private String okuma_sev;
	private String yazma_sev;
	private String konusma_sev;
	private String dinleme_sev;
	
	
	public String getDil_adi() {
		return dil_adi;
	}
	public void setDil_adi(String dil_adi) {
		this.dil_adi = dil_adi;
	}
	public String getOkuma_sev() {
		return okuma_sev;
	}
	public void setOkuma_sev(String okuma_sev) {
		this.okuma_sev = okuma_sev;
	}
	public String getYazma_sev() {
		return yazma_sev;
	}
	public void setYazma_sev(String yazma_sev) {
		this.yazma_sev = yazma_sev;
	}
	public String getKonusma_sev() {
		return konusma_sev;
	}
	public void setKonusma_sev(String konusma_sev) {
		this.konusma_sev = konusma_sev;
	}
	public String getDinleme_sev() {
		return dinleme_sev;
	}
	public void setDinleme_sev(String dinleme_sev) {
		this.dinleme_sev = dinleme_sev;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}



}
