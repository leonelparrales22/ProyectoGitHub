/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import modelo.Comunes;

/**
 *
 * @author Leonel
 */
@Named(value = "validadores")
@RequestScoped
public class Validadores {

    public Validadores() {
    }

    public void validarCedula(FacesContext context, UIComponent toValidate, Object arg2) {
        context = FacesContext.getCurrentInstance();
        if (((String) arg2).length() == 10) {
        } else {
            ((UIInput) toValidate).setValid(false);
            context.addMessage(toValidate.getClientId(context), new FacesMessage("La cédula debe tener 10 dígitos"));
        }

        if (Comunes.isNumeric(((String) arg2))) {
        } else {
            ((UIInput) toValidate).setValid(false);
            context.addMessage(toValidate.getClientId(context), new FacesMessage("La cédula debe ser un número"));
        }

    }

    public void validarEmail(FacesContext context, UIComponent toValidate, Object arg2) {
        context = FacesContext.getCurrentInstance();

        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        // El email a validar
        String email = ((String) arg2);

        Matcher mather = pattern.matcher(email);

        if (mather.find() == true) {
        } else {
            ((UIInput) toValidate).setValid(false);
            context.addMessage(toValidate.getClientId(context), new FacesMessage("El email ingresado es inválido"));

        }
    }

}
