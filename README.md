Technical Test: Movie Management System
=======================================

**Objective**: Develop a microservices-based system that manages information about films, authors and actors. The system should provide data visualization and management functionalities depending on the user's role.

Backend Testing:
----------------

The backend must be developed in Java 17 and spring-boot the latest current version.

**Microservices**: The solution must be built using microservices architecture. users, movies, authors

You can use all the tools that spring, spring-cloud provides.

* If you are not going to perform the frontend test, you must provide a postman file or similar to be able to test the APIs

Frontend Testing:
-----------------

The frontend must be done in VUE. The components for example use https://

vuetifyjs.com/en/ to make work easier

Free design doesn't have to be a brilliant design, we're more looking for functionality and good practices to be seen in the code.

System Requirements:
--------------------

### Login Page:

Develop a login page (frontend) 

Implement communication security between microservices

Users will be required to provide a username and password to access the system.

There are 2 users created, one with the user role and the other with the admin role:

**user1: userAuth123456!**

**admin1: adminAuth123456!**

### Movies and Authors Page:

Develop a page where the list of available films is displayed along with their respective authors. (frontend)

Filtering and/or searching for movies by name should be allowed

Implement pagination in the listing to improve the user experience when browsing between movies.

### Each Movie's Actors Page:

list movies with their actors

A list should be displayed with the movie, the name of the actor and the role he played

in the movie. (frontend)

This page must have infinite scroll, but access to the backend has to be with pagination.

### Roles and Permissions:

The system will have two main roles: User and Admin.

**User**: Can view all information about movies, authors and actors, but cannot perform any

modification actions.

**Admin**: Has all the permissions of the user role and can also:

Add/modify/delete new movies to the system, in a popup

Add cover images to the movie, making sure they are only png, jpg and weigh less than 3mb

Deliverables:
-------------

Source code of all implemented microservices.

If you have knowledge of Docker, it will be appreciated to include a Docker Compose so we can be able to run everything automatically.

In case you do not have knowledge of docker, instructions for deploying and starting the system in the readme must be included

Assessment:
-----------

Functionality and completeness of the solution.

Quality and clarity of the code.

Security in authentication and management of roles and permissions. Correct and efficient implementation of pagination.

Additional Notes: We recommend that you use JWT tokens or similar technology for authentication to secure communications between microservices and the user interface.

Happy coding!
