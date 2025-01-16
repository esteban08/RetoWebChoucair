Feature: Register user page

    @SmokeTest
    Scenario: Open Page
       Given The user enter page orange
       When The user enter data to page
       And The user search with name create
       Then The user see that to search on page orange (1) Record Found
