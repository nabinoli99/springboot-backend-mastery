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

## 📚 Concepts Covered

### ✅ Day 1 — DTOs (Data Transfer Objects)

**The problem DTOs solve:**
When your database has sensitive fields like `password`, `internalFlags`, `tokens` — you never want to send all of that to the frontend. DTOs act as a controlled shape of your data.

```
Entity     →  what lives in the database (everything)
RequestDTO →  what comes IN from frontend
ResponseDTO→  what goes OUT to frontend (safe fields only)
UpdateDTO  →  what frontend sends when editing
SummaryDTO →  minimal data for list/table views
```

**What I built:**

| Class | Type | Purpose |
|---|---|---|
| `Student` | Entity | Maps to `students` table in PostgreSQL |
| `StudentRegistrationRequestDTO` | Request | Frontend sends this to register |
| `StudentUpdateRequestDTO` | Request | Frontend sends this to update profile |
| `StudentResponseDTO` | Response | What API returns — no password, has fullName |
| `StudentSummaryDTO` | Response | Minimal data for student list table |

**Key decisions made:**
- `fullName` in response instead of separate `firstName` + `lastName` — cleaner for frontend display
- `password` never appears in any response DTO — ever
- `gpa` is optional on registration — students don't have GPA on day 1
- `active` is set by server on registration — frontend doesn't decide this
- Update DTO has no validations — fields are optional, only send what changed

---

## 🗂️ Project Structure
```
src/
└── main/
    └── java/
        └── com/learn/
            ├── entity/
            │   └── Student.java
            ├── dto/
            │   ├── request/
            │   │   ├── StudentRegistrationRequestDTO.java
            │   │   └── StudentUpdateRequestDTO.java
            │   └── response/
            │       ├── StudentResponseDTO.java
            │       └── StudentSummaryDTO.java
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

## ⚙️ Setup & Run Locally

**1. Clone the repo**
```bash
git clone https://github.com/yourusername/spring-boot-backend-mastery.git
cd spring-boot-backend-mastery
```

**2. Create PostgreSQL database**
```sql
CREATE DATABASE dto_mastery_db;
```

**3. Update application.properties**
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/dto_mastery_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

**4. Run**
```bash
./mvnw spring-boot:run
```

---

## 📅 Roadmap

- [x] Day 1 — Student Entity + All DTOs
- [ ] Day 2 — DTO Mapping (Entity ↔ DTO conversion)
- [ ] Day 3 — ApiResponse wrapper
- [ ] Day 4 — SecurityUtils (get current logged-in user)
- [ ] Day 5 — Pagination & Pageable
- [ ] Day 6 — Full working API tested in Postman

---

## 💡 What I Learned

```
❌ Before:  Return entity directly from controller
✅ After:   Entity → Service → DTO → Controller → Frontend

❌ Before:  One class for everything
✅ After:   Separate RequestDTO, ResponseDTO, UpdateDTO, SummaryDTO

❌ Before:  Expose password in API response
✅ After:   Password never leaves the backend. Ever.
```

---

## 📌 Commit Convention Used

```
init:    → project setup
build:   → dependencies, pom.xml
config:  → application.properties
feat:    → new feature or class
fix:     → bug fix
style:   → formatting, unused imports
test:    → test classes
docs:    → README, documentation
```

---

> 🎯 Goal: Become a production-ready backend developer.
> 📍 Current: Board exams + 35-45 min/day learning sessions.
> 💪 The grind is real. The commits don't lie.
