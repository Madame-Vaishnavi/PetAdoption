# Pet Adoption System

## Overview
The **Pet Adoption System** is a web-based application built using **Spring Boot** that connects users with rescue centers to facilitate pet adoptions. Users can browse pets, request adoption, and report stray animals, while rescue centers manage pet listings and approve adoption requests.

## Features
- **User Interface**
  - Browse and search for pets across multiple rescue centers.
  - Request adoption of available pets.
  - Report stray animals in need of rescue.

- **Rescue Center Interface**
  - Showcase pets available for adoption.
  - Manage adoption requests and assign pets to users.

- **Additional Functionalities**
  - Role-based authentication (User & Rescue Center Admin).
  - RESTful APIs for data operations.
  - Image upload support for pet profiles.
  - Secure user authentication with Spring Security.
  - API documentation using Swagger.

## Tech Stack
- **Backend:** Spring Boot, Spring MVC, Hibernate (JPA), MySQL
- **Security:** Spring Security, JWT (optional)
- **Database:** MySQL
- **Tools & Dependencies:** Maven, Lombok

## Installation & Setup
### Prerequisites
- Java 17+
- Maven
- MySQL Server
- Spring Tool Suite (STS) or any preferred IDE


## API Endpoints
| Endpoint | Method | Description |
|----------|--------|-------------|
| `/addUser` | POST | Register a new user |
| `/pets` | GET | List available pets |
| `/pets/{id}` | GET | Get pet details by ID |
| `/requests` | POST | Request adoption for a pet |
| `/reports` | POST | Report a stray animal |

## Future Enhancements
- Implement JWT-based authentication.
- Add email notifications for adoption requests.
- Mobile-friendly UI improvements.

## Contributing
Feel free to fork the project and submit pull requests! If you encounter any issues, report them in the **Issues** section.

## License
This project is licensed under the **MIT License**. See the `LICENSE` file for details.

---
### Contact
For any queries, reach out to: [vaishnavi.singh.260104@example.com](mailto:vaishnavi.singh.260104@example.com)

