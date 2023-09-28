Feature: Project Templates

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
    And Click on Project Templates Nav Bar
    And Project Templates Page appears to be opened

  Scenario: 1PR Checking Filtering On Created By On Project Template Page
    And An existing name is entered in the Create By section
    And The resulting name is filtered
    Then It is seen that the filter is made by name

  Scenario: 2PR Checking Filtering By Visibility Project Template Page
    And Click on the Visibility Area
    And Private Selection is made
    Then It is seen that filtering is done by Private


  Scenario: 3PR Checking Sorting By Description On Project Template Page
    And Click on the Description Field
    And It is Seen that Sorting is Made According to Descriptions

  Scenario: 4PR Checking Sorting By Name On Project Template Page
    And Click on the Name Field
    And It is Seen that Sorting is Made According to Name



  Scenario: 5PR Checking Sorting By Update On Project Template Page
    And Click on the Update Field
    And It is Seen that Sorting is Made According to Update