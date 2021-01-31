@datadriven
Feature: Data Driven Demo

  Scenario Outline: Scenario One
    Given This is first step "<Emp Id>".
    When This is second step "<Name>".
    Then This is third step "<Dept>".
    And This is fourth step "<Semester>".

    Examples: 
      | Emp Id | Name    | Dept  | Semester |
      |    101 | Akash   | CSE   | First    |
      |    102 | Vikash  | IT    | Second   |
      |    103 | Ankur   | EE    | Third    |
      |    104 | Koyal   | CSE   | Fourth   |
      |    105 | Kovvuru | Civil | Fifth    |
      |    106 | Adam    | EEE   | Sixth    |
      |    107 | Eve     | AIE   | Seventh  |
