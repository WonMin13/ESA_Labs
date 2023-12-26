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


|                   Update Army                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/e9eb3182-ce0e-429e-b2a8-e050940805a1) |


|              Armys after update                 |
|:-----------------------------------------------:|
|  ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/22816aa7-faa4-4670-977a-16fe81d1cc67) |




## Album

|              Albums before create               |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/54995396-b1aa-460b-951f-0b29470fba81) |


|       Albums Army before create  a new one      |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/ac31932f-eabb-49ca-aec2-fffd3b4da159) |


|                  Create Album                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/82443b7f-14a4-45bb-bae0-acc8c1e7c003) |


|              Albums after create                |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/ea83646c-c0c6-40ec-9041-487d724bbb8b) |


|                  Update Album                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/90285e0c-f4f3-4696-85a7-56930310c3c9) |


|              Albums after update                |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/594a6345-4c32-443c-ab97-1884817f291f) |


|        Albums Army after create  a new one      |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/08ebc1f2-6a7b-4264-82c5-2e3783ce6f91) |


# XSLT

|                      Armys                      |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/27d0fd5d-0ca7-4f60-b70d-6b5454c6680c) 
![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/2cc79483-4bd2-49d2-889c-b6f9f1de6026) |


|                     Albums                      |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/9871283e-38ea-4696-9104-7befffdad312) |




