# Informe 1 — Commits en el repositorio de documentación y en los repositorios de tu equipo

**Periodo:** del 11 de agosto al 30 de septiembre de 2026 (hora Colombia, UTC-5)
**Repositorio principal de la ficha:** https://github.com/code-sena/ADSO-3145556

| Campo | Valor |
|---|---|
| Aprendiz | Brayan Estiven Patiño Cabrera|
| Usuario de GitHub | BrayanCABRERA123 |
| Ficha | ADSO-3145556 |
| Proyecto (equipo) | vehicle-washing |
| Prefijo de los repositorios del equipo | `vehicle-w-` |
| Correo(s) con el que haces commit | bspc1507@gmail.com |
| Fecha de elaboración |06/10/2026 |

## 1. Resumen

| Repositorio | Enlace | Commits |
|---|---|---|
| `vehicle-w-docs` | https://github.com/code-sena/vehicle-w-docs | 29 |
| `vehicle-w-api` | https://github.com/code-sena/vehicle-w-api | 0 |
| `vehicle-w-app` | https://github.com/code-sena/vehicle-w-app | 0 |
| `vehicle-w-db` | https://github.com/code-sena/vehicle-w-db | 0 |
| `vehicle-w-portal` | https://github.com/code-sena/vehicle-w-portal | 0 |
| **Total** | | **29** |

## 2. Repositorio de documentación

- **Repositorio:** `vehicle-w-docs`
- **Enlace:** https://github.com/code-sena/vehicle-w-docs
- **Total de commits en el periodo:** 29
- **Qué hice (2 a 3 líneas):** Documenté el contexto del sistema (visión general, alcance y glosario) y los requisitos funcionales y no funcionales, las historias de usuario y la matriz de trazabilidad, y luego los ajusté al modelo de un solo establecimiento con pagos por QR. Diseñé los mockups HTML de las pantallas del operador en `12-ux-ui` y actualicé la gobernanza, las políticas de seguridad y las decisiones de arquitectura (ADR-007 y ADR-011 de notificaciones push).

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [9f5901e](https://github.com/code-sena/vehicle-w-docs/commit/9f5901e) | 2026-09-08 01:57:22 -0500 | docs(context): add system overview, scope and glossary |
| [dcbfaf8](https://github.com/code-sena/vehicle-w-docs/commit/dcbfaf8) | 2026-09-08 11:56:51 -0500 | docs(requirements): add functional, non-functional, user stories and traceability matrix |
| [c50bdae](https://github.com/code-sena/vehicle-w-docs/commit/c50bdae) | 2026-09-10 05:10:33 -0500 | docs(context): switch to single-establishment model and QR-based payments |
| [3c1d70e](https://github.com/code-sena/vehicle-w-docs/commit/3c1d70e) | 2026-09-10 05:28:25 -0500 | docs(context): add promotions and loyalty to MVP scope |
| [33e9313](https://github.com/code-sena/vehicle-w-docs/commit/33e9313) | 2026-09-10 05:35:20 -0500 | docs(requirements): fix payment, auth and language requirements |
| [8ff1ebb](https://github.com/code-sena/vehicle-w-docs/commit/8ff1ebb) | 2026-09-10 13:19:09 -0500 | docs(product): fix booking status literal and stale bounded context in backlog |
| [f740856](https://github.com/code-sena/vehicle-w-docs/commit/f740856) | 2026-09-10 13:31:13 -0500 | docs(architecture): update ADR-007 and overview.md |
| [c74dc64](https://github.com/code-sena/vehicle-w-docs/commit/c74dc64) | 2026-09-16 00:40:47 -0500 | docs(governance - context): modified governance and context |
| [8321e7d](https://github.com/code-sena/vehicle-w-docs/commit/8321e7d) | 2026-09-16 00:50:06 -0500 | docs(ux-ui): add Mockup structure with first operator screen folder |
| [6f75c4a](https://github.com/code-sena/vehicle-w-docs/commit/6f75c4a) | 2026-09-16 01:08:45 -0500 | docs(ux-ui): sync operator dashboard mockup with Web/features/operator/home |
| [6dc8573](https://github.com/code-sena/vehicle-w-docs/commit/6dc8573) | 2026-09-16 01:15:09 -0500 | docs(ux-ui): modified ux-ui |
| [9846fd0](https://github.com/code-sena/vehicle-w-docs/commit/9846fd0) | 2026-09-17 01:51:40 -0500 | docs(ux-ui): service history operator |
| [eac4208](https://github.com/code-sena/vehicle-w-docs/commit/eac4208) | 2026-09-17 01:52:54 -0500 | docs(ux-ui): view chedule operator |
| [dd7763f](https://github.com/code-sena/vehicle-w-docs/commit/dd7763f) | 2026-09-17 01:53:43 -0500 | docs(ux-ui): view ratings operator |
| [e0d796f](https://github.com/code-sena/vehicle-w-docs/commit/e0d796f) | 2026-09-17 01:54:47 -0500 | docs(ux-ui): view notifications operator |
| [702de83](https://github.com/code-sena/vehicle-w-docs/commit/702de83) | 2026-09-17 01:55:52 -0500 | docs(ux-ui): view assigned services operator |
| [490ab35](https://github.com/code-sena/vehicle-w-docs/commit/490ab35) | 2026-09-17 02:02:08 -0500 | docs(mockup): add README explaining operator and client share profile/settings screens |
| [ede9c3f](https://github.com/code-sena/vehicle-w-docs/commit/ede9c3f) | 2026-09-24 14:10:02 -0500 | docs(gobernance): modified documentation-rules.md |
| [d55d466](https://github.com/code-sena/vehicle-w-docs/commit/d55d466) | 2026-09-24 14:11:44 -0500 | docs(gobernance): modified microservices-documentation.md |
| [98f230a](https://github.com/code-sena/vehicle-w-docs/commit/98f230a) | 2026-09-24 14:12:35 -0500 | docs(gobernance): modified security-policy.md |
| [a6b1b77](https://github.com/code-sena/vehicle-w-docs/commit/a6b1b77) | 2026-09-24 14:13:17 -0500 | docs(gobernance): modified security-rules.md |
| [5ffb09b](https://github.com/code-sena/vehicle-w-docs/commit/5ffb09b) | 2026-09-24 14:17:39 -0500 | docs(context): modified glossary.md |
| [f209166](https://github.com/code-sena/vehicle-w-docs/commit/f209166) | 2026-09-24 14:18:18 -0500 | docs(context): modified overview.md |
| [0039885](https://github.com/code-sena/vehicle-w-docs/commit/0039885) | 2026-09-24 14:18:44 -0500 | docs(context): modified scope.md |
| [7c3c50f](https://github.com/code-sena/vehicle-w-docs/commit/7c3c50f) | 2026-09-24 14:29:20 -0500 | docs(requirements): modified functional.md |
| [bc27fae](https://github.com/code-sena/vehicle-w-docs/commit/bc27fae) | 2026-09-24 14:31:01 -0500 | docs(requirements): modified non-functional.md |
| [549a2f7](https://github.com/code-sena/vehicle-w-docs/commit/549a2f7) | 2026-09-24 14:32:46 -0500 | docs(requirements): modified traceability-matrix.md |
| [81da8e6](https://github.com/code-sena/vehicle-w-docs/commit/81da8e6) | 2026-09-24 14:33:21 -0500 | docs(requirements): modified user-stories.md |
| [2d0ecb1](https://github.com/code-sena/vehicle-w-docs/commit/2d0ecb1) | 2026-09-30 05:40:19 -0500 | docs(adr): add ADR-011 for notification push and event contract |

## 3. Repositorios del equipo

### 3.1 `vehicle-w-api`

- **Enlace:** https://github.com/code-sena/vehicle-w-api
- **Total de commits en el periodo:** 0
- **Qué hice (2 a 3 líneas):** No trabajé en este repositorio durante el periodo; no tiene commits míos.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| | | |

### 3.2 `vehicle-w-app`

- **Enlace:** https://github.com/code-sena/vehicle-w-app
- **Total de commits en el periodo:** 0
- **Qué hice (2 a 3 líneas):** No trabajé en este repositorio durante el periodo; no tiene commits míos.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| | | |

### 3.3 `vehicle-w-db`

- **Enlace:** https://github.com/code-sena/vehicle-w-db
- **Total de commits en el periodo:** 0
- **Qué hice (2 a 3 líneas):** No trabajé en este repositorio durante el periodo; no tiene commits míos.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| | | |

### 3.4 `vehicle-w-portal`

- **Enlace:** https://github.com/code-sena/vehicle-w-portal
- **Total de commits en el periodo:** 0
- **Qué hice (2 a 3 líneas):** No trabajé en este repositorio durante el periodo; no tiene commits míos.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| | | |

## 4. Verificación del aprendiz

- [x] Todos los commits listados los hice con mi cuenta (aparece mi foto de perfil en GitHub).
- [x] Incluí los commits de **todas las ramas**, no solo de `main`.
- [x] Todos los commits caen entre el 11 de agosto y el 30 de septiembre de 2026 (hora Colombia).
- [x] Cada enlace de commit abre en GitHub.
- [x] Los repositorios en los que no tengo commits quedaron en la tabla con 0.
- [x] El total de cada repositorio coincide con el número de filas de su tabla.

## 5. Observaciones

- El periodo de este informe es del 11 de agosto al 30 de septiembre de 2026, no solo agosto. Mi primer commit en `vehicle-w-docs` es del 8 de septiembre; no tengo commits en agosto en este repositorio.
- No hice commits en `vehicle-w-api`, `vehicle-w-app`, `vehicle-w-db` ni `vehicle-w-portal` durante el periodo; por eso quedan en 0. Todo mi trabajo fue de documentación en `vehicle-w-docs`.
- Los 29 commits ya están integrados en la rama `docs`; 11 de ellos también están en `main`.
- **Subí demasiado contenido en un solo commit en algunos casos.** Por ejemplo:
  - [dcbfaf8](https://github.com/code-sena/vehicle-w-docs/commit/dcbfaf8): unas 1.240 líneas con los requisitos funcionales, no funcionales, historias de usuario y matriz de trazabilidad juntos.
  - [6f75c4a](https://github.com/code-sena/vehicle-w-docs/commit/6f75c4a): unas 755 líneas del mockup del dashboard del operador en un solo commit.
  - [702de83](https://github.com/code-sena/vehicle-w-docs/commit/702de83), [e0d796f](https://github.com/code-sena/vehicle-w-docs/commit/e0d796f) y [dd7763f](https://github.com/code-sena/vehicle-w-docs/commit/dd7763f): entre 350 y 420 líneas cada uno, una pantalla completa de mockup por commit.

  Esto hace más difícil revisar los cambios y revertirlos si algo falla. Debo dividir el trabajo en commits más pequeños.
- Correo de commit: bspc1507@gmail.com. Hay que verificar en GitHub que esté vinculado a la cuenta (que aparezca la foto de perfil en el commit).

---

*Declaro que la información de este informe es veraz y que los commits listados son de mi autoría.*

**Aprendiz:** Brayan Estiven Patiño Cabrera **Fecha:** 06/10/2026
