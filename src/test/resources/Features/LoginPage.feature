@Reg
Feature: Login Page

  Background:

    Scenario: 1L Possitive Login
      And Gmail Button Click
      And new tab is passed
      And Username field is filled
      And forward Button Click
      And Password field is filled
      And Click the Sign In Button
      And Click the Email No In Button
      And new tab is passed two
      And Gmail Button Click
      Then The Home page appears

