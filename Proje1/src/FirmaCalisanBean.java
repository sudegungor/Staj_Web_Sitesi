import java.util.List;

import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

public class FirmaCalisanBean {
	
	private FirmaCalisanBilgileri firmaCalisanBilgileri = new FirmaCalisanBilgileri();
	
	
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
        return en.createQuery("from Firma_calisan_bilgileri").getResultList();

    }
	
	

	public FirmaCalisanBilgileri getFirmaCalisanBilgileri() {
		return firmaCalisanBilgileri;
	}

	public void setFirmaCalisanBilgileri(FirmaCalisanBilgileri firmaCalisanBilgileri) {
		this.firmaCalisanBilgileri = firmaCalisanBilgileri;
	}
	
	

}
