import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class OgrenciBasvuru implements Serializable {
	
	@Id
	private
	Integer id;
	private String email;
	private String firmaAdi;
	private String firmaEmail;
	private String stajGun;
	private String stajTur;
	private Date stajarakik;
	private String stajyerDep;

	public String getFirmaAdi() {
		return firmaAdi;
	}
	public void setFirmaAdi(String firmaAdi) {
		this.firmaAdi = firmaAdi;
	}
	public String getStajGun() {
		return stajGun;
	}
	public void setStajGun(String stajGun) {
		this.stajGun = stajGun;
	}
	public String getStajTur() {
		return stajTur;
	}
	public void setStajTur(String stajTur) {
		this.stajTur = stajTur;
	}
	public Date getStajarakik() {
		return stajarakik;
	}
	public void setStajarakik(Date stajarakik) {
		this.stajarakik = stajarakik;
	}
	public String getStajyerDep() {
		return stajyerDep;
	}
	public void setStajyerDep(String stajyerDep) {
		this.stajyerDep = stajyerDep;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirmaEmail() {
		return firmaEmail;
	}
	public void setFirmaEmail(String firmaEmail) {
		this.firmaEmail = firmaEmail;
	}

	/*   
	public String kaydet()
	    {
	        PreparedStatement ps=null;
	        Connection con=null;
	        try{
	            Class.forName("com.mysql.jdbc.Driver");
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/proje","root","123");
	            ps=con.prepareStatement("INSERT INTO OgrenciBasvuru(email) VALUES (?)");

//	            ps.setInt(1, id);
	            ps.setString(2, email);
	            ps.setString(3, firmaAdi);
	            ps.setString(4, stajGun);
	            ps.setString(5, stajTur);
	            ps.setDate(6,(java.sql.Date) stajarakik);
	            ps.setString(7, stajyerDep);
	            ps.executeUpdate();
	           
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	        return "";
	    }


	*/

	

}
