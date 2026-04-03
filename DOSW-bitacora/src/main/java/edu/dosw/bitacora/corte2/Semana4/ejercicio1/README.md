# Refuerzo – Análisis de Requerimientos (Parte 1)
## Escenario: Plataforma de Batallas Bakugan

---

## 1. Identificación de Requerimientos

### Requerimientos Explícitos
| ID | Descripción |
|----|-------------|
| REQ-01 | Los usuarios pueden coleccionar criaturas Bakugan |
| REQ-02 | Los usuarios pueden mejorar sus criaturas |
| REQ-03 | Los usuarios pueden enfrentarse en combates estratégicos |
| REQ-04 | El sistema debe incluir mecánicas de progresión |
| REQ-05 | El sistema debe gestionar el inventario de criaturas |
| REQ-06 | Los combates no requieren ser en tiempo real |
| REQ-07 | Los resultados de los combates deben ser consistentes |
| REQ-08 | El sistema debe balancear criaturas y habilidades |
| REQ-09 | El sistema debe permitir emparejamientos justos entre jugadores |
| REQ-10 | El sistema debe persistir la información de las partidas |

### Requerimientos Implícitos (supuestos razonables)
| ID | Descripción |
|----|-------------|
| REQ-11 | El sistema debe permitir registro e inicio de sesión de usuarios |
| REQ-12 | El sistema debe gestionar perfiles de usuario |
| REQ-13 | El sistema debe proteger los datos de los usuarios |
| REQ-14 | El sistema debe ser accesible desde un navegador web |
| REQ-15 | El sistema debe permitir visualizar el historial de combates |
| REQ-16 | El sistema debe notificar al jugador sobre resultados de combate |
| REQ-17 | El sistema debe permitir la evolución o escalabilidad futura (rankings, eventos, cooperativo) |
| REQ-18 | El sistema debe tener disponibilidad suficiente para no perder partidas en curso |

---

## 2. Clasificación de Requerimientos

| ID | Tipo | Justificación |
|----|------|---------------|
| REQ-01 | Funcional | Define una acción directa que el sistema debe ejecutar |
| REQ-02 | Funcional | Representa una funcionalidad de negocio core del sistema |
| REQ-03 | Funcional | Es el flujo principal de interacción entre usuarios |
| REQ-04 | Funcional | Implica lógica de negocio para gestionar niveles y avances |
| REQ-05 | Funcional | Requiere operaciones CRUD sobre el inventario del usuario |
| REQ-06 | No funcional | Define una restricción sobre el modo de operación del combate |
| REQ-07 | No funcional | Define consistencia, que es una propiedad de calidad del sistema |
| REQ-08 | No funcional | Se refiere al balance, una propiedad de diseño del juego |
| REQ-09 | Funcional | Implica un algoritmo de emparejamiento que el sistema debe ejecutar |
| REQ-10 | No funcional | Se refiere a la persistencia, una característica de la infraestructura |
| REQ-11 | Funcional | Autenticación es una funcionalidad del sistema |
| REQ-12 | Funcional | Gestión de perfiles es una funcionalidad del sistema |
| REQ-13 | No funcional | Seguridad es una propiedad de calidad |
| REQ-14 | No funcional | Accesibilidad web es una restricción de plataforma |
| REQ-15 | Funcional | Consultar historial es una operación del sistema |
| REQ-16 | Funcional | Notificaciones son una funcionalidad del sistema |
| REQ-17 | No funcional | Escalabilidad es una propiedad de arquitectura |
| REQ-18 | No funcional | Disponibilidad es una propiedad de calidad del sistema |

---

## 3. Redacción Correcta de Requerimientos

| ID | Requerimiento redactado |
|----|------------------------|
| REQ-01 | El sistema debe permitir a los usuarios adquirir y almacenar criaturas Bakugan en su colección personal |
| REQ-02 | El sistema debe permitir a los usuarios mejorar los atributos de sus criaturas mediante recursos o puntos obtenidos en el juego |
| REQ-03 | El sistema debe permitir a dos jugadores enfrentarse en combates estratégicos por turno |
| REQ-04 | El sistema debe registrar el progreso del jugador, incluyendo nivel, experiencia y logros obtenidos |
| REQ-05 | El sistema debe permitir al jugador visualizar, organizar y gestionar su inventario de criaturas y objetos |
| REQ-06 | El sistema debe procesar los combates de forma asincrónica, sin requerir que ambos jugadores estén conectados simultáneamente |
| REQ-07 | El sistema debe garantizar que el resultado de un combate sea determinista dado el mismo estado de entrada |
| REQ-08 | El sistema debe aplicar un mecanismo de balance que evite que una criatura o habilidad domine sobre todas las demás de forma sistemática |
| REQ-09 | El sistema debe emparejar jugadores con niveles o puntuaciones similares, con una diferencia máxima definida por el sistema |
| REQ-10 | El sistema debe persistir el estado de todas las partidas de forma que no se pierda información ante fallos o reinicios |
| REQ-11 | El sistema debe permitir el registro de nuevos usuarios y la autenticación mediante correo y contraseña |
| REQ-12 | El sistema debe permitir al usuario visualizar y editar su perfil, incluyendo nombre, avatar y estadísticas |
| REQ-13 | El sistema debe cifrar las contraseñas de los usuarios y proteger los datos personales conforme a buenas prácticas de seguridad |
| REQ-14 | El sistema debe ser accesible desde los navegadores Chrome, Firefox y Edge en sus versiones más recientes |
| REQ-15 | El sistema debe permitir al usuario consultar el historial de sus últimos 50 combates con resultado y detalle |
| REQ-16 | El sistema debe notificar al jugador cuando reciba un desafío de combate o cuando se resuelva un combate pendiente |
| REQ-17 | El sistema debe estar diseñado con una arquitectura que permita incorporar nuevos módulos (rankings, eventos, cooperativo) sin rediseño estructural |
| REQ-18 | El sistema debe tener una disponibilidad mínima del 99% mensual |

---

## 4. Priorización

| ID | Prioridad | Criterio |
|----|-----------|---------|
| REQ-11 | Alta | Sin autenticación no hay acceso al sistema; bloquea todo lo demás |
| REQ-01 | Alta | Es el core del negocio; sin colección no hay juego |
| REQ-03 | Alta | Es la funcionalidad principal y generadora de valor |
| REQ-10 | Alta | Sin persistencia se pierde toda la información del juego |
| REQ-05 | Alta | El inventario es necesario para cualquier acción del jugador |
| REQ-07 | Alta | La consistencia es crítica para la confianza del jugador en el sistema |
| REQ-02 | Media | Enriquece la experiencia pero puede lanzarse en una segunda versión |
| REQ-04 | Media | La progresión aumenta retención pero no es bloqueante para el MVP |
| REQ-09 | Media | Importante para la experiencia justa, pero puede comenzar con emparejamiento básico |
| REQ-12 | Media | El perfil mejora la experiencia pero no es esencial para el MVP |
| REQ-15 | Media | El historial aporta valor pero no bloquea la funcionalidad core |
| REQ-08 | Media | El balance es importante pero puede ajustarse iterativamente |
| REQ-13 | Alta | La seguridad de datos es obligatoria desde el inicio |
| REQ-16 | Baja | Las notificaciones mejoran la UX pero pueden agregarse después |
| REQ-14 | Media | La compatibilidad web es necesaria pero puede refinarse post-lanzamiento |
| REQ-17 | Baja | La escalabilidad futura es deseable pero no urgente |
| REQ-18 | Media | La disponibilidad es importante pero puede escalar con el crecimiento |
| REQ-06 | Media | El modo asincrónico es una característica diferenciadora pero no bloqueante |

---

## 5. Dependencias y Bloqueos

| ID | Depende de | Posible bloqueo |
|----|-----------|-----------------|
| REQ-01 | REQ-11 | Sin autenticación no se puede asociar una colección a un usuario |
| REQ-02 | REQ-01 | No se puede mejorar lo que no se tiene |
| REQ-03 | REQ-01, REQ-05 | No hay combate sin jugadores autenticados ni sin criaturas |
| REQ-04 | REQ-03 | La progresión depende de que existan combates |
| REQ-05 | REQ-01 | El inventario es propio de cada usuario autenticado |
| REQ-09 | REQ-11, REQ-04 | El emparejamiento justo requiere datos de nivel o puntuación del jugador |
| REQ-15 | REQ-03, REQ-10 | El historial requiere que los combates existan y estén persistidos |
| REQ-16 | REQ-03, REQ-11 | Las notificaciones dependen de combates y de usuarios registrados |
| REQ-08 | REQ-02 | El balance depende de los atributos definidos en las mejoras |
| REQ-17 | Todos | La escalabilidad depende de que la arquitectura base esté bien diseñada desde el inicio |

---

## 6. Matriz de Trazabilidad

| ID | Tipo | Módulo / Caso de uso | Posible prueba o validación |
|----|------|----------------------|-----------------------------|
| REQ-01 | Funcional | Módulo de Colección | Verificar que una criatura adquirida aparece en el inventario del usuario |
| REQ-02 | Funcional | Módulo de Mejoras | Verificar que los atributos de una criatura aumentan tras aplicar una mejora |
| REQ-03 | Funcional | Módulo de Combate | Simular un combate entre dos jugadores y validar que se genera un resultado |
| REQ-04 | Funcional | Módulo de Progresión | Verificar que el nivel del jugador aumenta tras ganar combates |
| REQ-05 | Funcional | Módulo de Inventario | Verificar que el jugador puede ver, filtrar y organizar sus criaturas |
| REQ-06 | No funcional | Módulo de Combate | Verificar que un combate se resuelve aunque uno de los jugadores esté desconectado |
| REQ-07 | No funcional | Motor de Combate | Ejecutar el mismo combate con los mismos parámetros dos veces y verificar igual resultado |
| REQ-08 | No funcional | Motor de Balance | Analizar estadísticas de victoria por criatura y verificar que ninguna supera el umbral definido |
| REQ-09 | Funcional | Módulo de Emparejamiento | Verificar que los jugadores emparejados tienen puntuaciones dentro del rango permitido |
| REQ-10 | No funcional | Base de datos / Persistencia | Reiniciar el sistema y verificar que todas las partidas siguen intactas |
| REQ-11 | Funcional | Módulo de Autenticación | Verificar registro exitoso y acceso con credenciales válidas; rechazo con credenciales inválidas |
| REQ-12 | Funcional | Módulo de Perfil | Verificar que los cambios en el perfil se guardan y reflejan correctamente |
| REQ-13 | No funcional | Seguridad | Verificar que las contraseñas están hasheadas en base de datos |
| REQ-14 | No funcional | Frontend | Ejecutar pruebas de compatibilidad en Chrome, Firefox y Edge |
| REQ-15 | Funcional | Módulo de Historial | Verificar que se muestran los últimos 50 combates con su detalle |
| REQ-16 | Funcional | Módulo de Notificaciones | Verificar que el jugador recibe notificación al ser desafiado o al resolverse un combate |
| REQ-17 | No funcional | Arquitectura | Revisar que el diseño sigue principios de módulos independientes y bajo acoplamiento |
| REQ-18 | No funcional | Infraestructura | Monitorear uptime mensual y verificar que se mantiene en o por encima del 99% |

---

## 7. Análisis de Ambigüedades

### Ambigüedad 1 – "Mejorar criaturas"
**Fragmento:** *"los usuarios puedan coleccionar criaturas, mejorarlas"*

**Problema:** No se especifica cómo se mejoran las criaturas. ¿Es mediante recursos del juego, puntos de experiencia, dinero virtual, ítems especiales? ¿Las mejoras son permanentes o temporales?

**Validación requerida:** Definir el mecanismo de mejora, los recursos necesarios y si existe un límite de mejora por criatura.

---

### Ambigüedad 2 – "Emparejamientos justos"
**Fragmento:** *"La posibilidad de hacer emparejamientos justos entre jugadores"*

**Problema:** No se define qué es "justo". ¿Se basa en nivel, puntuación ELO, tipo de criaturas, cantidad de victorias? Tampoco se especifica si el emparejamiento es automático o si el jugador elige a su oponente.

**Validación requerida:** Definir el algoritmo o criterio de emparejamiento y si el jugador tiene control sobre a quién enfrenta.

---

### Ambigüedad 3 – "Consistencia en los resultados"
**Fragmento:** *"deben mantener consistencia en los resultados"*

**Problema:** No queda claro si significa que el combate es determinista (mismo resultado para mismos inputs), o que los resultados se guardan correctamente sin contradicciones, o ambas cosas.

**Validación requerida:** Aclarar si el combate tiene componente aleatorio (dados, probabilidades) o es completamente determinista, y cómo se garantiza la consistencia en ambos casos.

---

### Ambigüedad 4 – Funcionalidades futuras sin claridad
**Fragmento:** *"más adelante podrían integrarse funcionalidades como eventos especiales, rankings y modos cooperativos, pero aún no hay claridad sobre estos"*

**Problema:** No hay definición de alcance. Esto afecta decisiones de arquitectura que deben tomarse ahora (¿diseñar para soportarlos o ignorarlos?).

**Validación requerida:** Acotar qué funcionalidades futuras son prioritarias para definir si deben influir en el diseño actual del sistema.
