import java.sql.Date;

public class OgrenciSertifikaBilgisi {
	
	private int id;
	private int og_tc;
	private String sertifika_adi;
	private String sertifikayi_veren_kurum;
	private Date alinma_tarihi;
	private Date bitis_tarihi;
	private String aciklama;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOg_tc() {
		return og_tc;
	}
	public void setOg_tc(int og_tc) {
		this.og_tc = og_tc;
	}
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
	public Date getAlinma_tarihi() {
		return alinma_tarihi;
	}
	public void setAlinma_tarihi(Date alinma_tarihi) {
		this.alinma_tarihi = alinma_tarihi;
	}
	public Date getBitis_tarihi() {
		return bitis_tarihi;
	}
	public void setBitis_tarihi(Date bitis_tarihi) {
		this.bitis_tarihi = bitis_tarihi;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

}
