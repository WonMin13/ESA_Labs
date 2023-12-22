# Лабораторная работа №2 по курсу "Архитектура Корпоративных Систем": "Application using Spring Framework"

# Отличия от предыдущей лабораторной работы
Внешне практически никаких.
Однако была изменена внутренность программы, а точнее то, на чем она была написана:
Если в первой работе были сервлеты, ejb и jsp, то в этой используется spring framework.

# Средства, которые использовались для разработки приложения
- JDK 16.0.2
- Spring Framework 5.3.9
- Tomcat 8.5.60
- PostgreSQL 13.3
- Intellij IDEA Ultimate 2022.2.4

# Задание на лабораторную работу

|               General Task             |
|------------------------------------------------------------------|
|   You are to develop an application using common Spring architecture and technologies. It should have three layers (data, logic, view) and provide means to work with a database. It is strongly recommended to use version control and source code management system (like GitHub). It is strongly recommended to use Maven to manage your project. You can choose any IDE, but IntelliJ IDEA is recommended.  |

|        Task 1         |          Task 2        |        Task 3        |          Task 4        |            Task 5         |
|-----------------------|:----------------------:|:--------------------:|:----------------------:|--------------------------:|
|          Choose any subject area and make a model with at least two entities with a few properties. Create a script to make a database for your model. Yes, you can use the same models and scripts you used before.             |           Develop data layer as Java Beans for the model and make them prepared for use with Hibernate. Create additional Hibernate classes and configuration files, as required.             |          Implement business layer using Spring beans.            |            Implement view layer using Spring MVC.            |             Make everything work together…              |

# Модель и бизнес логика
- Spring Data JPA
- Spring MVC

В качетсве модели использовалась модель из предыдущей лабораторной работы: "Арми - Альбом", участниками данной модели и являются сущностями.

## Схема базы данных "store", представлена на рисунке ниже.
![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/dc9eac5a-8cdb-4bf8-a324-66370d42be7f)

## Для работы с базой данных использовались следующие скрипты:
- [create_data.sql](https://github.com/WonMin13/ESA_Labs/blob/main/LR2_Dubman_Application%20using%20Spring%20Framework/labwork2final/sql_script/create_data.sql) - создание таблиц
- [insert_data.sql](https://github.com/WonMin13/ESA_Labs/blob/main/LR2_Dubman_Application%20using%20Spring%20Framework/labwork2final/sql_script/insert_data.sql) - заполнение таблиц
- [delete_data.sql](https://github.com/WonMin13/ESA_Labs/blob/main/LR2_Dubman_Application%20using%20Spring%20Framework/labwork2final/sql_script/delete_data.sql) - удаление данных из таблицы


# Представление данных
- Thymeleaf
- Bootstrap


## Army

|              Armys before create                |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/2df4e48b-4dac-4cd1-903a-aa90ef2dbaf3) |


|                   Create Army                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/10a01f3c-f0a5-44dd-8cc8-41fcab1f4be9) |


|               Armys after create                |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/5c1f5e67-5768-4265-8e7e-66b5273f5c57) |


|             Update Group(Army)                  |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/f722eedc-5131-47b8-8b36-66b9dff693d9) |


|              Armys after update                 |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/c4c9fd42-187a-43e8-82c1-0bbd920edc0c) |




## Album

|              Albums before create               |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/166a38f5-1af9-43ac-a9ef-7006e71b54d8) |


|   Albums Army (group) before create  a new one  |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/6a97582d-2703-4cb0-8554-8fde453181c4) |


|                  Create Album                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/a50d4a9f-7c65-404c-bb3a-98b491f31aa1) |


|              Albums after create                |           
|:-----------------------------------------------:|
|  ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/5fb9dbc5-0ea7-49c5-ac31-5262d917d8f2) |


|   Albums Army (group) after create  a new one  |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/f7b42347-8e2f-4724-8408-6a5ca4c5b791) |


|                  Update Album                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/33785d43-fc98-41c5-8959-a50201a5fb9c) |


|              Albums after update                |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/553ac76f-8e18-44e9-9734-cfd890c8c643) |

