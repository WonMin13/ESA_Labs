# Лабораторная работа №1 по курсу "Архитектура Корпоративных Систем": "Application with common JavaEE architecture"

# Средства, которые использовались для разработки приложения
- JDK 16.0.2
- Jakarta EE 9.1
- GlassFish 6.2.1
- PostgreSQL 13.3
- Intellij IDEA Ultimate 2022.2.4

# Задание на лабораторную работу

|               General Task             |
|------------------------------------------------------------------|
|   You are to develop an application using common JavaEE architecture and technologies. It should have three layers (data, logic, view) and provide means to work with a database. It is strongly recommended to use version control and source code management system (like GitHub). It is strongly recommended to use Maven to manage your project. You can choose any IDE, but IntelliJ IDEA is recommended. You may not use IDE to deploy your project to an application server. All deployment should be made using administrative console.  |

| Task 1 |   Task 2  |  Task 3 |  Task 4  |  Task 5 |  Task 6 |  Task 7 |
|--------|:---------:|:-------:|:--------:|:-------:|:-------:|--------:|
|    Download GlassFish application server. Install it by unpacking the archive. Start the application server. Open an administrative console and go through its controls.    |     If you have no DBMS installed, please install one. You can choose any SQL DBMS you like, but PostgreSQL and MySQL are preferred.      |     Choose any subject area and make a model with at least two entities with a few properties. Create a script to make a database for your model.    |     Develop data layer as Java Beans for the model and make them prepared for use with Entity Persistence.     |    Implement business layer for accessing data using session beans.     |     Implement view layer using any technology of your choice, which is applicable here.    |     Make everything work together...    |

# Модель и бизнес логика
- Servlets
- EJB
- Hibernate

В качетсве модели была выбрана модель "Арми - Альбом", участниками данной модели и являются сущностями.

## Схема базы данных "store", представлена на рисунке ниже.
![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/dc9eac5a-8cdb-4bf8-a324-66370d42be7f)

## Для работы с базой данных использовались следующие скрипты:
- [create_data.sql](https://github.com/WonMin13/ESA_Labs/blob/main/LR1_Dubman_Application%20with%20common%20JavaEE%20architecture/labworkfinal1/sql_scripts/create_data.sql) - создание таблиц
- [insert_data.sql](https://github.com/WonMin13/ESA_Labs/blob/main/LR1_Dubman_Application%20with%20common%20JavaEE%20architecture/labworkfinal1/sql_scripts/insert_data.sql) - заполнение таблиц
- [delete_data.sql](https://github.com/WonMin13/ESA_Labs/blob/main/LR1_Dubman_Application%20with%20common%20JavaEE%20architecture/labworkfinal1/sql_scripts/delete_data.sql) - удаление данных из таблицы


# Представление данных
- JSP
- Bootstrap


## Army

|              Armys before create                |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/37d6cdfa-ed64-4ea8-9bc2-c82967594af0) |


|                   Create Army                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/015649d7-a978-44bf-aa4f-ef05ebfdbdf6) |


|               Armys after create                |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/7dec4033-b2c3-4f5c-a674-9c3b2aab1456) |


|                   Update Army                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/0684a43e-93d2-4800-aaf2-0b18e0a18660) |


|              Armys after update                 |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/a7e3193d-e712-4c2e-a9c5-c45c8b1f8bc9) |





## Album

|              Albums before create               |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/cf4b14a2-da2d-440e-aab5-6bfd169d0d4d) |


|                  Create Album                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/9c6d7a0e-ad8f-4dc3-be8e-2598eb7ff3c9) |


|              Albums after create                |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/bf2aaf3c-3eac-4a5e-823f-e5f300fb7ebb) |


|                  Update Album                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/8ba12d0a-16ba-4d5f-bf35-898793118409) |


|              Albums after update                |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/2114228b-ab95-4d16-8280-d29cd5bbb0e8) |
