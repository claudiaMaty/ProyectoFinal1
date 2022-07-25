Feature: ChangePass
  @ChangePass
  Scenario: verify the Change Password is successfully

    Given la pagina "http://todo.ly" este abierta

    And yo quiero realizar el login
      | email    | claudia1@hotmail.com  |
      | password | 123                |
    When yo cambio mi pass antiguo por uno nuevo
      | oldPwd | 123 |
      | newPwd | 1234 |
    And salgo de la App Web
    Then yo deberia realizar el login con el pass nuevo
      | email    | claudia1@hotmail.com |
      | password | 1234              |