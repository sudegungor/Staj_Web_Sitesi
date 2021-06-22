import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//import sun.jvm.hotspot.oops.java_lang_Class;

@Entity
public class FirmailanVer {
	@GeneratedValue
	@Id
	private Integer id;
private String firmaAdi;
private String stajyerDep;
private String stajTur;
private java.util.Date stajAralik1;
private java.util.Date stajaralik2;
private String stajGun1;
private String stajGun2;
private String stajyerSayi;
private java.util.Date ilanbas;
private java.util.Date ilanbit;
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
public java.util.Date getIlanbit() {
	return ilanbit;
}
public void setIlanbit(java.util.Date ilanbit) {
	this.ilanbit = ilanbit;
}
public java.util.Date getIlanbas() {
	return ilanbas;
}
public void setIlanbas(java.util.Date ilanbas) {
	this.ilanbas = ilanbas;
}
public java.util.Date getStajaralik2() {
	return stajaralik2;
}
public void setStajaralik2(java.util.Date stajaralik2) {
	this.stajaralik2 = stajaralik2;
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
public java.util.Date getStajAralik1() {
	return stajAralik1;
}
public void setStajAralik1(java.util.Date stajAralik1) {
	this.stajAralik1 = stajAralik1;
}



}
