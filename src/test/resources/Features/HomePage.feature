@Home
Feature: Home Page

  Background:
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


  Scenario: 1H Project Templates Page Control
    And Click on Project Templates Nav Bar
    And Project Templates Page appears to be opened

  Scenario: 2H Language Mapping Page Control
    And Language Mapping Hamburger Menu Button Click
    Then The Language Mapping page appears


  Scenario: 3H Vendor Mapping Page Control
    And Vendor Mapping Hamburger Menu Button Click
    Then The Vendor Mapping page appears

  Scenario:4H Extra Custom Fields Configuration Page Control
    And Extra Custom Fields Configuration Menu Button Click
    Then The Extra Custom Fields Configuration page appears

  Scenario: 5H XTRF Projects Page Control
    And XTRF Projects Hamburger Menu Button Click
    Then The XTRF Projects page appears


  Scenario: 6H XTRF Projects Delivery Calendar Page Control
    And XTRF Projects Delivery Calendar Hamburger Menu Button Click
    Then The XTRF Projects Delivery page appears

  Scenario: 7H memoQ Page Control
    And memoQ Hamburger Menu Button Click
    Then The memoQ page appears

  Scenario: 8H Client Preferred Languages Page Control
    And Client Preferred Languages Hamburger Menu Button Click
    Then The Client Preferred Languages page appears

  Scenario: 9H Integrations Page Control
    And Integrations Hamburger Menu Button Click
    Then The Integrations page appears

  Scenario: 10H Users Page Control
    And Users Hamburger Menu Button Click
    Then The Users page appears

  Scenario: 11H Stats Page Control
    And Stats Hamburger Menu Button Click
    Then The Stats page appears


  Scenario: 12H Logs Page Control
    And Logs Hamburger Menu Button Click
    Then The Logs page appears






