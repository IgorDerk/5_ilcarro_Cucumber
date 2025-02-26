Feature: Добавление

  Background: Открываем браузер и переходим на домашнюю страницу
    Given Пользователь запускает браузер
    When Пользователь открывает домашнюю страницу ilcarro
    And Пользователь нажимает на ссылку Login
    And Пользователь вводит валидные данные
    And Пользователь нажимает на кнопку Yalla


  @add_car
  Scenario Outline:: Добавление автомобиля
    And Пользователь нажимает на кнопку Ok
    Given Пользователь переходит на страницу Let the car work
    When Пользователь заполняет валидные данные автомобиля
      | Поле          | Значение        |
      | Location      | <location>      |
      | Manufacture   | <manufacture>   |
      | Model         | <model>         |
      | Year          | <year>          |
      | Fuel          | <fuel>          |
      | Seats         | <seats>         |
      | Car Class     | <car_class>     |
      | Price         | <price>         |
      | Serial Number | <serial_number> |
      | About         | <about>         |
    Examples:
      | location      | manufacture | model   | year | fuel   | seats | car_class | price | serial_number | about     |
      | Haifa, Israel | Toyota      | Corolla | 2020 | Petrol | 5     | Sedan     | 50    | 123456789     | Test car  |

#    And Пользователь загружает изображение автомобиля
#    And Пользователь нажимает на кнопку Submit
#    Then Пользователь видит сообщение "Car added"
#    And Пользователь закрывает браузер

