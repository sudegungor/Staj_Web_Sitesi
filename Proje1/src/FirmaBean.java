import java.util.List;

import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

public class FirmaBean {
	
	private FirmaBilgileri firma_bilgileri = new FirmaBilgileri();
	private FirmaGiris firmaGiris=new FirmaGiris();
	private FirmaCalisanGiris firmaCalisanGiris=new FirmaCalisanGiris();
	private FirmaCalisanBilgileri firmaCalisanBilgileri=new FirmaCalisanBilgileri();
	private FirCalisanBean firmaCalisanBean=new FirCalisanBean();
	private YarismaSorulari yarismaSorulari=new YarismaSorulari();
	private firmailanver1 ilanver1= new firmailanver1();
	private FirmaBasvuruGor basvurugor=new FirmaBasvuruGor();
	
	private FirmaCalisanGiris calisangiris1=new FirmaCalisanGiris();
	
	
	private String email1=" ";
	
	
	
	
	public void calisanKaydet() {
		calisangiris1.setFirmaEmail(email1);
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.persist(getCalisangiris1());
        en.getTransaction().commit();
        setCalisangiris1(new FirmaCalisanGiris());
    }
	
	public String firmaGirisKontrol() {
        if (getFirmaGiris1().size() == 1) {
            firmaGiris = getFirmaGiris1().get(0);
            
            return "firmaAnasayfa";
        } else {
            return "firmaGirisEkranı";
        }
    }

public List<FirmaGiris> getFirmaGiris1() {
        EntityManager en = EntityUtil.getEntityManager();
        
        return en.createQuery("from FirmaGiris where email = '" + firmaGiris.getEmail()
                + "' and firmaSifre = '" + firmaGiris.getFirmaSifre()+"'").getResultList();
}


//firma bilgisi listele (e-maile göre )
public List<FirmaBilgileri> getFirmaBilgileriListesi() {
    EntityManager en = EntityUtil.getEntityManager();
    email1=firmaGiris.getEmail();
    System.out.println("mahmut"+email1);
   
	firmaCalisanGiris.setFirmaEmail(email1);
	
    //System.out.print(firmaGiris.getEmail());
    return en.createQuery("from FirmaBilgileri  where email =:email").setParameter("email",firmaGiris.getEmail()).getResultList();


}


public List<OgrenciBasvuru>  StajBasvuruAra_1() {
	EntityManager en=EntityUtil.getEntityManager();
	return(en.createQuery("from OgrenciBasvuru where firmaEmail= :firmaEmail").setParameter("firmaEmail",firmaGiris.getEmail()).getResultList());
	
}

	public void basvuruKaydet() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.persist(getBasvurugor());
        en.getTransaction().commit();
        setBasvurugor(new FirmaBasvuruGor());
    }
	public void ilanKaydet() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.persist(getIlanver1());
        en.getTransaction().commit();
        setIlanver1(new firmailanver1());
    }
	 public List<firmailanver1> getilanver1Listesi() {
	        EntityManager en = EntityUtil.getEntityManager();
	        return en.createQuery("from firmailanver1").getResultList();

	    }
	
	
	public void yarismaSorusuKaydet() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.persist(getYarismaSorulari());
        en.getTransaction().commit();
        setYarismaSorulari(new YarismaSorulari());
    }
	
	public void firmaGirisKaydet() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.persist(getFirmaGiris());
        en.getTransaction().commit();
        setFirmaGiris(new FirmaGiris());
    }
	
	public void firma_bilgileriKaydet() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.persist(getFirma_bilgileri());
        en.getTransaction().commit();
        setFirma_bilgileri(new FirmaBilgileri());
    }
	
	public void firma_bilgileriSil() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.remove(getFirma_bilgileri());
        en.getTransaction().commit();
        setFirma_bilgileri(new FirmaBilgileri());
    }
    public void firma_bilgileriGuncelle() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.merge(getFirma_bilgileri());
        en.getTransaction().commit();
        setFirma_bilgileri(new FirmaBilgileri());
    }
    
    
    public List<FirmaBilgileri> getfirma_bilgileriListesi() {
        EntityManager en = EntityUtil.getEntityManager();
        return en.createQuery("from Firma_bilgileri").getResultList();

    }
    
    public List<YarismaSorulari> getOgrenciYarismaSorulariListesi() {
        EntityManager en = EntityUtil.getEntityManager();
        return en.createQuery("from YarismaSorulari").getResultList();

    }
	
   
	

	public FirmaBilgileri getFirma_bilgileri() {
		return firma_bilgileri;
	}

	public void setFirma_bilgileri(FirmaBilgileri firma_bilgileri) {
		this.firma_bilgileri = firma_bilgileri;
	}

	public FirmaGiris getFirmaGiris() {
		return firmaGiris;
	}

	public void setFirmaGiris(FirmaGiris firmaGiris) {
		this.firmaGiris = firmaGiris;
	}

	public YarismaSorulari getYarismaSorulari() {
		return yarismaSorulari;
	}

	public void setYarismaSorulari(YarismaSorulari yarismaSorulari) {
		this.yarismaSorulari = yarismaSorulari;
	}

	public firmailanver1 getIlanver1() {
		return ilanver1;
	}

	public void setIlanver1(firmailanver1 ilanver1) {
		this.ilanver1 = ilanver1;
	}
	public FirmaBasvuruGor getBasvurugor() {
		return basvurugor;
	}
	public void setBasvurugor(FirmaBasvuruGor basvurugor) {
		this.basvurugor = basvurugor;
	}


	 public List<FirmaCalisanGiris> getfirmacalisanlistele() {
	        EntityManager en = EntityUtil.getEntityManager();
	        
	        return en.createQuery("from FirmaCalisanGiris where email=:email").setParameter("email", firmaGiris.getEmail()).getResultList();

	    }

	public String getEmail1() {
		//firma_bilgileri.setEmail(email1);
		//firmaCalisanGiris.setEmail(email1);
	
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public FirmaCalisanGiris getFirmaCalisanGiris() {
		return firmaCalisanGiris;
	}

	public void setFirmaCalisanGiris(FirmaCalisanGiris firmaCalisanGiris) {
		this.firmaCalisanGiris = firmaCalisanGiris;
	}

	public FirmaCalisanBilgileri getFirmaCalisanBilgileri() {
		return firmaCalisanBilgileri;
	}

	public void setFirmaCalisanBilgileri(FirmaCalisanBilgileri firmaCalisanBilgileri) {
		this.firmaCalisanBilgileri = firmaCalisanBilgileri;
	}

	public FirCalisanBean getFirmaCalisanBean() {
		return firmaCalisanBean;
	}

	public void setFirmaCalisanBean(FirCalisanBean firmaCalisanBean) {
		this.firmaCalisanBean = firmaCalisanBean;
	}

	public FirmaCalisanGiris getCalisangiris1() {
		return calisangiris1;
	}

	public void setCalisangiris1(FirmaCalisanGiris calisangiris1) {
		this.calisangiris1 = calisangiris1;
	}

}
