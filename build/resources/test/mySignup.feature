Feature: Signup

  Scenario: verify the signup is successfully
    Given la pagina "http://todo.ly" este abierta
    When yo quiero realizar un registro
      | fullName | claudia_21             |
      | email    | claudia_21@hotmail.com |
      | password | 1234                   |

