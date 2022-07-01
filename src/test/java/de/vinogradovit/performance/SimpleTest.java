package de.vinogradovit.performance;

import com.codeborne.selenide.*;
import io.cloudbeat.junit.CbJunitExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

@ExtendWith(CbJunitExtension.class)
public class SimpleTest {

  @Test
  void findSelenideOnGithub() throws MalformedURLException {
    //var driver=CbJunitExtension.createWebDriver();

    //WebDriverRunner.setWebDriver(driver);
    CbJunitExtension.step("Open Github home page", ()-> {
      open("https://github.com");
    });
    CbJunitExtension.step("Validate page content", ()-> {
      $("abc").shouldBe(visible);
    });
  }

  @Test
  void workingTest() throws MalformedURLException {
    CbJunitExtension.step("Open Github home page", ()-> {
      open("https://github.com");
    });
    CbJunitExtension.step("Validate page content", ()-> {
      $("div").shouldBe(visible);
    });
  }

  @Test
  void theSimplestTest(){
    System.out.println("Hello CloudBeat");
    Assertions.assertTrue(true);
  }
}
