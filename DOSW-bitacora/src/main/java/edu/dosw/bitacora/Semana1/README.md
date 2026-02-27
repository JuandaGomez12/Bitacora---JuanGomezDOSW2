# Bitacora---JuanDavidGomezCuellar_2026-1
# Reflexión – Programación Funcional con Streams

---

## ¿Qué entendía mal antes?

Antes pensaba que la programación funcional con Streams era únicamente una forma más corta o moderna de escribir ciclos for, y que su propósito principal era hacer el código más compacto. Creía que métodos como filter() y map() eran simplemente equivalentes a usar un if y modificar elementos dentro de un bucle tradicional, sin entender realmente el cambio de paradigma que implican.


### Ejemplo 

```java
List<Integer> numeros = Arrays.asList(1,2,3,4,5);
List<Integer> resultado = new ArrayList<>();

for(Integer n : numeros){
    if(n % 2 == 0){
        resultado.add(n * 2);
    }
    
}

```

---

## ¿Qué entiendo ahora?

Ahora comprendo que la programación funcional con Streams representa un enfoque, donde se expresa qué se quiere lograr y no cómo paso a paso se debe ejecutar.

Entiendo que los Streams:

- No modifican la colección original.
- Separan operaciones intermedias (filter(), map()) de operaciones terminales (collect()).
- Permiten encadenamiento de operaciones.
- Promueven la inmutabilidad

# Operaciones Intermedias

Son aquellas que devuelven otro Stream y no ejecutan nada hasta que exista una operación terminal.

- filter(Predicate)
- map(Function)
- flatMap(Function)
- distinct()
- sorted()
- limit(long n)
- skip(long n)
- peek(Consumer)

---

# Operaciones Terminales

Son las que activan la ejecución del Stream y producen un resultado final.

- collect(Collector)
- forEach(Consumer)
- forEachOrdered(Consumer)
- count()
- reduce(...)
- anyMatch(Predicate)
- allMatch(Predicate)
- noneMatch(Predicate)
- findFirst()
- findAny()
- min(Comparator)
- max(Comparator)
- toArray()

Este enfoque permite escribir código más limpio, legible y alineado con principios funcionales.

### Ejemplo con Streams

```java
List<Integer> resultado = numeros.stream()
    .filter(n -> n % 2 == 0)
    .map(n -> n * 2)
    .collect(Collectors.toList());
```



---

## ¿Qué me falta reforzar?

Aunque ahora tengo una mejor comprensión del tema aplicado a Streams, todavía necesito reforzar:

- El uso de operaciones más avanzadas como reduce().
- El criterio para decidir cuándo usar Streams y cuándo no.
- La escritura de expresiones lambda más complejas.


### Ejemplo con reduce()

```java
int suma = numeros.stream()
    .reduce(0, (a, b) -> a + b);
```
