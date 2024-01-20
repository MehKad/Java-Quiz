# Java Quiz Application

This is a web-based quiz application logic and UI built using Java SpringBoot mySQL database and reactJs. It allows users (teachers) to make quizzes, edit them and delete them and also for normal users to take the quizes and be marked.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Usage](#usage)
- [Contributing](#contributing)
- [Contact](#contact)

## Features

- User Authentication:
  - Login
  - Register
- Quizes:
  - Get All Quizes
  - Get Quiz by Id
  - Add Quiz

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- ReactJs
- Java
- Spring
- SpringBoot
- MySql

### Installation

1. Clone the repo :

   ```
   git clone https://github.com/mehkad/Java-Quiz.git
   ```

2. Run phpmyadmin from wamp server and create a database
   
3. Go to `./srsc/main/resources/application.properties` and change what seems convinient for your usage:

   ```

   spring.jpa.hibernate.ddl-auto=update
    spring.datasource.url=jdbc:mysql://localhost:3306/crud
    spring.datasource.username=root
    spring.datasource.password=
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   ```
   
4. Go to `./user_interface` and run the following :

   ```
       npm i
   ```

### Usage

To run the project, you have to run the server part and the client's ui :

1. To start the server on your local machine for development purposes, and using the concurrently module, it is recomended to use the intellij ide , and run the main located at :

   ```
   ./src/main/java/isil.java_quiz_server/JavaQuizServerApplication.java
   ```

2. To start the ui part, navigate to `./user_interface` and run the following:

   ```
   npm start
   ```

The application will start running on http://localhost:3000

## Contributing

Any contributions you make are greatly appreciated.

1. Fork the Project.

2. Create your Feature Branch

```
git checkout -b feature/AmazingFeature
```

3. Commit your Changes

```
   git commit -m 'Add some AmazingFeature'
```

4. Push to the Branch

```
   git push origin feature/AmazingFeature
```

5. Open a Pull Request

## Contact

- Email: mehkadiri@gmail.com
- Twitter: @mehkadiri
- Instagram: @meh_kadiri
- portfolio: https://mehkadiri.me
