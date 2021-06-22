import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//import sun.jvm.hotspot.oops.java_lang_Class;

//import sun.jvm.hotspot.oops.java_lang_Class;

@Entity
public class firmailanver1 {
	@GeneratedValue
	@Id
private Integer id;
private String firmaAdi;
private String stajyerDep;
private String stajTur;
private Date stajAralik1;
private Date stajaralik2;
private String stajGun1;
private String stajGun2;
private String stajyerSayi;
private Date ilanbas;
private Date ilanbit;
public String getFirmaAdi() {
	return firmaAdi;
}
public void setFirmaAdi(String firmaAdi) {
	this.firmaAdi = firmaAdi;
}
public String getStajyerDep() {
	return stajyerDep;
}
public void setStajyerDep(String stajyerDep) {
	this.stajyerDep = stajyerDep;
}



public String getStajyerSayi() {
	return stajyerSayi;
}
public void setStajyerSayi(String stajyerSayi) {
	this.stajyerSayi = stajyerSayi;
}

public String getStajGun1() {
	return stajGun1;
}
public void setStajGun1(String stajGun1) {
	this.stajGun1 = stajGun1;
}
public String getStajGun2() {
	return stajGun2;
}
public void setStajGun2(String stajGun2) {
	this.stajGun2 = stajGun2;
}


public String getStajTur() {
	return stajTur;
}
public void setStajTur(String stajTur) {
	this.stajTur = stajTur;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;




}
public Date getStajAralik1() {
	return stajAralik1;
}
public void setStajAralik1(Date stajAralik1) {
	this.stajAralik1 = stajAralik1;
}
public Date getStajaralik2() {
	return stajaralik2;
}
public void setStajaralik2(Date stajaralik2) {
	this.stajaralik2 = stajaralik2;
}
public Date getIlanbas() {
	return ilanbas;
}
public void setIlanbas(Date ilanbas) {
	this.ilanbas = ilanbas;
}
public Date getIlanbit() {
	return ilanbit;
}
public void setIlanbit(Date ilanbit) {
	this.ilanbit = ilanbit;
}


}
