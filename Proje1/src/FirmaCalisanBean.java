import java.util.List;

import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

public class FirmaCalisanBean {
	
	private FirmaCalisanBilgileri firmaCalisanBilgileri = new FirmaCalisanBilgileri();
	private FirmaCalisanGiris firmaCalisanGiris = new FirmaCalisanGiris();
	private String email=" ";
	private String yorum;
	private String departman;
    private String firmaEmail;
    List<FirmaCalisanGiris> isim;
    
	public String calisanGirisKontrol() {
        if (getCalisanGiris1().size() == 1) {
        	firmaCalisanGiris = getCalisanGiris1().get(0);
             
            return "firmaCalisanAnasayfa";
        } else {
            return "calisanGirisEkranı";
        }
    }

public List<FirmaCalisanGiris> getCalisanGiris1() {
		
        EntityManager en = EntityUtil.getEntityManager();
        isim=en.createQuery("from FirmaCalisanGiris where email='"+getFirmaCalisanGiris().getEmail()+"'").getResultList();
        email=getFirmaCalisanGiris().getEmail();
        firmaEmail=isim.get(0).getFirmaEmail();
        
        return en.createQuery("from FirmaCalisanGiris where email = '" +getFirmaCalisanGiris().getEmail() 
                + "' and sifre = '" + getFirmaCalisanGiris().getSifre()+"'").getResultList();
    }



public List<FirmaCalisanBilgileri>  CalisanYorumListele() {
	EntityManager en=EntityUtil.getEntityManager();
	return(en.createQuery("from FirmaCalisanBilgileri where mail= :mail").setParameter("mail",firmaCalisanGiris.getEmail()).getResultList());
	
}

public List<FirmaCalisanBilgileri>  CalisanYorumListeleTum() {
	EntityManager en=EntityUtil.getEntityManager();
	return(en.createQuery("from FirmaCalisanBilgileri").getResultList());
	
}

public void YorumGuncelle() {
    EntityManager en = EntityUtil.getEntityManager();
    firmaCalisanBilgileri.setBolum(departman);
    firmaCalisanBilgileri.setYorum(yorum);
    en.getTransaction().begin();
    
    en.merge(getFirmaCalisanBilgileri());
    en.getTransaction().commit();
    setFirmaCalisanBilgileri(new FirmaCalisanBilgileri());
}




	
	
	
	public void firmaCalisanBilgileriKaydet() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.persist(getFirmaCalisanBilgileri());
        en.getTransaction().commit();
        setFirmaCalisanBilgileri(new FirmaCalisanBilgileri());
    }
	
	public void firmaCalisanBilgileriSil() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.remove(getFirmaCalisanBilgileri());
        en.getTransaction().commit();
        setFirmaCalisanBilgileri(new FirmaCalisanBilgileri());
    }
    public void firmaCalisanBilgileriGuncelle() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.merge(getFirmaCalisanBilgileri());
        en.getTransaction().commit();
        setFirmaCalisanBilgileri(new FirmaCalisanBilgileri());
    }
    
    
    public List<FirmaCalisanBilgileri> getFirmaCalisanBilgileriListesi() {
        EntityManager en = EntityUtil.getEntityManager();
        return en.createQuery("from FirmaCalisanBilgileri").getResultList();

    }
	
	

	public FirmaCalisanBilgileri getFirmaCalisanBilgileri() {
		return firmaCalisanBilgileri;
	}

	public void setFirmaCalisanBilgileri(FirmaCalisanBilgileri firmaCalisanBilgileri) {
		this.firmaCalisanBilgileri = firmaCalisanBilgileri;
	}

	public FirmaCalisanGiris getFirmaCalisanGiris() {
		return firmaCalisanGiris;
	}

	public void setFirmaCalisanGiris(FirmaCalisanGiris firmaCalisanGiris) {
		this.firmaCalisanGiris = firmaCalisanGiris;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getYorum() {
		return yorum;
	}

	public void setYorum(String yorum) {
		this.yorum = yorum;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public String getFirmaEmail() {
		return firmaEmail;
	}

	public void setFirmaEmail(String firmaEmail) {
		this.firmaEmail = firmaEmail;
	}


	
	

}
