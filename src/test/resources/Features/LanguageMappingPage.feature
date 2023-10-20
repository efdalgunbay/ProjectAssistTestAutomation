@Reg
Feature: Language Mapping Page

  Background:
    And Language Mapping Hamburger Menu Button Click

  Scenario: 1LM Language Mapping Page Control
    Then The Language Mapping page appears

  Scenario: 2LM Checking Filter By Type All On Language Mapping Page
    And Filter sentence All is entered in the filter field
    And Filter All Clicked
    Then It is seen that a filter All has been made


  Scenario: 3LM Checking Filter By Type Client Exceptions On Language Mapping Page
    And Filter sentence Client Exceptions is entered in the filter field
    And Filter Client Exceptions Clicked
    Then It is seen that a filter Client Exceptions has been made


  Scenario: 4LM Checking Sorting By Tool Language To On Language Mapping Page
    And Click on the Tool Language Button
    Then It is seen that the sorting is done according to the tool language


  Scenario: 5LM Checking Sorting By XTRF Client On Language Mapping Page
    And Click on the XTRF Client Button
    Then It is seen that the sorting is done according to the XTRF Client language

  Scenario: 6LM Checking Sorting By Tool On Language Mapping Page
    And Click on the Tool Button
    Then It is seen that the sorting is done according to the Tool language

  Scenario: 7LM Checking Filter By XTRF Client Field On Language Mapping Page
    And Keyword is entered in the XTRF Client filter field
    And It is seen that XTRF Client is filtered according to the entered keyword

  Scenario: 8LM Checking Filter By XTRF Client Field Clear On Language Mapping Page
    And Keyword is entered in the XTRF Client filter field
    Then It is seen that XTRF Client is filtered according to the entered keyword
    And Click on the Cross Button that appears next to the XTRF Client Filter Field
    Then XTRF Client Filter Area is Seen as Cleaned

  Scenario: 9LM Checking Filter By XTRF Language Field On Language Mapping Page
    And Keyword is entered in the XTRF Language filter field
    And It is seen that XTRF Language is filtered according to the entered keyword

  Scenario: 10LM Checking Filter By XTRF Language Field Clear On Language Mapping Page
    And Keyword is entered in the XTRF Language filter field
    Then It is seen that XTRF Language is filtered according to the entered keyword
    And Click on the Cross Button that appears next to the XTRF Language Filter Field
    Then XTRF Language Filter Area is Seen as Cleaned

  Scenario: 11LM Checking Filter By Tool Field On Language Mapping Page
    And Keyword is entered in the Tool filter field
    And It is seen that Tool is filtered according to the entered keyword

  Scenario: 12LM Checking Filter By Tool Field Clear On Language Mapping Page
    And Keyword is entered in the Tool filter field
    Then It is seen that Tool is filtered according to the entered keyword
    And Click on the Cross Button that appears next to the Tool Filter Field
    Then Tool Filter Area is Seen as Cleaned

  Scenario: 13LM Checking Filter By XTRF Language Field On Language Mapping Page
    And Keyword is entered in the Tool Language filter field
    And It is seen that Tool Language is filtered according to the entered keyword

  Scenario: 14LM Checking Filter By Tool Language Field Clear On Language Mapping Page
    And Keyword is entered in the Tool Language filter field
    Then It is seen that Tool Language is filtered according to the entered keyword
    And Click on the Cross Button that appears next to the Tool Language Filter Field
    Then Tool Language Filter Area is Seen as Cleaned