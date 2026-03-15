# 🚀 Spring Boot Backend Mastery

> A hands-on learning journey from Spring Boot basics to production-ready backend development.
> Built concept by concept, committed piece by piece.

---

## 👋 What is this repo?

This isn't a tutorial I copy-pasted.
This is me actually learning backend development — one concept at a time, one commit at a time.

Every folder = one concept learned.
Every commit = one step forward.

---

## 🗂️ Project Structure
```

src/
└── main/
    └── java/
        └── com/learn/
            |---coommon/
            |    |--ApiRespone.java
            |    |--ApiResponseUtil.java
            |    |--PageResponse.java
            |---config/
            |    |--AppConfig.java
            |---controller
            |    |--StudentController.java
            ├── entity/
            │   └── Student.java
            |---mapper
            |   |--StudentMapper.java
            ├── dto/
            │   ├── request/
            │   │   ├── StudentRegistrationRequestDTO.java
            │   │   └── StudentUpdateRequestDTO.java
            │   └── response/
            │       ├── StudentResponseDTO.java
            │       └── StudentSummaryDTO.java
            |---security
            |    |--CustomUserDetailService.java
            |    |--SecurityConfig.java
            |    |--SecurityUtils.java
            |---repository
            |   |--StudentRepository.java
            |---services
            |   |--interface
            |   |    |--StudentService.java
            |   |--impl
            |        |--StudentSericeImpl.java
            └── DtoMasteryApplication.java
```
---

## 🛠️ Tech Stack

| Tech | Version | Why |
|---|---|---|
| Java | 17 | LTS version, industry standard |
| Spring Boot | 3.2.x | Modern, production-ready framework |
| PostgreSQL | 14+ | Real database, not in-memory |
| Lombok | Latest | Removes boilerplate getters/setters |
| Hibernate Validator | Latest | DTO validation annotations|

---

## 📅 Roadmap

- [x] Day 1 — Student Entity + All DTOs
- [ ] Day 2 — DTO Mapping (Entity ↔ DTO conversion)
- [ ] Day 3 — ApiResponse wrapper
- [ ] Day 4 — SecurityUtils (get current logged-in user)
- [ ] Day 5 — Pagination & Pageable
- [ ] Day 6 — Full working API tested in Postman


> 🎯 Goal: Become a production-ready backend developer.
> 📍 Current: Board exams + 35-45 min/day learning sessions.
> 💪 The grind is real. The commits don't lie.
