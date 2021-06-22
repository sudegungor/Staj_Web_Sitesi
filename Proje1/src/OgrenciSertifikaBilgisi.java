import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "ogrenciSertifikaBilgi")
public class OgrenciSertifikaBilgisi {
	
	@Id
	private
	Integer id;
	
	private String email;
	private String sertifika_adi;
	private String sertifikayi_veren_kurum;
	private java.util.Date alinma_tarihi;
	private java.util.Date bitis_tarihi;
	private String aciklama;
	

	
	public String getSertifika_adi() {
		return sertifika_adi;
	}
	public void setSertifika_adi(String sertifika_adi) {
		this.sertifika_adi = sertifika_adi;
	}
	public String getSertifikayi_veren_kurum() {
		return sertifikayi_veren_kurum;
	}
	public void setSertifikayi_veren_kurum(String sertifikayi_veren_kurum) {
		this.sertifikayi_veren_kurum = sertifikayi_veren_kurum;
	}

	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}


	public java.util.Date getAlinma_tarihi() {
		return alinma_tarihi;
	}
	public void setAlinma_tarihi(java.util.Date alinma_tarihi) {
		this.alinma_tarihi = alinma_tarihi;
	}
	public java.util.Date getBitis_tarihi() {
		return bitis_tarihi;
	}
	public void setBitis_tarihi(java.util.Date bitis_tarihi) {
		this.bitis_tarihi = bitis_tarihi;
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
