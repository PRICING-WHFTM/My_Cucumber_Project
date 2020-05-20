Feature: Finding links on the page

  Background:
    Given I am in lentaz homepage

  Scenario: Find all links in the page
    Then I should see all links in the entire page

  Scenario: Find all links in the bolmeler area
    Then I should see 12 links there
    And Following links should exist there
      | Hadisə       |
      | Sosial       |
      | İqtisadiyyat |
      | Dünya        |
      | Maqazin      |
      | İdman        |
      | Yazarlar     |
      | Siyasət      |
      | Mədəniyyət   |
      | Life         |
      | Haqqımızda   |
      | Əlaqə        |