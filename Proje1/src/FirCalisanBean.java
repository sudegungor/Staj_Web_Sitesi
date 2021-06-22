import java.util.List;


import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

public class FirCalisanBean {
	private FirmaCalisanGiris calisangiris=new FirmaCalisanGiris();
	private FirmaBilgileri firmaBilgileri=new FirmaBilgileri();
	private String firmaEmail="";
	String deneme=" ";
	private String email="";
	
	
	public FirmaCalisanGiris getCalisangiris() {
		return calisangiris;
	}

	public void setCalisangiris(FirmaCalisanGiris calisangiris) {
		this.calisangiris = calisangiris;
	}
	public void calisanKaydet() {
		calisangiris.setFirmaEmail(firmaEmail);
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.persist(getCalisangiris());
        en.getTransaction().commit();
        setCalisangiris(new FirmaCalisanGiris());
    }
	 public List<FirmaCalisanGiris> getfirmacalisanlistele() {
	        EntityManager en = EntityUtil.getEntityManager();
	        email=firmaBilgileri.getEmail();
	        return en.createQuery("from FirmaCalisanGiris").getResultList();

	    }
	 public void firmacalisanSil() {
	        EntityManager en = EntityUtil.getEntityManager();
	        en.getTransaction().begin();
	        en.remove(getCalisangiris());
	        en.getTransaction().commit();
	        setCalisangiris(new FirmaCalisanGiris());
	

}

	public String getEmail() {
		calisangiris.setEmail(email);
		return email;
	}

	public void setEmail(String email) {
		
		this.email = email;
	}

	public FirmaBilgileri getFirmaBilgileri() {
		return firmaBilgileri;
	}

	public void setFirmaBilgileri(FirmaBilgileri firmaBilgileri) {
		this.firmaBilgileri = firmaBilgileri;
	}

	public String getFirmaEmail() {
		return firmaEmail;
	}

	public void setFirmaEmail(String firmaEmail) {
		this.firmaEmail = firmaEmail;
	}



}
