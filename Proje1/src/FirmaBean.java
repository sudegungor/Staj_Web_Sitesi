import java.util.List;

import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

public class FirmaBean {
	
	private FirmaBilgileri firma_bilgileri = new FirmaBilgileri();
	
	
	
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
	
	
	

	public FirmaBilgileri getFirma_bilgileri() {
		return firma_bilgileri;
	}

	public void setFirma_bilgileri(FirmaBilgileri firma_bilgileri) {
		this.firma_bilgileri = firma_bilgileri;
	}

}
