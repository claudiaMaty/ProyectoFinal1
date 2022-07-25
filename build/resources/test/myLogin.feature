Feature: Login

  Scenario: verify the login is successfully

    Given la pagina "http://todo.ly/" este abierta
    When yo quiero realizar un login
      | email    | claudia1@hotmail.com |
      | password | 123                  |
    Then yo deberia ingresar a la app web