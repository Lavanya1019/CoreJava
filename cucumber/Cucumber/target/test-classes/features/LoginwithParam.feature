Feature: Login into simplilearn website

  @Regression
  Scenario Outline: Positive scenario to test login functionality
    Given User has opened amazon website on Chrome Browser
    When User enters correct "<username>" and "<password>"
    Then User should be able to login successfully

    Examples: 
      | username    | password |
      | abc@xyz.com | abc123   |
      | pqr@abc.com | asb123   |

  @Sanity
  Scenario Outline: Positive scenario to test login functionality
    Given User has opened amazon website on Chrome Browser
    When User enters correct "<username>" and "<password>"
    Then User should be able to login successfully

    Examples: 
      | username    | password |
      | abc@xyz.com | abc123   |

  @Regression
  Scenario Outline: Positive scenario to test login functionality
    Given User has opened amazon website on Chrome Browser
    When User enters correct "<username>" and "<password>"
    Then User should be able to login successfully

    Examples: 
      | username    | password |
      | pqr@xyz.com | s12323   |
