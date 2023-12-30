# Лабораторная работа №4 по курсу "Архитектура Корпоративных Систем": "Java Message Service"

Данная лабораторная работа является продолжением [лабораторной работы №3](https://github.com/WonMin13/ESA_Labs/tree/main/LR3_Dubman__RESTful%20web-service).

Однако в данной работе реализация проведена с помощью Spring Boot вместо Spring Framework, а также имеет механизм регистрации и «watchdog» для определенного типа изменений.

# Средства, которые использовались для разработки приложения
- JDK 16.0.2
- Spring Boot 5.3.9
- PostgreSQL 13.3
- Intellij IDEA Ultimate 2022.2.4

# Задание на лабораторную работу

|               General Task             |
|------------------------------------------------------------------|
|  You are to add some new functionality to the previous application, namely a logging mechanism and a “watchdog” for a specific kind of changes. Logging should provide a simple mechanism to put information on changes in your system into a special table of the database. “Watchdog” should send e-mail notifications on specific changes in the system to some specified e-mail addresses. It is strongly recommended to use version control and source code management system (like GitHub). It is strongly recommended to use Maven to manage your project. You can choose any IDE, but IntelliJ IDEA is recommended.
  |
  
|        Task 1        |       Task 2        |       Task 3        |         Task 4         |        Task 5        |          Task 6        |         Task 7       |
|----------------------|:-------------------:|:-------------------:|:----------------------:|:--------------------:|:----------------------:|---------------------:|
|           Add new table to your database. Each row should represent a change of information in other tables of your database. A row should contain information on a kind of a change (insert, update, etc.), on a changing entity (e.g. its class, id) and on a substance of a change (e.g. new values for fields).           |      Create and configure JMS administrative objects in your application server. Choose type of destination object wisely.               |          Change your application to make it send a message to the destination object every time some changes are applied to entities. Choose message type and structure reasonably.           |             Develop MDB or MDP (depending on your technology platform) to receive these messages. Then MDB or MDP should check message’s type and structure, and then make a record into the dedicated table.           |          Choose a type of events you want to make notifications for. It can be changes of exact entity, changes of entities with names containing some specific string, some entity attribute exceeding some boundaries, etc. Specify additional information required to identify such an event (e.g. entity id, specific string, attribute boundaries, etc.). Add new table to the database. Each row should contain an e-mail for notification and condition information.            |           Develop MDB or MDP to receive messages on changes, check conditions and send e-mails. Some additional class may be required.             |            Make everything work together…          |


# Для работы с базой данных использовались следующие скрипты:
- [create_data.sql](https://github.com/WonMin13/ESA_Labs/blob/main/LR4_Dubman_Java%20Message%20Service/labwork4final/sql_scripts/create_data.sql) - создание таблиц
- [insert_data.sql](https://github.com/WonMin13/ESA_Labs/blob/main/LR4_Dubman_Java%20Message%20Service/labwork4final/sql_scripts/insert_data.sql) - заполнение таблиц
- [delete_data.sql](https://github.com/WonMin13/ESA_Labs/blob/main/LR4_Dubman_Java%20Message%20Service/labwork4final/sql_scripts/delete_data.sql) - удаление данных из таблицы


# Представление данных
- Thymeleaf
- XSLT


# Реализация Tasks


## Task 1
Для выполнения данного задания была добавлена новая таблица: DbChange - которая представляет собой изменение информации в других таблицах базы данных.


## Task 2
Для выполнения данного задания были созданы два класса, которые обеспечивают обработки логики JMS: [отправитель](https://github.com/WonMin13/ESA_Labs/blob/main/LR4_Dubman_Java%20Message%20Service/labwork4final/src/main/java/com/example/labwork4final/jms/Sender.java) и [получатель](https://github.com/WonMin13/ESA_Labs/blob/main/LR4_Dubman_Java%20Message%20Service/labwork4final/src/main/java/com/example/labwork4final/jms/Receiver.java). Sender необходим для создания объекта DbChange и отправки его получателю. Receiver осуществляет проверку объекта DbChange, после чего сохраняет его в БД и отправляет уведомления по электронной почте.


## Task 3
Для выполнения данного задания была добавлена реализация Sender bean в сервисы для отправки сообщений при каждом изменении базы данных.


## Task 4
В данном задание получатель получает эти сообщения, после чего делает запись в таблицу "db_change".


## Task 5
Для выполнения данного задания была добавлена новая таблица (сущность): Notification, содержащая адрес электронной почты для уведомления и состояния.


## Task 6
В данном задании получатель использует EmailManagerService для отправки электронных писем.


## Task 7
Проект работает с Spring Boot и PostgreSQL.



# Thymeleaf

## Army

|              Armys before create                |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/1c1979ab-2c6a-437a-945f-101af26ddfe8) |


|                   Create Army                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/84dae508-5d5b-4432-94d3-7256e92510d0) |


|               Armys after create                |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/e0b75541-cea1-4dbb-aeb4-7d18281b487e) |


|                   Update Army                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/14c1e089-57fa-47ec-8437-45cf1a3faa2d) |


|              Armys after update                 |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/a1da74ae-ab27-4175-a596-075528fff0a3) |




## Album

|              Albums before create               |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/93aee9b8-5af0-4575-a7b8-d9051d70066c) |


|        Albums Army before create a new one      |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/21b9d95c-2d7e-4f77-a397-2f4bb82bbfc7) |


|                  Create Album                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/e4d4cbf6-70c7-4377-82d8-fac2c1530e9d) |


|              Albums after create                |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/28e8b3aa-3559-4aaf-aec3-0a2219459a7a) |


|                  Update Album                   |
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/71a9f7e0-c0d7-440b-af15-dd63d63dd81b) |


|              Albums after update                |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/43814650-e0fd-4d53-a1c6-92f6d15ecdbb) |


|        Albums Army after create  a new one      |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/ee596d84-58b8-47a6-8aba-e7ddec94b368) |


# XSLT

|                      Armys                      |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/7e0337c0-8fa3-4e95-9921-83d721abd8e3) 
![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/868d3f7c-0964-47a8-8cff-5ffcc164bf9a) |


|                     Albums                      |           
|:-----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/a2b40e76-b913-40d7-9aca-1bdf7406add8) |

# Mail

|    Notification about the arrival of letters   |
|:----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/fa8d76cc-3931-494c-b368-6305b4e60bf8) |

|                     Letters                    |
|:----------------------------------------------:|
| ![image](https://github.com/WonMin13/ESA_Labs/assets/154375695/cca69e97-8710-4b27-a33f-c076488baa11) |





