import java.util.List;

import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

public class OgrenciBean {
	
	
	private OgrenciKisiselBilgileri ogrenciKisiselBilgileri = new OgrenciKisiselBilgileri ();
	private OgrenciOkulBilgileri ogrenciOkulBilgileri = new OgrenciOkulBilgileri();
	private OgrenciBilgisayarBilgisi  ogrenciBilgisayarBilgisi = new OgrenciBilgisayarBilgisi();
	private OgrenciSertifikaBilgisi ogrenciSertifikaBilgisi = new OgrenciSertifikaBilgisi();
	private OgrenciYabanciDil ogrenciYabanciDil = new OgrenciYabanciDil();
	private OgrenciGiris ogrenciGiris=new OgrenciGiris();
	
	public void ogrenciGirisKaydet() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.persist(getOgrenciGiris());
        en.getTransaction().commit();
        setOgrenciGiris(new OgrenciGiris());
    }
	
	public void ogrenciKisiselBilgileriKaydet() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.persist(getOgrenciKisiselBilgileri());
        en.getTransaction().commit();
        setOgrenciKisiselBilgileri(new OgrenciKisiselBilgileri());
    }
	
	public void ogrenciKisiselBilgileriSil() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.remove(getOgrenciKisiselBilgileri());
        en.getTransaction().commit();
        setOgrenciKisiselBilgileri(new OgrenciKisiselBilgileri());
    }
    public void ogrenciKisiselBilgileriGuncelle() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.merge(getOgrenciKisiselBilgileri());
        en.getTransaction().commit();
        setOgrenciKisiselBilgileri(new OgrenciKisiselBilgileri());
    }
    
    
    public List<OgrenciKisiselBilgileri> getOgrenciKisiselBilgileriListesi() {
        EntityManager en = EntityUtil.getEntityManager();
        return en.createQuery("from Ogrenci_kisisel_bilgileri").getResultList();

    }
    
    
  //*******************************************************************************************************//
    
    
    public void ogrenciOkulBilgileriKaydet() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.persist(getOgrenciOkulBilgileri());
        en.getTransaction().commit();
        setOgrenciOkulBilgileri(new OgrenciOkulBilgileri());
    }
	
	public void ogrenciOkulBilgileriSil() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.remove(getOgrenciOkulBilgileri());
        en.getTransaction().commit();
        setOgrenciOkulBilgileri(new OgrenciOkulBilgileri());
    }
    public void ogrenciOkulBilgileriGuncelle() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.merge(getOgrenciOkulBilgileri());
        en.getTransaction().commit();
        setOgrenciOkulBilgileri(new OgrenciOkulBilgileri());
    }
    
    
    public List<OgrenciOkulBilgileri> getOgrenciOkulBilgileriListesi() {
        EntityManager en = EntityUtil.getEntityManager();
        return en.createQuery("from Ogrenci_okul_bilgileri").getResultList();

    }
    
    //*******************************************************************************************************//
    
    public void pgrenciBilgisayarBilgisiKaydet() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.persist(getOgrenciBilgisayarBilgisi());
        en.getTransaction().commit();
        setOgrenciBilgisayarBilgisi(new OgrenciBilgisayarBilgisi());
    }
	
	public void ogrenciBilgisayarBilgisiSil() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.remove(getOgrenciBilgisayarBilgisi());
        en.getTransaction().commit();
        setOgrenciBilgisayarBilgisi(new OgrenciBilgisayarBilgisi());
    }
    public void ogrenciBilgisayarBilgisiGuncelle() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.merge(getOgrenciBilgisayarBilgisi());
        en.getTransaction().commit();
        setOgrenciBilgisayarBilgisi(new OgrenciBilgisayarBilgisi());
    }
    
    
    public List<OgrenciBilgisayarBilgisi> getOgrenciBilgisayarBilgisiListesi() {
        EntityManager en = EntityUtil.getEntityManager();
        return en.createQuery("from Ogrenci_pc_bilgisi").getResultList();

    }
    
    //*******************************************************************************************************//
    
    public void ogrenciSertifikaBilgisiKaydet() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.persist(getOgrenciSertifikaBilgisi());
        en.getTransaction().commit();
        setOgrenciSertifikaBilgisi(new OgrenciSertifikaBilgisi());
    }
	
	public void ogrenciSertifikaBilgisiSil() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.remove(getOgrenciSertifikaBilgisi());
        en.getTransaction().commit();
        setOgrenciSertifikaBilgisi(new OgrenciSertifikaBilgisi());
    }
    public void ogrenciSertifikaBilgisiGuncelle() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.merge(getOgrenciSertifikaBilgisi());
        en.getTransaction().commit();
        setOgrenciSertifikaBilgisi(new OgrenciSertifikaBilgisi());
    }
    
    
    public List<OgrenciSertifikaBilgisi> getOgrenciSertifikaBilgisiListesi() {
        EntityManager en = EntityUtil.getEntityManager();
        return en.createQuery("from Ogrenci_sertifika_bilgisi").getResultList();

    }
    
    
    //*******************************************************************************************************//
    
    public void ogrenciYabanciDilKaydet() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.persist(getOgrenciYabanciDil());
        en.getTransaction().commit();
        setOgrenciYabanciDil(new OgrenciYabanciDil());
    }
	
	public void ogrenciYabanciDilSil() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.remove(getOgrenciYabanciDil());
        en.getTransaction().commit();
        setOgrenciYabanciDil(new OgrenciYabanciDil());
    }
    public void ogrenciYabanciDilGuncelle() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.merge(getOgrenciYabanciDil());
        en.getTransaction().commit();
        setOgrenciYabanciDil(new OgrenciYabanciDil());
    }
    
    
    public List<OgrenciKisiselBilgileri> getOgrenciYabanciDilListesi() {
        EntityManager en = EntityUtil.getEntityManager();
        return en.createQuery("from Ogrenci_sertifika_bilgisi").getResultList();

    }
	
    
	
	
	
	
	public OgrenciKisiselBilgileri getOgrenciKisiselBilgileri() {
		return ogrenciKisiselBilgileri;
	}
	public void setOgrenciKisiselBilgileri(OgrenciKisiselBilgileri ogrenciKisiselBilgileri) {
		this.ogrenciKisiselBilgileri = ogrenciKisiselBilgileri;
	}
	public OgrenciOkulBilgileri getOgrenciOkulBilgileri() {
		return ogrenciOkulBilgileri;
	}
	public void setOgrenciOkulBilgileri(OgrenciOkulBilgileri ogrenciOkulBilgileri) {
		this.ogrenciOkulBilgileri = ogrenciOkulBilgileri;
	}
	public OgrenciBilgisayarBilgisi getOgrenciBilgisayarBilgisi() {
		return ogrenciBilgisayarBilgisi;
	}
	public void setOgrenciBilgisayarBilgisi(OgrenciBilgisayarBilgisi ogrenciBilgisayarBilgisi) {
		this.ogrenciBilgisayarBilgisi = ogrenciBilgisayarBilgisi;
	}
	public OgrenciSertifikaBilgisi getOgrenciSertifikaBilgisi() {
		return ogrenciSertifikaBilgisi;
	}
	public void setOgrenciSertifikaBilgisi(OgrenciSertifikaBilgisi ogrenciSertifikaBilgisi) {
		this.ogrenciSertifikaBilgisi = ogrenciSertifikaBilgisi;
	}
	public OgrenciYabanciDil getOgrenciYabanciDil() {
		return ogrenciYabanciDil;
	}
	public void setOgrenciYabanciDil(OgrenciYabanciDil ogrenciYabanciDil) {
		this.ogrenciYabanciDil = ogrenciYabanciDil;
	}

	public OgrenciGiris getOgrenciGiris() {
		return ogrenciGiris;
	}

	public void setOgrenciGiris(OgrenciGiris ogrenciGiris) {
		this.ogrenciGiris = ogrenciGiris;
	}
	
	
	
	
	

}
