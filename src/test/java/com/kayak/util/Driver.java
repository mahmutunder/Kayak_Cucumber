package com.kayak.util;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){// this is for singleton

    }

    private static InheritableThreadLocal <WebDriver> driverPool=new InheritableThreadLocal<>();

    public static WebDriver getDriver(){
        if(driverPool.get() == null){
           String browser= ConfigurationReader.getProperties("browser");
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    break;
            }
            driverPool.get().manage().window().maximize();
            driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        return driverPool.get();
    }

    public void tearDown(){
        if(driverPool.get()!=null){
            driverPool.get().close();
        driverPool.remove();
        }
    }





}
