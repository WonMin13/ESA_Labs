# Лабораторная работа №3 по курсу "Архитектура Корпоративных Систем": "RESTful web-service"

# Отличия от предыдущей лабораторной работы
Данная лабораторная работа написана на основе предыдущей: [labwork2final](https://github.com/WonMin13/ESA_Labs/tree/main/LR2_Dubman_Application%20using%20Spring%20Framework).

внешнее: добавление возможности выбора представления данных

внутреннее: добаление REST API для доступа к данным


# Средства, которые использовались для разработки приложения
- JDK 16.0.2
- Spring Framework 5.3.9
- Tomcat 8.5.60
- PostgreSQL 13.3
- Intellij IDEA Ultimate 2022.2.4

# Задание на лабораторную работу

|               General Task             |
|------------------------------------------------------------------|
|  You are to develop an application with REST web-service interface. Application should provide access to data within a database. It is strongly recommended to use version control and source code management system (like GitHub). It is strongly recommended to use Maven to manage your project. You can choose any IDE, but IntelliJ IDEA is recommended.   |

|        Task 1         |          Task 2        |        Task 3        |          Task 4        |            Task 5         |              Task 6           |
|-----------------------|:----------------------:|:--------------------:|:----------------------:|--------------------------:|:------------------------------|
|          Compare JAX-RS and SpringREST. Choose one of them for your application. Give some arguments for your choice.             |           Choose one of your previous applications for further development. Develop a REST API for accessing your data.             |          Implement the API. It should allow usage of both XML and JSON.            |            Develop an XSL transformation for your XML objects to make a browser able to show them as HTML pages (including object data and navigation to other entities and their lists).            |             Add the XSLT to all XML responses.              |               Make everything work together…                |

# Модель и бизнес логика
- Spring Data JPA
- Spring MVC
- REST API

В качетсве модели использовалась модель из предыдущей лабораторной работы: "Арми - Альбом", участниками данной модели и являются сущностями.

## Схема базы данных "store", представлена на рисунке ниже.
![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/dc9eac5a-8cdb-4bf8-a324-66370d42be7f)

## Для работы с базой данных использовались следующие скрипты:
- [create_data.sql](https://github.com/WonMin13/ESA_Labs/blob/main/LR3_Dubman__RESTful%20web-service/labworkfinal3/sql_scripts/create_data.sql) - создание таблиц
- [insert_data.sql](https://github.com/WonMin13/ESA_Labs/blob/main/LR3_Dubman__RESTful%20web-service/labworkfinal3/sql_scripts/insert_data.sql) - заполнение таблиц
- [delete_data.sql](https://github.com/WonMin13/ESA_Labs/blob/main/LR3_Dubman__RESTful%20web-service/labworkfinal3/sql_scripts/delete_data.sql) - удаление данных из таблицы


# Представление данных
- Thymeleaf
- XSLT


# Thymeleaf

## Army

|              Armys before create                |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/e7537c60-8bda-4bf6-ab10-0d25de02e283) |


|                   Create Army                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/db50c4b0-04f6-431d-8c97-381119ce7929) |


|               Armys after create                |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/285b8ce9-6b39-46a8-af8d-d17098b9bbb6) |


|             Update Group(Army)                  |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/e9eb3182-ce0e-429e-b2a8-e050940805a1) |


|              Armys after update                 |
|:-----------------------------------------------:|
|  ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/22816aa7-faa4-4670-977a-16fe81d1cc67) |




## Album

|              Albums before create               |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/54995396-b1aa-460b-951f-0b29470fba81) |


|   Albums Army (group) before create  a new one  |           
|:-----------------------------------------------:|
|  |


|                  Create Album                   |
|:-----------------------------------------------:|
|  |


|              Albums after create                |           
|:-----------------------------------------------:|
|   |


|   Albums Army (group) after create  a new one  |           
|:-----------------------------------------------:|
| |


# XSLT

|                      Armys                      |           
|:-----------------------------------------------:|
|  |


|                     Albums                      |           
|:-----------------------------------------------:|
|  |




