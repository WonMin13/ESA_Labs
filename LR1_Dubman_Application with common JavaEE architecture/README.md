------------------------------------------------------------------|
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
- [create_data.sql](https://github.com/WonMin13/ESA/blob/main/LR1_Dubman_Application%20with%20common%20JavaEE%20architecture/labworkfinal1/sql_scripts/create_data.sql) - создание таблиц
- [insert_data.sql](https://github.com/WonMin13/ESA/blob/main/LR1_Dubman_Application%20with%20common%20JavaEE%20architecture/labworkfinal1/sql_scripts/insert_data.sql) - заполнение таблиц
- [delete_data.sql](https://github.com/WonMin13/ESA/blob/main/LR1_Dubman_Application%20with%20common%20JavaEE%20architecture/labworkfinal1/sql_scripts/delete_data.sql) - удаление данных из таблицы


# Представление данных
- JSP
- Bootstrap


## Army

|              Armys before create                |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA/assets/154375695/2afa5a6b-485a-4343-a1ab-12fb84092fb2) |


|                   Create Army                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA/assets/154375695/a324dda9-84d9-4f77-a895-c5160b4b3aa4) |


|               Armys after create                |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA/assets/154375695/115b369b-876d-4faf-a595-b5d07e9e5641) |


|                   Update Army                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA/assets/154375695/13302527-2697-4742-a955-73884537ed5c) |


|              Armys after update                 |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA/assets/154375695/1555a988-1195-4f03-b119-7bc682546753) |





## Album

|              Albums before create               |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA/assets/154375695/625bfe15-f646-4c05-b861-e9bef3664617) |


|                  Create Album                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA/assets/154375695/39a6fa0d-3b7b-466e-a980-497e4477b166) |


|              Albums after create                |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA/assets/154375695/b18ba5d3-773f-421f-89a5-1fe549ba95dd) |


|                  Update Album                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA/assets/154375695/0bebece1-07e6-4734-ba15-512a89bdfbc0) |


|              Albums after update                |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA/assets/154375695/1e4af233-557c-4512-ab2d-c365767f4f64) |
