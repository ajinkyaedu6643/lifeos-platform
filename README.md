# 🌐 LifeOS Platform

> A modular personal life management platform — manage health, finance, knowledge, projects, personal work, documents, and family activities from a single application.

![Java](https://img.shields.io/badge/Java-21-orange?style=flat-square&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=flat-square&logo=springboot)
![Spring Security](https://img.shields.io/badge/Spring%20Security-enabled-green?style=flat-square&logo=springsecurity)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-blue?style=flat-square&logo=postgresql)
![Status](https://img.shields.io/badge/Status-In%20Development-yellow?style=flat-square)
![License](https://img.shields.io/badge/License-MIT-lightgrey?style=flat-square)

---

## 📌 About

**LifeOS Platform** is a personal learning project — an ambitious modular life management system built with Java 21 and Spring Boot 3. The goal is to consolidate all personal life domains — health, finance, knowledge, projects, personal work, documents, and family — into one unified platform with a clean REST API backend.

---

## ✨ Current Features

### 👤 User & Role Management
- User Registration & Management
- Role-Based Access Control
- Basic Authentication (Spring Security)
- DTO Validation

---

## 🗺️ Roadmap

| Module | Description | Status |
|---|---|---|
| User Management | Auth, roles, validation | ✅ Done |
| Workspace Management | Multi-workspace support | 🔄 Planned |
| Person Management | Family & contacts | 🔄 Planned |
| Document Vault | Secure document storage | 🔄 Planned |
| Investment Tracking | MF, gold, SIP tracking | 🔄 Planned |
| Knowledge Management | Notes, learnings, resources | 🔄 Planned |
| Passbook Vault Integration | Bank account management | 🔄 Planned |
| AI Assistant | Smart life insights | 🔄 Planned |

---

## 🛠️ Technology Stack

| Technology | Version |
|---|---|
| Java | 21 |
| Spring Boot | 3.x |
| Spring Security | Latest |
| Spring Data JPA | Latest |
| PostgreSQL | Latest |
| Maven | Latest |

---

## 🚀 Getting Started

### Prerequisites
- Java 21+
- PostgreSQL
- Maven

### Run Locally

```bash
# Clone the repository
git clone https://github.com/ajinkyaedu6643/lifeos-platform.git

# Navigate to project
cd lifeos-platform

# Configure database in application.properties
# spring.datasource.url=jdbc:postgresql://localhost:5432/lifeos

# Run the application
./mvnw spring-boot:run
```

---

## 📁 Project Structure

```
lifeos-platform/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/lifeos/
│       │       ├── user/         # User & Role management
│       │       ├── security/     # Spring Security config
│       │       ├── common/       # Shared DTOs, exceptions
│       │       └── config/       # App configuration
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md
```

---

## 💡 Vision

LifeOS aims to be a self-hosted personal ERP system — replacing scattered spreadsheets, apps, and tools with one unified, API-first platform tailored for individual and family life management.

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).

---

> 💡 *This is a personal portfolio project built for learning Spring Boot, Spring Security, modular architecture, and full-stack development concepts.*
