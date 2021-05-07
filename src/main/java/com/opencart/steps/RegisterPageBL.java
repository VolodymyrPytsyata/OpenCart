package com.opencart.steps;

import com.google.common.util.concurrent.AbstractScheduledService;
import com.opencart.datamodel.RegisterModel;
import com.opencart.pages.RegisterPage;
import com.opencart.pages.SuccessRegisterPage;
import com.opencart.repository.RegisterModelRepository;
import com.opencart.utill.DriverUtils;
import org.testng.Assert;

public class RegisterPageBL {



    private RegisterPage registerPage;
    private SuccessRegisterPage successRegisterPage;


    public RegisterPageBL() {
        registerPage = new RegisterPage();
    }

    public RegisterPageBL registerNewPerson() {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();
       inputFirstName(registerModel.getFirstName());
       inputLastName(registerModel.getLastName());
       inputEmail(registerModel.getEmail());
       inputTelephone(registerModel.getTelephone());
       inputPassword(registerModel.getPassword());

       clickPolicyCheckbox();
       clickOnContinueButton();


        successRegisterPage = new SuccessRegisterPage();
        return this;
    }

    private void inputFirstName(String firstName) {
    registerPage.getFirstNameInput().clear();
    registerPage.getFirstNameInput().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        registerPage.getLastNameInput().clear();
        registerPage.getLastNameInput().sendKeys(lastName);
    }

    private void inputEmail(String email) {
        registerPage.getEmailInput().clear();
        registerPage.getEmailInput().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        registerPage.getTelephoneInput().clear();
        registerPage.getTelephoneInput().sendKeys(telephone);
    }

    private void inputPassword(String password) {
        registerPage.getPasswordInput().clear();
        registerPage.getPasswordInput().sendKeys(password);
        registerPage.getPasswordConfirmationInput().clear();
        registerPage.getPasswordConfirmationInput().sendKeys(password);
    }

    private void clickPolicyCheckbox(){
        new DriverUtils().clickOnElements(registerPage.getPolicy());
    }

    public void clickOnContinueButton() {
        registerPage.getContinueButton().click();
    }
    //далі перевіряємо чи реєстрація збіжна

    public void verifyUserRegistration(){
        String expectedMessage = "Your Account Has Been Created!";
        Assert.assertEquals(successRegisterPage.getSuccessTitle().getText(), expectedMessage, "Incorrect page title");
    }



}
