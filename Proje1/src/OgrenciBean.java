import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.http.HttpSession;

import com.journaldev.jsf.beans.SessionUtils;
import com.journaldev.jsf.util.DataConnect;
import com.mergeCons.egitim.util.EntityUtil;
import com.mysql.jdbc.Statement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.Console;
import java.sql.*;

public class OgrenciBean {
	
	
	private OgrenciKisiselBilgileri ogrenciKisiselBilgileri = new OgrenciKisiselBilgileri ();
	private OgrenciOkulBilgileri ogrenciOkulBilgileri = new OgrenciOkulBilgileri();
	private OgrenciBilgisayarBilgisi  ogrenciBilgisayarBilgisi = new OgrenciBilgisayarBilgisi();
	private OgrenciSertifikaBilgisi ogrenciSertifikaBilgisi = new OgrenciSertifikaBilgisi();
	private OgrenciYabanciDil ogrenciYabanciDil = new OgrenciYabanciDil();
	private OgrenciGiris ogrenciGiris=new OgrenciGiris();
	private OgrenciBasvuru ogrenciBasvuru=new OgrenciBasvuru();
	private OgrenciSoru ogrencisoru=new OgrenciSoru();
	private FirmaBean firmaBean=new FirmaBean();
	//private FirmaGiris firmagiris=new FirmaGiris();
	 private List<SelectItem> ilceListesi=new ArrayList<SelectItem>();
	 private List<SelectItem> firmaEmailListe1=new ArrayList<SelectItem>();
	 private String deneme111=" ";
	 private String email=" ";
	 private String email1=" "; //ilan için email
	 private String email2=" ";//basvuru için email
	 public void deneYaz() {
	        System.out.println(deneme111);// sayfa tetikleme
	   }
	
	 
	 
	
//------------------------------------------------	
	   public void ogrenciBasvuruGuncelle() {
	        EntityManager en = EntityUtil.getEntityManager();
	        en.getTransaction().begin();
	        en.merge(getOgrenciBasvuru());
	        en.getTransaction().commit();
	        setOgrenciBasvuru(new OgrenciBasvuru());
	   }
	   
	   public void ogrenciBasvuruKaydet() {
		    EntityManager en = EntityUtil.getEntityManager();
	        en.getTransaction().begin();
	        en.persist(ogrenciBasvuru);
	        en.getTransaction().commit();
	        ogrenciBasvuru=new OgrenciBasvuru();
	   }
	
	
	public String ogrenciGirisKontrol() {
        if (getOgrenciGiris1().size() == 1) {
            ogrenciGiris = getOgrenciGiris1().get(0);
            
            return "ogrenciAnasayfa";
        } else {
            return "ogrenciGirisEkranı";
        }
	}

public List<OgrenciGiris> getOgrenciGiris1() {
        EntityManager en = EntityUtil.getEntityManager();
        
        return en.createQuery("from OgrenciGiris where email = '" + ogrenciGiris.getEmail()
                + "' and sifre = '" + ogrenciGiris.getSifre()+"'").getResultList();
}

	
public void getDeneme() {
	EntityManager en = EntityUtil.getEntityManager();
	
    //en.createQuery("deneme").setParameter("id", ogrenciGiris.getEmail()).getResultList();
	
   en.getTransaction().begin();
   en.createQuery("Update ogrenciKisiselBilgileri OgrenciGiris set ogrenciKisiselBilgileri.soyad=ogrenciGiris.soyad where ogrenciKisiselBilgileri.kisiselId=ogrenciGiris.girisId").executeUpdate();
   //en.createQuery("UPDATE OgrenciGiris OgrenciKisiselBilgileri  SET OgrenciGiris.email=OgrenciKisiselBilgileri.email WHERE OgrenciKisiselBilgileri.kisiselId=OgrenciGiris.girisId").setParameter("email",ogrenciGiris.getEmail()).getResultList();
   en.getTransaction().commit();
   en.close();
    
    
}
	
	
	


	
	
	
	////////////////////////////////////////////////////
	
	public static boolean validate(String email, String sifre) {
		//email="ali@gmail.com";
		//sifre="123";
		Connection con = null;
	//java.sql.Statement	statement = null;
		PreparedStatement ps = null;
		
	
		try {
			con = DataConnect.getConnection();
			ps = con.prepareStatement("Select email, sifre from ogrencigiris where email = ? and sifre = ?");
			 //statement =  con.createStatement();  
	         //ResultSet results = statement.executeQuery("Select email, sifre from ogrencigiris where email = ? and sifre = ?");
			ps.setString(1, email);
			ps.setString(2, sifre);
			//System.out.print(ps.executeQuery().toString());
			ResultSet rs = ps.executeQuery();
			
			
			if (rs.next()) {
				//result found, means valid inputs
				return true;
			}
	

	    } catch (SQLException ex) {
	    	System.out.print(email);
            System.out.println("Login error -->" + ex.getMessage());
            return false;
        }
		
		
	    finally {
			DataConnect.close(con);
		}
		System.out.print(email);
		return false;
	}
	
	

	
	
public List<String> getOgrenciAra() {
	EntityManager en=EntityUtil.getEntityManager();
	return en.createQuery("from OgrenciKisiselBilgileri where email = :email").setParameter("email", this.ogrenciKisiselBilgileri.getEmail()).getResultList();
	
}

public List<OgrenciKisiselBilgileri> getOgrenciKisiselBilgileriFirma() {
    EntityManager en = EntityUtil.getEntityManager();
    return en.createQuery("from OgrenciKisiselBilgileri where email=:email").setParameter("email", getDeneme111()).getResultList();

}


public List<OgrenciOkulBilgileri> getOgrenciOkulBilgileriFirma() {
    EntityManager en = EntityUtil.getEntityManager();
    return en.createQuery("from OgrenciOkulBilgileri where email=:email").setParameter("email", getDeneme111()).getResultList();

}



public List<OgrenciBasvuru> getOgrenciGelenBasvuruListesi() {
    EntityManager en = EntityUtil.getEntityManager();
    return en.createQuery("from OgrenciBasvuru").getResultList();

}
	
	public List<OgrenciKisiselBilgileri> getOgrenciKisiselBilgileriListesi() {
        EntityManager en = EntityUtil.getEntityManager();
        email=ogrenciGiris.getEmail();
        email1=ogrenciGiris.getEmail();
        email2=ogrenciGiris.getEmail();
        return en.createQuery("from OgrenciKisiselBilgileri where email=:email").setParameter("email", ogrenciGiris.getEmail()).getResultList();

    }

	public List<OgrenciKisiselBilgileri> getOgrenciKisiselBilgileriTamListe() {
        EntityManager en = EntityUtil.getEntityManager();
        return en.createQuery("from OgrenciKisiselBilgileri").getResultList();

    }
	
	public void ogrenciGirisKaydet() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.persist(ogrenciGiris);
        en.getTransaction().commit();
        ogrenciGiris=new OgrenciGiris();
    }
//OGRENCI KISISEL BILGILER VERITABANI İŞLEMLERİ	
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
    
    
    
    
  //OGRENCI OKUL BİLGİLERİ VERİTABANI İŞLEMLERİ
    
    
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
        return en.createQuery("from OgrenciOkulBilgileri").getResultList();

    }
    
    public List<OgrenciOkulBilgileri> getOgrenciOkulListesiOzel() {
        EntityManager en = EntityUtil.getEntityManager();
        return en.createQuery("from OgrenciOkulBilgileri where email=:email").setParameter("email", ogrenciGiris.getEmail()).getResultList();

    }
  //OGRENCİ STAJ BASVURU İŞLEMLERİ  
    public List<OgrenciBasvuru> getOgrenciBasvuruListesi() {
        EntityManager en = EntityUtil.getEntityManager();
        return en.createQuery("from OgrenciBasvuru where email=:email").setParameter("email", ogrenciGiris.getEmail()).getResultList();

    }
    
 
    //OGRENCİ BİLGİSAYAR BİLGİSİ VERİTABANI İŞLEMLERİ
    
    public void ogrenciBilgisayarBilgisiKaydet() {
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
        return en.createQuery("from OgrenciBilgisayarBilgisi").getResultList();

    }
    
  
    //OGRENCİ SERTİFİKA VERİTABANI İŞLEMLERİ
    
    public void ogrenciSertifikaBilgisiKaydet() {
        EntityManager en = EntityUtil.getEntityManager();
        en.getTransaction().begin();
        en.persist(ogrenciSertifikaBilgisi);
        en.getTransaction().commit();
        ogrenciSertifikaBilgisi=new OgrenciSertifikaBilgisi();
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
        return en.createQuery("from OgrenciSertifikaBilgisi").getResultList();

    }
    
    public List<OgrenciSertifikaBilgisi> getOgrenciSertifikaBilgisiKisiListesi() {
        EntityManager en = EntityUtil.getEntityManager();
        return en.createQuery("from OgrenciSertifikaBilgisi where email=:email").setParameter("email",email).getResultList();

    }
    
    public List<OgrenciSertifikaBilgisi> getOgrenciSertifikaBilgileriFirma() {
        EntityManager en = EntityUtil.getEntityManager();
        return en.createQuery("from OgrenciSertifikaBilgisi where email=:email").setParameter("email", getDeneme111()).getResultList();

    }
    public List<OgrenciYabanciDil> getOgrenciYabanciDilBilgileriFirma() {
        EntityManager en = EntityUtil.getEntityManager();
        return en.createQuery("from OgrenciYabanciDil where email=:email").setParameter("email", getDeneme111()).getResultList();

    }
    public List<OgrenciBilgisayarBilgisi> getOgrenciBİlgisayarBilgileriFirma() {
        EntityManager en = EntityUtil.getEntityManager();
        return en.createQuery("from OgrenciBilgisayarBilgisi where email=:email").setParameter("email", getDeneme111()).getResultList();

    }
    
    
    //OGRENCİ YABANCI DİL VERİTABANI İŞLEMLERİ
    
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
    
    
    public List<OgrenciYabanciDil> getOgrenciYabanciDilListesi() {
        EntityManager en = EntityUtil.getEntityManager();
        return en.createQuery("from OgrenciYabanciDil").getResultList();

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
	

	public void ilceYukle(ValueChangeEvent event) {
		getIlceListesi().clear();
		String secilen=(String)event.getNewValue();
		if(secilen.equalsIgnoreCase("Adana")) {
			getIlceListesi().add(new SelectItem("Kozan"));
			getIlceListesi().add(new SelectItem("Kadirli"));
			getIlceListesi().add(new SelectItem("Seyhan"));
			getIlceListesi().add(new SelectItem("Karsanti"));
		}
		else if(secilen.equalsIgnoreCase("Ankara")) {
			getIlceListesi().add(new SelectItem("Cankaya"));
			getIlceListesi().add(new SelectItem("Etimesgut"));
			getIlceListesi().add(new SelectItem("Sincan"));
			getIlceListesi().add(new SelectItem("Kecioren"));
		}
		
		else if(secilen.equalsIgnoreCase("Istanbul")) {
			getIlceListesi().add(new SelectItem("Besiktas"));
			getIlceListesi().add(new SelectItem("Kadikoy"));
			getIlceListesi().add(new SelectItem("Uskudar"));
			getIlceListesi().add(new SelectItem("Sisli"));
		}
		else if(secilen.equalsIgnoreCase("Kayseri")) {
			getIlceListesi().add(new SelectItem("Kocasinan"));
			getIlceListesi().add(new SelectItem("Melikgazi"));
			getIlceListesi().add(new SelectItem("Talas"));
			getIlceListesi().add(new SelectItem("Hacılar"));
		}
		
	}
	
	
	public void firmaEmailYukle(ValueChangeEvent event) {
		getFirmaEmailListe1().clear();
		String secilen=(String)event.getNewValue();
		if(secilen.equalsIgnoreCase("Aselsan")) {
			getFirmaEmailListe1().add(new SelectItem("aselsan@gmail.com"));
			
		}
		else if(secilen.equalsIgnoreCase("Havelsan")) {
			getFirmaEmailListe1().add(new SelectItem("havelsan@gmail.com"));
			
		}
		
		else if(secilen.equalsIgnoreCase("Roketsan")) {
			getFirmaEmailListe1().add(new SelectItem("roketsan@gmail.com"));
		
		}
		
		
	}

	public List<SelectItem> getIlceListesi() {
		return ilceListesi;
	}

	public void setIlceListesi(List<SelectItem> ilceListesi) {
		this.ilceListesi = ilceListesi;
	}

	public OgrenciBasvuru getOgrenciBasvuru() {
		return ogrenciBasvuru;
	}

	public void setOgrenciBasvuru(OgrenciBasvuru ogrenciBasvuru) {
		this.ogrenciBasvuru = ogrenciBasvuru;
	}

	public List<SelectItem> getFirmaEmailListe1() {
		return firmaEmailListe1;
	}

	public void setFirmaEmailListe1(List<SelectItem> firmaEmailListe1) {
		this.firmaEmailListe1 = firmaEmailListe1;
	}



	public OgrenciSoru getOgrencisoru() {
		return ogrencisoru;
	}



	public void setOgrencisoru(OgrenciSoru ogrencisoru) {
		this.ogrencisoru = ogrencisoru;
	}
	//OGRENCI SORU CEVABINI KAYDET
	 public void ogrenciCevapKaydet() {
		    EntityManager en = EntityUtil.getEntityManager();
	        en.getTransaction().begin();
	        en.persist(ogrencisoru);
	        en.getTransaction().commit();
	        ogrencisoru=new OgrenciSoru();
	   }



	public FirmaBean getFirmaBean() {
		return firmaBean;
	}



	public void setFirmaBean(FirmaBean firmaBean) {
		this.firmaBean = firmaBean;
	}

	public String getDeneme111() {
		return deneme111;
	}

	public void setDeneme111(String deneme111) {
		this.deneme111 = deneme111;
	}




	public String getEmail() {
		ogrenciSertifikaBilgisi.setEmail(email);
		ogrencisoru.setEmail(email);
		ogrenciBilgisayarBilgisi.setEmail(email);
		ogrenciYabanciDil.setEmail(email);
		ogrenciBasvuru.setEmail(email);
		
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getEmail1() {
		return email1;
	}




	public void setEmail1(String email1) {
		this.email1 = email1;
	}




	public String getEmail2() {
		return email2;
	}




	public void setEmail2(String email2) {
		this.email2 = email2;
	}



	
	
 

	

}
