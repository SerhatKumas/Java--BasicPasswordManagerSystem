# Java--BasicPasswordManagerSystem

- It's password recording system with mysql database.
- I have tried to write code as generic as I could.
- I have tried keep coupling in the lowest level I could.
- I have divided part program into components.
- Login controller and User interface controller components are implemented to be able to test for the reason not having actual user interface.


## Code layers
- Login Controller -> Decides which user is logged in and creates user interfaces up to that taken information
- User Interface Controller -> Since program is not connected to real front-end part, I created fake front-end methods are described according to different authorization
- Business Layer -> Layer for business rules and other constraints can be idenfied.
- Data Access Layer -> It contains database access implementation.
- Model -> It contains entities of system.


## Code Parts Explanation

- PasswordRecord -> Base class for passwords
- User -> Password Owner
- PasswordRecord Dal -> It contains password record manipulation methods for database
- User Dal -> It contains password owner manipulation methods for database
- PasswordRecord Manager -> It contains business rules for employee and interacts with data access layerc
- User Manager -> It contains business rules for user and interacts with data access layer
- User Interface -> It contains user front-end interface and it's authorized methods
- Admin Interface -> It contains admin front-end interface and it's authorized methods
- Login Controller ->  It contains login methods for users and decision methods for which user interface will be created


- Main.java -> Main program initializer code


## How To Run
- git clone https://github.com/SerhatKumas/Java--BasicPasswordManagerSystem.git
- Initialise database according to given models
- Open main.java and run it
- You will see user interface on your ide console


## Technologies

- [@Java](https://www.java.com/tr/)
- [@Mysql](https://www.mysql.com/)


# Hi, I'm Serhat the Author! 👋


## 🔗 Connection Links

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/serhatkumas/)

[![@Github](https://img.shields.io/badge/github-0A66C2?style=for-the-badge&logo=github&logoColor=white)](https://www.github.com/serhatkumas)
