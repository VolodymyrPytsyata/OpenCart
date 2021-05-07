package com.opencart.steps;

import com.opencart.pages.WishListPage;


public class WishListPageBL {

    private WishListPage wishListPage;


    public WishListPageBL() {
        wishListPage = new WishListPage();
    }


    public WishListPageBL removeAndAddToCart() {
        clickOnRemoveButton();
        clickOnRemoveButton1();
        clickOnRemoveButton2();
        clickOnRemoveButton3();
        clickOnRemoveButton4();
        clickOnRemoveButton5();
        clickOnAddToCartButton();
        clickOnAddToCartButton1();

        return this;
    }

    private void clickOnRemoveButton() {
        wishListPage.getRemoveButton().click();
    }

    private void clickOnRemoveButton1() {
        wishListPage.getRemoveButton1().click();
    }

    private void clickOnRemoveButton2() {
        wishListPage.getRemoveButton2().click();
    }

    private void clickOnRemoveButton3() {
        wishListPage.getRemoveButton3().click();
    }

    private void clickOnRemoveButton4() {
        wishListPage.getRemoveButton4().click();
    }

    private void clickOnRemoveButton5() {
        wishListPage.getRemoveButton5().click();
    }

    private void clickOnAddToCartButton() {
        wishListPage.getAddToCartButton().click();
    }

    private void clickOnAddToCartButton1() {
        wishListPage.getAddToCartButton1().click();
    }



}
