package com.kayak.page;

import com.kayak.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kayak_Offer_Page {

    public Kayak_Offer_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='Hv20-title'])[1]//span")
    public WebElement cheapest;

    @FindBy(xpath = "(//div[@class='f8F1-price-text'])[1]")
    public WebElement cheapestTicket;






}
