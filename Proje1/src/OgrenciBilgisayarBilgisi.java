import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OgrenciBilgisayarBilgisi {
	@Id
	private
	Integer id;
	private String email;
	private String pc_bilgisi_adi;
	private String pc_bilgisi_seviyesi;
	private String pc_bilgisi_aciklamasi;
	

	public String getPc_bilgisi_adi() {
		return pc_bilgisi_adi;
	}
	public void setPc_bilgisi_adi(String pc_bilgisi_adi) {
		this.pc_bilgisi_adi = pc_bilgisi_adi;
	}
	public String getPc_bilgisi_seviyesi() {
		return pc_bilgisi_seviyesi;
	}
	public void setPc_bilgisi_seviyesi(String pc_bilgisi_seviyesi) {
		this.pc_bilgisi_seviyesi = pc_bilgisi_seviyesi;
	}
	public String getPc_bilgisi_aciklamasi() {
		return pc_bilgisi_aciklamasi;
	}
	public void setPc_bilgisi_aciklamasi(String pc_bilgisi_aciklamasi) {
		this.pc_bilgisi_aciklamasi = pc_bilgisi_aciklamasi;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	

}
