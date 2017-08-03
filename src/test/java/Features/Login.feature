Feature: LoginFeature
  Successfully login to the page

  Scenario: Login with correct username and password
    Given I naviate to login page
    And See how ccucmber-java8 looks like
    When I enter the following value for Login
      | username   | password           |
      | admin      | adminpassword      |
#      | admin_DT_2 | adminpassword_DT_2 |
    And I click login button
    Then I should see the userform page


#  Scenario Outline: Login with correct username and password using scenario outline
#    Given I naviate to login page
#    When I enter <username> nad <password>
#    And I click login button
#    Then I should see the userform page
#
#    Examples:
#      | username | password        |
#      | admin_1  | adminpassword_1 |
#      | admin_2  | adminpassword_2 |
#      | admin_3  | adminpassword_3 |



