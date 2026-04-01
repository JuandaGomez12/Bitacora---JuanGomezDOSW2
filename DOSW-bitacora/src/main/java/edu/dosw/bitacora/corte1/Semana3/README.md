# Bitacora---JuanDavidGomezCuellar_2026-1
# ¿Qué entendía mal antes?

Antes pensaba que muchos patrones de diseño eran muy parecidos entre sí y que solo cambiaban en pequeños detalles de implementación.

No tenía clara la diferencia entre patrones creacionales como Factory Method y Abstract Factory, ni entendía cuándo usar Builder en lugar de una simple construcción con múltiples parámetros.

También confundía patrones estructurales como Adapter y Bridge, creyendo que ambos simplemente conectaban cosas.

En los patrones de comportamiento, veía Strategy, Command y Chain of Responsibility como variaciones de condicionales organizados en clases, sin comprender completamente cómo reducen el acoplamiento y mejoran la extensibilidad.

En general, conocía sus definiciones, pero no entendía su intención real dentro del diseño del sistema.

---

# ¿Qué entiendo ahora?

Ahora comprendo que cada patrón resuelve un problema estructural distinto dentro del diseño de software.

Entiendo que:

- Factory Method delega la creación de objetos a subclases sin depender de implementaciones concretas.
- Abstract Factory permite crear familias de objetos relacionados sin mezclar variantes incompatibles.
- Builder construye objetos complejos paso a paso sin sobrecargar constructores.
- Adapter permite compatibilidad entre clases sin modificar su código.
- Bridge separa abstracción e implementación para evitar la explosión de combinaciones.
- Composite permite tratar objetos individuales y compuestos de forma uniforme.
- Decorator agrega responsabilidades dinámicamente sin modificar la clase base.
- Chain of Responsibility distribuye solicitudes a través de una cadena sin que el emisor conozca quién la procesa.
- Command encapsula acciones como objetos independientes.
- Iterator permite recorrer estructuras sin exponer su implementación interna.
- Strategy permite intercambiar algoritmos dinámicamente sin modificar el cliente.

Ahora entiendo que la diferencia entre patrones no está en su estructura superficial, sino en el tipo de problema de diseño que resuelven y el nivel de desacoplamiento que introducen.

---

# ¿Qué me falta reforzar?

Aunque ahora distingo mejor la intención y estructura de cada patrón, todavía necesito reforzar:

- Identificar patrones en problemas reales sin que me indiquen cuál usar.
- Comparar patrones similares como Strategy y Command, o Factory Method y Abstract Factory.
- Combinar varios patrones dentro de una misma arquitectura.
- Integrar patrones con los principios SOLID en sistemas más grandes.
- Analizar código existente y detectar qué patrón podría mejorar su diseño.
- Evitar tanto la sobreingeniería como soluciones demasiado simples que generen alto acoplamiento.