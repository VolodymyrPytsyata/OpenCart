package com.opencart.steps;

import com.opencart.pages.NavigationBarPage;

import javax.print.attribute.standard.MediaSize;

public class NavigationBarPageBL {


    private NavigationBarPage navigationBarPage;


    public NavigationBarPageBL() {
       navigationBarPage = new NavigationBarPage();
    }


    public NavigationBarPageBL addProductsToTheWishList(){
        clickOnDesktopsButton();
        clickOnMacButton();
        clickOnAddToWishListButton();
        clickOnLaptopsAndNotebooks();
        clickOnShowAllLaptopsAndNotebooksButton();
        clickOnAddToWishListButton1();
        clickOnComponentsButton();
        clickOnMonitorsButton();
        clickOnAddToWishListButton2();
        clickOnAddToWishListButton3();
        clickOnTabletsButton();
        clickOnAddToWishListButton4();
        clickOnPhonesPDAsButton();
        clickOnAddToWishListButton5();
        clickOnCamerasButton();
        clickOnAddToWishListButton6();

        return this;
    }




    public NavigationBarPageBL clickOnDesktopsButton(){
        navigationBarPage.getDesktopsButton().click();
        return this;
    }

    public NavigationBarPageBL clickOnMacButton() {
        navigationBarPage.getMacButton().click();
        return this;
    }

    public NavigationBarPageBL clickOnAddToWishListButton() {
        navigationBarPage.getAddToWishListButton().click();
        return this;
    }


    public NavigationBarPageBL clickOnLaptopsAndNotebooks() {
        navigationBarPage.getLaptopsAndNotebooks().click();
        return this;
    }


    public NavigationBarPageBL clickOnShowAllLaptopsAndNotebooksButton() {
        navigationBarPage.getShowAllLaptopsAndNotebooksButton().click();
        return this;
    }


    public NavigationBarPageBL clickOnAddToWishListButton1() {
        navigationBarPage.getAddToWishListButton1().click();
        return this;
    }




    public NavigationBarPageBL clickOnComponentsButton() {
        navigationBarPage.getComponentsButton().click();
        return this;
    }


    public NavigationBarPageBL clickOnMonitorsButton() {
        navigationBarPage.getMonitorsButton().click();
        return this;
    }


    public NavigationBarPageBL clickOnAddToWishListButton2() {
        navigationBarPage.getAddToWishListButton2().click();
        return this;
    }


    public NavigationBarPageBL clickOnAddToWishListButton3() {
        navigationBarPage.getAddToWishListButton3().click();
        return this;
    }



    public NavigationBarPageBL clickOnTabletsButton() {
        navigationBarPage.getTabletsButton().click();
        return this;
    }


    public NavigationBarPageBL clickOnAddToWishListButton4() {
        navigationBarPage.getAddToWishListButton4().click();
        return this;
    }



    public NavigationBarPageBL clickOnPhonesPDAsButton() {
        navigationBarPage.getPhonesPDAsButton().click();
        return this;
    }



    public NavigationBarPageBL clickOnAddToWishListButton5() {
        navigationBarPage.getAddToWishListButton5().click();
        return this;
    }



    public NavigationBarPageBL clickOnCamerasButton() {
        navigationBarPage.getCamerasButton().click();
        return this;
    }


    public NavigationBarPageBL clickOnAddToWishListButton6() {
        navigationBarPage.getAddToWishListButton6().click();
        return this;
    }



}


