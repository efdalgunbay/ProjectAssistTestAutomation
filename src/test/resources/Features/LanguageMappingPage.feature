Feature: Language Mapping Page

  Background:

    Scenario: 1LM Language Mapping Page Control
      And Language Mapping Hamburger Menu Button Click
      Then The Language Mapping page appears

    Scenario: 2LM Checking Filter By Type All On Language Mapping Page
    And Filter sentence All is entered in the filter field
    And Filter Clicked
    Then It is seen that a filter has been made


  Scenario: 3LM Checking Filter By Type Client Exceptions On Language Mapping Page
    And Filter sentence Client Exceptions is entered in the filter field
    And Filter Clicked
    Then It is seen that a filter has been made

    Scenario: 4LM Checking Sorting By Tool Language To On Language Mapping Page
      And Language Mapping Hamburger Menu Button Click
      And Click on the Tool Button
      Then It is seen that the sorting is done according to the tool