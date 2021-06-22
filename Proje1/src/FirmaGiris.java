
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class FirmaGiris {
		@GeneratedValue
		private
		Integer id;
	
		@Id
		private
		String email;
		
		private String firmaAd;
		 private String firmaSifre;
		
		 
		public String getFirmaAd() {
			return firmaAd;
		}
		public void setFirmaAd(String firmaAd) {
			this.firmaAd = firmaAd;
		}
		public String getFirmaSifre() {
			return firmaSifre;
		}
		public void setFirmaSifre(String firmaSifre) {
			this.firmaSifre = firmaSifre;
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
