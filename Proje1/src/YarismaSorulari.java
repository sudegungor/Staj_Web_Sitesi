import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SoruHavuzu")
public class YarismaSorulari {
	@Id
	@GeneratedValue
	private
	Integer id_Soru;
	private String firmaAdi;
	private String soru;
	private String a;
	private String b;
	private String c;
	private String d;
	private String dogruCevap;
	public Integer getId_Soru() {
		return id_Soru;
	}
	public void setId_Soru(Integer id_Soru) {
		this.id_Soru = id_Soru;
	}
	
	public String getSoru() {
		return soru;
	}
	public void setSoru(String soru) {
		this.soru = soru;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	public String getDogruCevap() {
		return dogruCevap;
	}
	public void setDogruCevap(String dogruCevap) {
		this.dogruCevap = dogruCevap;
	}
	public String getFirmaAdi() {
		return firmaAdi;
	}
	public void setFirmaAdi(String firmaAdi) {
		this.firmaAdi = firmaAdi;
	}

}
