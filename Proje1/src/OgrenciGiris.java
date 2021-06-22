import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.management.Query;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.servlet.http.HttpSession;
import javax.transaction.Transaction;
import javax.websocket.Session;

import org.hibernate.ejb.HibernateEntityManager;
import org.hibernate.ejb.HibernateEntityManagerFactory;
import org.hibernate.ejb.HibernateEntityManagerImplementor;

import com.journaldev.jsf.beans.SessionUtils;
import com.journaldev.jsf.util.DataConnect;
import com.mergeCons.egitim.util.EntityUtil;

@Entity
//@NamedQuery(name="deneme", query="Update ogrenciKisiselBilgileri,ogrenciGiris set ogrenciKisiselBilgileri.soyad=ogrenciGiris.soyad where ogrenciKisiselBilgileri.kisiselId=ogrenciGiris.girisId")
public class OgrenciGiris implements Serializable {
	private static final long serialVersionUID = 1094801825228386363L;
	@Id
	private
	String email;
	//Integer girisId;
	
	private String ad;
	private String soyad;
	private String sifre;
	

	/*
	@OneToOne
	private
	
	OgrenciKisiselBilgileri ogrenciKisiselBilgi=new OgrenciKisiselBilgileri();*/
	

	

	/*
	//validate login
	public String validateUsernamePassword() {
		//FacesContext.getCurrentInstance().getExternalContext().getRequestHeaderValuesMap().get("email");
		//FacesContext.getCurrentInstance().getExternalContext().getRequestHeaderValuesMap().get("sifre");
	//email=getEmail().toString();
	//sifre=getSifre().toString();
	
		System.out.print("aaaaaaaaaaaaa");
		boolean valid=validate();
		
		if (valid) {
		
			HttpSession session = SessionUtils.getSession();
			session.setAttribute("email", getEmail());
			return "ogrenciBilgileri";
		} else {
			
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN,
							"Incorrect Username and Passowrd",
							"Please enter correct username and Password"));
			return "anasayfa";
		}
	}
	
	
	
	
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
	
	
	*/
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}


/*
	public OgrenciKisiselBilgileri getOgrkisiselbil() {
		return ogrkisiselbil;
	}
	public void setOgrkisiselbil(OgrenciKisiselBilgileri ogrkisiselbil) {
		this.ogrkisiselbil = ogrkisiselbil;
	}
	*/
	
	
			
		
			
		public List<String> getOgrenciGirisListesi() {
        EntityManager en = EntityUtil.getEntityManager();
        return en.createQuery("from ogrencigiris where email=? and sifre=?").getResultList();

    }
	
		
		
		
		
		
		
		



		//logout event, invalidate session
		public String logout() {
			HttpSession session = SessionUtils.getSession();
			session.invalidate();
			return "anasayfa";
		}




	
/*

		public OgrenciKisiselBilgileri getOgrenciKisiselBilgi() {
			return ogrenciKisiselBilgi;
		}




		public void setOgrenciKisiselBilgi(OgrenciKisiselBilgileri ogrenciKisiselBilgi) {
			this.ogrenciKisiselBilgi = ogrenciKisiselBilgi;
		}*/
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		




	






		
	
		
		
	
		
}
