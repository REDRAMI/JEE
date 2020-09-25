package com.ensode.jsf.namedbeans;
import javax.faces.bean.ManagedBean;
import java.text.SimpleDateFormat;
import java.util.Date;
@ManagedBean(name="customer")
public class Customer {
 public Customer() {
 }
 private String firstName;
 private String middleName;
 private String lastName;
 private Date birthDate;
  private String addrLine1;
   private String addrLine2;
    private String addrCity;
    private String addrZip;
     private String homePhone;
        private String addrState;
    public String getAddrLine1() {
        return addrLine1;
    }

    public String getAddrState() {
        return addrState;
    }

    public void setAddrState(String addrState) {
        this.addrState = addrState;
    }

    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    public String getAddrLine2() {
        return addrLine2;
    }

    public void setAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
    }

    public String getAddrCity() {
        return addrCity;
    }

    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity;
    }

    public String getAddrZip() {
        return addrZip;
    }

    public void setAddrZip(String addrZip) {
        this.addrZip = addrZip;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }
      private String mobilePhone;
      private String workPhone;
      
 private SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
     public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
     public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
     public SimpleDateFormat getSdf() {
        return sdf;
    }
    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    
}
