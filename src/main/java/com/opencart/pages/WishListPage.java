package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage {



    @FindBy(xpath = ".//*[@id='content']/div[1]/table/tbody/tr[1]/td[6]/a/i ")
    private WebElement removeButton;

    @FindBy(xpath = ".//*[@id='content']/div[1]/table/tbody/tr[2]/td[6]/a/i")
    private WebElement removeButton1;

    @FindBy(xpath = ".//*[@id='content']/div[1]/table/tbody/tr[3]/td[6]/a/i")
    private WebElement removeButton2;

    @FindBy(xpath = ".//*[@id='content']/div[1]/table/tbody/tr[4]/td[6]/a/i")
    private WebElement removeButton3;

    @FindBy(xpath = ".//*[@id='content']/div[1]/table/tbody/tr[5]/td[6]/a/i")
    private WebElement removeButton4;

    @FindBy(xpath = ".//*[@id='content']/div[1]/table/tbody/tr[6]/td[6]/a/i")
    private WebElement removeButton5;



    @FindBy(xpath = ".//*[@id='content']/div[1]/table/tbody/tr[6]/td[6]/button/i")
    private WebElement addToCartButton;

    @FindBy(xpath = ".//*[@id='content']/div[1]/table/tbody/tr[7]/td[6]/button/i")
    private WebElement addToCartButton1;



    public WebElement getRemoveButton() {
        return removeButton;
    }

    public WebElement getRemoveButton1() {
        return removeButton1;
    }

    public WebElement getRemoveButton2() {
        return removeButton2;
    }

    public WebElement getRemoveButton3() {
        return removeButton3;
    }

    public WebElement getRemoveButton4() {
        return removeButton4;
    }

    public WebElement getRemoveButton5() {
        return removeButton5;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement getAddToCartButton1() {
        return addToCartButton1;
    }
}
