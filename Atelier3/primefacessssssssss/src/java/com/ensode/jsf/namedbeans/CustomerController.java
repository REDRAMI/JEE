package com.ensode.jsf.namedbeans;
import java.awt.event.ActionEvent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
@RequestScoped
@Named
@ManagedBean(name="customerController")
public class CustomerController {
 public CustomerController() {
 }

    /**
     *
     * @param actionEvent
     * @return 
     */
    public void saveCustomer() {
 FacesMessage facesMessage = new FacesMessage("Data Saved Successfully");
 facesMessage.setSeverity(FacesMessage.SEVERITY_INFO);
 FacesContext.getCurrentInstance().addMessage(null,facesMessage);
 }


}
