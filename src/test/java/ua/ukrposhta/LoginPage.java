package ua.ukrposhta;


import org.junit.Test;

import java.util.Set;


public class LoginPage {
    Setup page = new Setup();
    @Test
        public void OpenMainPageTest(){
        page.OpenMainPage();
        page.driver.findElementByXPath("//a[@class='zh-login']").click();
        }


}
