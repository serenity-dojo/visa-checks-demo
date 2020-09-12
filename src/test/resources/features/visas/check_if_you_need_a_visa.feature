#noinspection NonAsciiCharacters
Feature: Check if you need a visa to travel to the UK

  In order to comply with UK law, as a traveller to the UK, I want to know whether I need to apply for a visa.

  Travellers may need to apply for a visa based on different criteria, including their nationality and the reason for their visit

  Scenario: Travellers with an Irish Passport do not need a visa
    Given Sean wants to travel to the UK
    When Sean has a passport from Ireland
    Then he should be told "You do not need a visa to come to the UK"

  Scenario: Travellers from Japan do not need a visa for tourism
    Given Sara wants to travel to the UK
    And she has a passport from Japan
    When Sara wants to come to the UK for Tourism
    Then she should be told "You won’t need a visa to come to the UK"

  Scenario Outline: Travellers from Japan need a visa to study for longer than six months
    Given Sara wants to travel to the UK
    And Sara has a passport from Japan
    When Sara wants to come to the UK to Study for <Duration>
    Then she should be told "<Outcome>"
    Examples:
      | Duration             | Outcome                                  |
      | 6 months or less     | You do not need a visa to come to the UK |
      | longer than 6 months | You’ll need a visa to study in the UK    |

    Scenario: Normal travellers from Russia always need a visa
      Given Vlad wants to travel to the UK
      And Vlad has a passport from Russia
      When Vlad is coming to the UK for Tourism
      And Vlad is not travelling with or visiting a partner in the UK
      Then he should be told "You’ll need a visa to come to the UK"
