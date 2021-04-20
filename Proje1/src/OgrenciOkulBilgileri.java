import java.sql.Date;

public class OgrenciOkulBilgileri {
	
	private int og_tc;
	private String lisans_tipi;
	private String universite;
	private String fakulte;
	private String bolum;
	private String egitim_durumu;
	private Date bas_tar;
	private String ort_turu;
	private float ortalama;
	
	public int getOg_tc() {
		return og_tc;
	}
	public void setOg_tc(int og_tc) {
		this.og_tc = og_tc;
	}
	public String getLisans_tipi() {
		return lisans_tipi;
	}
	public void setLisans_tipi(String lisans_tipi) {
		this.lisans_tipi = lisans_tipi;
	}
	public String getUniversite() {
		return universite;
	}
	public void setUniversite(String universite) {
		this.universite = universite;
	}
	public String getFakulte() {
		return fakulte;
	}
	public void setFakulte(String fakulte) {
		this.fakulte = fakulte;
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
	public String getEgitim_durumu() {
		return egitim_durumu;
	}
	public void setEgitim_durumu(String egitim_durumu) {
		this.egitim_durumu = egitim_durumu;
	}
	public Date getBas_tar() {
		return bas_tar;
	}
	public void setBas_tar(Date bas_tar) {
		this.bas_tar = bas_tar;
	}
	public String getOrt_turu() {
		return ort_turu;
	}
	public void setOrt_turu(String ort_turu) {
		this.ort_turu = ort_turu;
	}
	public float getOrtalama() {
		return ortalama;
	}
	public void setOrtalama(float ortalama) {
		this.ortalama = ortalama;
	}
	
	

}
