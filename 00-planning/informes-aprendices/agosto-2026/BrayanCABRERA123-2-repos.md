# Informe 2 — Commits en los repositorios en los que trabajaste

**Periodo:** del 11 de agosto al 30 de septiembre de 2026 (hora Colombia, UTC-5)
**Repositorio principal de la ficha:** https://github.com/code-sena/ADSO-3145556

| Campo | Valor |
|---|---|
| Aprendiz |Brayan Estiven Patiño Cabrera|
| Usuario de GitHub | BrayanCABRERA123 |
| Ficha | ADSO-3145556 |
| Proyecto (equipo) | vehicle-washing |
| Correo(s) con el que haces commit | bspc1507@gmail.com |
| Fecha de elaboración |06/10/2026|

## 1. Resumen de repositorios

| # | Repositorio | Enlace | Tipo | Visibilidad | Commits |
|---|---|---|---|---|---|
| 1 | `merari0322/LavadoVehicular-Movil` | https://github.com/merari0322/LavadoVehicular-Movil | Otro (proyecto del equipo) | Público | 6 |
| 2 | `BrayanCABRERA123/Front-end-proyecto-web` | https://github.com/BrayanCABRERA123/Front-end-proyecto-web | Personal | Público | 52 |
| 3 | `BrayanCABRERA123/lavarapido-api-gateway` | https://github.com/BrayanCABRERA123/lavarapido-api-gateway | Personal | Público | 0 |
| 4 | `camiloguilombo12/lavarapido-booking-service` | https://github.com/camiloguilombo12/lavarapido-booking-service | Otro (proyecto del equipo) | Público | 1 |
| 5 | `camiloguilombo12/lavarapido-customer-service` | https://github.com/camiloguilombo12/lavarapido-customer-service | Otro (proyecto del equipo) | Público | 1 |
| 6 | `BrayanCABRERA123/lavarapido-infra` | https://github.com/BrayanCABRERA123/lavarapido-infra | Personal | Público | 5 |
| 7 | `BrayanCABRERA123/lavarapido-notification-service` | https://github.com/BrayanCABRERA123/lavarapido-notification-service | Personal | Público | 2 |
| 8 | `BrayanCABRERA123/lavarapido-operation-service` | https://github.com/BrayanCABRERA123/lavarapido-operation-service | Personal | Público | 0 |
| 9 | `merari0322/lavarapido-payment-service` | https://github.com/merari0322/lavarapido-payment-service | Otro (proyecto del equipo) | Público | 0 |
| 10 | `BrayanCABRERA123/lavarapido-security-service` | https://github.com/BrayanCABRERA123/lavarapido-security-service | Personal | Público | 7 |
| | **Total** | | | | **74** |

## 2. Detalle por repositorio

### 2.1 `merari0322/LavadoVehicular-Movil`

- **Enlace del repositorio:** https://github.com/merari0322/LavadoVehicular-Movil
- **Tipo:** Otro (proyecto del equipo)
- **Visibilidad:** Público
- **Total de commits en el periodo:** 6
- **Qué hice (2 a 3 líneas):** Construí en React Native/Expo las pantallas de landing y el flujo de autenticación, y conecté la app al security-service. Agregué el layout compartido por roles, las pantallas de cliente, operador y administrador con navegación por rol, y la traducción del módulo admin a 4 idiomas.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [112ea9c](https://github.com/merari0322/LavadoVehicular-Movil/commit/112ea9c) | 2026-09-03 13:26:24 -0500 | feat: add mobile landing screens and complete auth flow (login, register, forgot password) |
| [7434402](https://github.com/merari0322/LavadoVehicular-Movil/commit/7434402) | 2026-09-03 14:51:09 -0500 | fix: align Expo SDK 57 dependencies and add missing peer deps |
| [2271b6b](https://github.com/merari0322/LavadoVehicular-Movil/commit/2271b6b) | 2026-09-30 04:03:57 -0500 | feat(auth): connect mobile app to security-service |
| [20025c2](https://github.com/merari0322/LavadoVehicular-Movil/commit/20025c2) | 2026-09-30 04:04:17 -0500 | feat(ui): add shared role layout, i18n helper, shared state and screen components |
| [19540aa](https://github.com/merari0322/LavadoVehicular-Movil/commit/19540aa) | 2026-09-30 04:04:33 -0500 | feat(roles): add client and operator screens with role-based navigation |
| [7efe499](https://github.com/merari0322/LavadoVehicular-Movil/commit/7efe499) | 2026-09-30 04:04:49 -0500 | feat(admin): translate admin to 4 languages, wire dashboard actions, assign operator and operator calendar |

### 2.2 `BrayanCABRERA123/Front-end-proyecto-web`

- **Enlace del repositorio:** https://github.com/BrayanCABRERA123/Front-end-proyecto-web
- **Tipo:** Personal
- **Visibilidad:** Público
- **Total de commits en el periodo:** 52
- **Qué hice (2 a 3 líneas):** Desarrollé el front web en Angular: conecté las pantallas a una API simulada (json-server), unifiqué tipografía y pasé el código a inglés, y agregué modales de confirmación y éxito, pago con QR, validación de placas y filtros por fecha. Al final conecté login, registro, perfil, reservas, catálogo, horarios y bahías al security-service y al booking-service.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [2306144](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/2306144) | 2026-09-16 14:22:31 -0500 | feat(mock-api): connect remaining screens to mock API and fix change detection |
| [98b7f87](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/98b7f87) | 2026-09-17 14:05:06 -0500 | feat(mock-api): connect remaining screens to mock API and fix change detection |
| [5ebe633](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/5ebe633) | 2026-09-18 16:13:02 -0500 | feat(operator): typography scale, English code, and consistent button sizing |
| [66f47da](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/66f47da) | 2026-09-19 23:39:21 -0500 | feat(client): typography scale, English code |
| [33d4d22](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/33d4d22) | 2026-09-20 00:15:25 -0500 | feat(landing): typography scale and English code |
| [0c1d05b](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/0c1d05b) | 2026-09-20 01:10:56 -0500 | feat(shared): typography scale and English code for shared components |
| [7363067](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/7363067) | 2026-09-20 01:25:20 -0500 | refactor: translate role input values to English (CLIENTE/OPERARIO/ADMIN -> CLIENT/OPERATOR/ADMIN) |
| [ed35d29](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/ed35d29) | 2026-09-20 01:59:42 -0500 | feat(admin): translate reports module to English and fix typography |
| [b10c948](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/b10c948) | 2026-09-20 02:14:30 -0500 | fix: apply typography variables missed in modals and global font-family |
| [45191d4](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/45191d4) | 2026-09-23 12:30:57 -0500 | feat: add mock api |
| [f1190f1](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/f1190f1) | 2026-09-23 15:43:01 -0500 | feat: connect client, operator and admin to mock API |
| [b7ee299](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/b7ee299) | 2026-09-24 01:15:10 -0500 | fix: modified db.json |
| [65d0399](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/65d0399) | 2026-09-25 23:30:40 -0500 | feat(payment): redesign payment screen with QR and receipt confirmation |
| [b4b13b9](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/b4b13b9) | 2026-09-25 23:57:05 -0500 | fix(payment): remove flow simulation bar and adjust summary colors |
| [ba2e458](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/ba2e458) | 2026-09-26 00:18:11 -0500 | feat(auth): show success modal after registration |
| [5a85ff9](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/5a85ff9) | 2026-09-26 00:34:29 -0500 | feat(shared): add StatusModal and use it in password reset and payment |
| [c17cf89](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/c17cf89) | 2026-09-26 00:40:59 -0500 | feat(reserve): show booking summary modal and redirect to payment |
| [0689cad](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/0689cad) | 2026-09-26 00:46:12 -0500 | feat(profile): show success modal after saving profile |
| [600f33b](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/600f33b) | 2026-09-26 00:52:11 -0500 | feat(profile): add change password modal |
| [1674452](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/1674452) | 2026-09-26 00:55:01 -0500 | feat(profile): confirm before deleting account |
| [6579274](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/6579274) | 2026-09-26 01:02:23 -0500 | refactor(auth): reuse PasswordRequirementsComponent in register and forgot password |
| [886bc17](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/886bc17) | 2026-09-26 01:08:15 -0500 | feat(vehicles): confirm before deleting a vehicle |
| [d22b4e0](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/d22b4e0) | 2026-09-26 01:12:47 -0500 | feat(vehicles): add vehicle edit and Colombian plate validations |
| [d3235e8](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/d3235e8) | 2026-09-26 01:24:06 -0500 | feat(payment): confirm before cancelling a reservation |
| [cd79399](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/cd79399) | 2026-09-26 01:35:54 -0500 | fix(shared): use theme primary color for StatusModal success icon |
| [6259f0b](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/6259f0b) | 2026-09-26 01:37:27 -0500 | fix(vehicles): refresh view after editing or deleting a vehicle (zoneless) |
| [66c628d](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/66c628d) | 2026-09-26 01:37:42 -0500 | feat(history): validate, confirm and allow editing service ratings |
| [5c1ccf8](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/5c1ccf8) | 2026-09-26 01:52:51 -0500 | feat(shared): add info type and custom icon to StatusModal |
| [5f7e82b](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/5f7e82b) | 2026-09-26 01:53:05 -0500 | feat(client): switch reservation and dashboard to on-site service |
| [df23820](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/df23820) | 2026-09-26 01:56:34 -0500 | feat(client): remove home-service references from history and notifications |
| [bcabc66](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/bcabc66) | 2026-09-26 02:07:42 -0500 | feat(shared): make profile address optional and remove location sharing |
| [783f8ea](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/783f8ea) | 2026-09-26 02:07:53 -0500 | fix(profile): persist profile changes with UserSession and sync sidebar |
| [14baf4c](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/14baf4c) | 2026-09-26 02:21:37 -0500 | feat(history): show payment status as badge and add pay now button |
| [6a0daea](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/6a0daea) | 2026-09-26 02:28:59 -0500 | fix(settings): fix card layout after removing location card |
| [7f569e8](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/7f569e8) | 2026-09-26 02:29:09 -0500 | feat(settings): open help center modal with car wash contact channels |
| [f1f3675](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/f1f3675) | 2026-09-26 02:37:10 -0500 | feat(settings): persist notification toggles in localStorage |
| [239f1c0](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/239f1c0) | 2026-09-26 02:44:51 -0500 | fix(client): remove broken /client/ratings route |
| [9e462ca](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/9e462ca) | 2026-09-26 02:56:50 -0500 | fix(history): align mock service types and price with card titles |
| [1878248](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/1878248) | 2026-09-27 18:04:33 -0500 | fix(payment): persist QR timer and block duplicate payment |
| [92b8245](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/92b8245) | 2026-09-27 18:06:04 -0500 | fix(history): apply date range filter |
| [7ca4d69](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/7ca4d69) | 2026-09-27 18:07:52 -0500 | feat(notifications): add instant date range filter |
| [4c20a65](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/4c20a65) | 2026-09-27 18:20:34 -0500 | feat(prices): add COP prices constant and pipe |
| [25586fd](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/25586fd) | 2026-09-27 18:20:50 -0500 | fix(prices): use fixed COP prices in reserve, landing and history |
| [4793953](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/4793953) | 2026-09-27 18:21:05 -0500 | chore(i18n): remove unused price keys |
| [ac4a378](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/ac4a378) | 2026-09-28 13:22:46 -0500 | feat(operator): add action modals and remove ID column |
| [c525bf5](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/c525bf5) | 2026-09-28 14:04:13 -0500 | refactor(operator): drop address fields and add success feedback to actions |
| [a0cc15e](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/a0cc15e) | 2026-09-29 15:30:55 -0500 | feat(auth): connect login, register and password recovery to security-service |
| [2bc6e51](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/2bc6e51) | 2026-09-30 01:44:45 -0500 | feat(account): connect profile, email change, account deactivation and admin users to backend |
| [8440d14](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/8440d14) | 2026-09-30 08:59:58 -0500 | feat(web): real booking form and notifications, remove hardcoded business data |
| [d986e01](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/d986e01) | 2026-09-30 16:26:33 -0500 | feat(web): manage catalog services with prices per vehicle type and load landing prices |
| [ab98350](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/ab98350) | 2026-09-30 16:26:53 -0500 | feat(web): connect business hours, exceptions and bays to booking-service |
| [9f81885](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/9f81885) | 2026-09-30 16:27:35 -0500 | feat(web): connect admin bookings to booking-service with plate lookup and availability |

### 2.3 `BrayanCABRERA123/lavarapido-api-gateway`

- **Enlace del repositorio:** https://github.com/BrayanCABRERA123/lavarapido-api-gateway
- **Tipo:** Personal
- **Visibilidad:** Público
- **Total de commits en el periodo:** 0
- **Qué hice (2 a 3 líneas):** No tengo commits en este repositorio en el periodo; mis commits aquí son de octubre.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| | | |

### 2.4 `camiloguilombo12/lavarapido-booking-service`

- **Enlace del repositorio:** https://github.com/camiloguilombo12/lavarapido-booking-service
- **Tipo:** Otro (proyecto del equipo)
- **Visibilidad:** Público
- **Total de commits en el periodo:** 1
- **Qué hice (2 a 3 líneas):** Reconstruí el booking-service sobre el modelo de datos SQL, con disponibilidad, catálogo de servicios y eventos.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [6dcba98](https://github.com/camiloguilombo12/lavarapido-booking-service/commit/6dcba98) | 2026-09-30 08:58:29 -0500 | feat(booking): rebuild booking-service on the SQL data model with availability, catalog and events |

### 2.5 `camiloguilombo12/lavarapido-customer-service`

- **Enlace del repositorio:** https://github.com/camiloguilombo12/lavarapido-customer-service
- **Tipo:** Otro (proyecto del equipo)
- **Visibilidad:** Público
- **Total de commits en el periodo:** 1
- **Qué hice (2 a 3 líneas):** Hice que el perfil del cliente se cree en su primer uso y que el servicio consuma el evento user_registered.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [515df5d](https://github.com/camiloguilombo12/lavarapido-customer-service/commit/515df5d) | 2026-09-30 08:55:56 -0500 | feat(customer): provision the profile on first use and consume user_registered |

### 2.6 `BrayanCABRERA123/lavarapido-infra`

- **Enlace del repositorio:** https://github.com/BrayanCABRERA123/lavarapido-infra
- **Tipo:** Personal
- **Visibilidad:** Público
- **Total de commits en el periodo:** 5
- **Qué hice (2 a 3 líneas):** Armé el docker-compose compartido con SQL Server, Mailpit, RabbitMQ y los servicios de notificación y reservas, junto con la plantilla de variables de entorno y la guía del equipo.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [5145a8e](https://github.com/BrayanCABRERA123/lavarapido-infra/commit/5145a8e) | 2026-09-29 16:42:05 -0500 | chore: add shared SQL Server compose and environment template |
| [cd053a3](https://github.com/BrayanCABRERA123/lavarapido-infra/commit/cd053a3) | 2026-09-29 17:08:08 -0500 | docs: add team guide and align compose with service repo name |
| [b811e70](https://github.com/BrayanCABRERA123/lavarapido-infra/commit/b811e70) | 2026-09-30 00:38:22 -0500 | feat(infra): add Mailpit and mail settings for password recovery emails |
| [bb698fb](https://github.com/BrayanCABRERA123/lavarapido-infra/commit/bb698fb) | 2026-09-30 05:38:14 -0500 | feat(infra): add RabbitMQ and notification-service to compose |
| [73e22d0](https://github.com/BrayanCABRERA123/lavarapido-infra/commit/73e22d0) | 2026-09-30 16:20:27 -0500 | chore(compose): add booking-service and customer messaging settings |

### 2.7 `BrayanCABRERA123/lavarapido-notification-service`

- **Enlace del repositorio:** https://github.com/BrayanCABRERA123/lavarapido-notification-service
- **Tipo:** Personal
- **Visibilidad:** Público
- **Total de commits en el periodo:** 2
- **Qué hice (2 a 3 líneas):** Creé el notification-service con bandeja de notificaciones, push por Expo y consumidor de RabbitMQ, y el envío del correo de bienvenida por SMTP al registrarse un usuario.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [b38b61e](https://github.com/BrayanCABRERA123/lavarapido-notification-service/commit/b38b61e) | 2026-09-30 05:32:51 -0500 | feat(notification): add notification service with inbox, Expo push and RabbitMQ consumer |
| [7f13c18](https://github.com/BrayanCABRERA123/lavarapido-notification-service/commit/7f13c18) | 2026-09-30 16:18:31 -0500 | feat(notification): send the welcome email over SMTP on UserRegistered |

### 2.8 `BrayanCABRERA123/lavarapido-operation-service`

- **Enlace del repositorio:** https://github.com/BrayanCABRERA123/lavarapido-operation-service
- **Tipo:** Personal
- **Visibilidad:** Público
- **Total de commits en el periodo:** 0
- **Qué hice (2 a 3 líneas):** No tengo commits en este repositorio en el periodo; mis commits aquí son de octubre.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| | | |

### 2.9 `merari0322/lavarapido-payment-service`

- **Enlace del repositorio:** https://github.com/merari0322/lavarapido-payment-service
- **Tipo:** Otro (proyecto del equipo)
- **Visibilidad:** Público
- **Total de commits en el periodo:** 0
- **Qué hice (2 a 3 líneas):** No tengo commits en este repositorio en el periodo; mi commit aquí es de octubre.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| | | |

### 2.10 `BrayanCABRERA123/lavarapido-security-service`

- **Enlace del repositorio:** https://github.com/BrayanCABRERA123/lavarapido-security-service
- **Tipo:** Personal
- **Visibilidad:** Público
- **Total de commits en el periodo:** 7
- **Qué hice (2 a 3 líneas):** Creé el security-service con autenticación JWT, Swagger, recuperación de contraseña por correo, cambio de correo y desactivación de cuenta, y la publicación del evento UserRegistered en RabbitMQ.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [e59d3bb](https://github.com/BrayanCABRERA123/lavarapido-security-service/commit/e59d3bb) | 2026-09-29 16:46:51 -0500 | feat(security): add security-service with JWT auth, password recovery and account management |
| [9bda73c](https://github.com/BrayanCABRERA123/lavarapido-security-service/commit/9bda73c) | 2026-09-29 17:05:17 -0500 | feat(docs): add Swagger UI with JWT authorization for dev profile |
| [440b17f](https://github.com/BrayanCABRERA123/lavarapido-security-service/commit/440b17f) | 2026-09-30 00:36:34 -0500 | feat(auth): send password recovery code by email over SMTP |
| [7f3c11b](https://github.com/BrayanCABRERA123/lavarapido-security-service/commit/7f3c11b) | 2026-09-30 01:56:58 -0500 | feat(account): let users change their login email and deactivate their account |
| [1add5b9](https://github.com/BrayanCABRERA123/lavarapido-security-service/commit/1add5b9) | 2026-09-30 05:37:16 -0500 | feat(messaging): publish UserRegistered to RabbitMQ after commit |
| [fbd822f](https://github.com/BrayanCABRERA123/lavarapido-security-service/commit/fbd822f) | 2026-09-30 06:20:03 -0500 | feat: modified event and out |
| [16bd5ae](https://github.com/BrayanCABRERA123/lavarapido-security-service/commit/16bd5ae) | 2026-09-30 08:57:28 -0500 | feat(users): expose personId in the user response |

## 3. Verificación del aprendiz

- [X] Todos los commits listados los hice con mi cuenta (aparece mi foto de perfil en GitHub).
- [X] Incluí los commits de **todas las ramas** de cada repositorio, no solo de la rama por defecto.
- [X] Todos los commits caen entre el 11 de agosto y el 30 de septiembre de 2026 (hora Colombia).
- [X] No repetí repositorios del Informe 1 (los de mi equipo).
- [X] Cada enlace de repositorio y de commit abre en GitHub.
- [X] El total de cada repositorio coincide con el número de filas de su tabla.
- [ ] En los repositorios privados indiqué si el instructor tiene acceso.

## 4. Observaciones

- El periodo de este informe es del 11 de agosto al 30 de septiembre de 2026, igual que el Informe 1.
- Todos los repositorios son públicos. Son los repositorios de código del proyecto LavaRápido (web, móvil, microservicios e infraestructura); los que están a nombre de otros compañeros los marqué como *Otro (proyecto del equipo)*.
- `lavarapido-api-gateway`, `lavarapido-operation-service` y `lavarapido-payment-service` quedan en 0 porque mis commits en ellos son de octubre de 2026, fuera del periodo.
- No incluí 5 entradas de `git stash` que aparecen como commits locales (2 en el móvil, 1 en la web y 2 en customer-service): no son commits reales y no están publicados en GitHub.
- **Subí demasiado contenido en un solo commit en varios casos.** Por ejemplo:
  - [6dcba98](https://github.com/camiloguilombo12/lavarapido-booking-service/commit/6dcba98) en booking-service: unas 8.700 líneas en 142 archivos.
  - [e59d3bb](https://github.com/BrayanCABRERA123/lavarapido-security-service/commit/e59d3bb) en security-service: unas 6.100 líneas en 142 archivos.
  - [112ea9c](https://github.com/merari0322/LavadoVehicular-Movil/commit/112ea9c) en el móvil: unas 6.000 líneas en 63 archivos.
  - [19540aa](https://github.com/merari0322/LavadoVehicular-Movil/commit/19540aa) y [7efe499](https://github.com/merari0322/LavadoVehicular-Movil/commit/7efe499) en el móvil: unas 5.500 y 4.800 líneas en 43 archivos cada uno.
  - [f1190f1](https://github.com/BrayanCABRERA123/Front-end-proyecto-web/commit/f1190f1) en la web: unas 9.800 líneas en 110 archivos.
  - [b38b61e](https://github.com/BrayanCABRERA123/lavarapido-notification-service/commit/b38b61e) en notification-service: unas 4.300 líneas en 81 archivos.

  Esto hace más difícil revisar los cambios y revertirlos si algo falla. Debo dividir el trabajo en commits más pequeños, uno por funcionalidad o pantalla.
- Correo de commit: bspc1507@gmail.com. Hay que verificar en GitHub que esté vinculado a la cuenta (que aparezca la foto de perfil en el commit).

---

*Declaro que la información de este informe es veraz y que los commits listados son de mi autoría.*

**Aprendiz:** Brayan Estiven Patiño Cabrera **Fecha:** 06/10/2026
