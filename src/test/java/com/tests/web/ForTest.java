package com.tests.web;

import com.tests.base.WebTestSetup;
import com.tests.tags.testtype.WebTest;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;


class ForTest extends WebTestSetup {

  @WebTest
  void test1() {
    $(byName("username")).shouldBe(visible)
            .setValue("Admin");
    $(byAttribute("placeholder", "Password")).shouldBe(visible)
            .setValue("admin123");
    $("[type='submit']").shouldBe(enabled)
            .click();
  }

  @WebTest
  void test2() {
    $(byName("username")).shouldBe(visible)
            .setValue("Admin");
    $(byAttribute("placeholder", "Password")).shouldBe(visible)
            .setValue("admin123");
    $("[type='submit']").shouldBe(enabled)
            .click();
  }

  @WebTest
  void test3() {
    $(byName("username")).shouldBe(visible)
            .setValue("Admin");
    $(byAttribute("placeholder", "Password")).shouldBe(visible)
            .setValue("admin123");
    $("[type='submit']").shouldBe(enabled)
            .click();
  }
  @WebTest
  void test4() {
    $(byName("username")).shouldBe(visible)
            .setValue("Admin");
    $(byAttribute("placeholder", "Password")).shouldBe(visible)
            .setValue("admin123");
    $("[type='submit']").shouldBe(enabled)
            .click();
  }
}
