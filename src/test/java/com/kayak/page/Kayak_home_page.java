package com.kayak.page;

import com.kayak.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kayak_home_page {

    public Kayak_home_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='From?']")
    public WebElement from;

    @FindBy(xpath = "//input[@placeholder='To?']")
    public WebElement to;


    @FindBy(xpath = "(//span[@tabindex='0'])[1]")
    public WebElement departDate;

    @FindBy(xpath = "(//span[@tabindex='0'])[2]")
    public WebElement arriveDate;


    @FindBy(xpath = "(//button[@role='button'])[4]")
    public WebElement searchButton;


    @FindBy(xpath = "//div[@data-month='2023-05']//div[.='16']")
    public WebElement may;

    @FindBy(xpath = "(//div[@data-month='2023-06']//div[.='21'])[1]")
    public WebElement june;

    //button[@aria-label='Previous month']
    @FindBy(xpath = "//button[@aria-label='Previous month']")
    public WebElement previousMonth;

    //a[@class='close']
    @FindBy(xpath = "//a[@class='close']")
    public WebElement popUp;

    //iframe[@title='Usabilla Feedback Form Frame']
    @FindBy(xpath = "  //iframe[@title='Usabilla Feedback Form Frame']")
    public WebElement iframe;

}
