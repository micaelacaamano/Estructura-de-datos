# Estructura de Datos  

## Primer Parcial – Lista Doblemente Enlazada

## Descripción
Este repositorio contiene la resolución del **Primer Parcial de la materia Estructura de Datos**, donde se trabaja con una **lista doblemente enlazada** implementada a partir de una estructura de nodos.

El objetivo del parcial fue aplicar conceptos fundamentales como **inserción condicional**, **recorrido de listas**, **eliminación de nodos** y **manipulación de enlaces**, respetando el correcto encadenamiento entre nodos.

---

## 🧱 Estructura del Nodo
La lista se basa en la siguiente estructura:

```java
class Nodo {
    int info;
    Nodo ant, sig;
}
```
---

### Consigna del Parcial

## 1️⃣ Inserción condicional de nodos

Implementar un método que reciba dos valores enteros:
void insertar(int x1, int x2)
Si la lista tiene exactamente 4 nodos, los valores se insertan al final.
En cualquier otro caso, se insertan al principio de la lista.

Prueba del método:

lg.insertar(10,20);
lg.insertar(5,8);
lg.insertar(200,4);
lg.insertar(1,2);
lg.imprimir();

Salida esperada:

1 - 2 - 5 - 8 - 10 - 20 - 200 - 4

### 2️⃣ Suma de nodos en posiciones impares

Sumar todos los nodos que se encuentren en posiciones impares de la lista
(primer nodo, tercer nodo, quinto, etc.) y mostrar el resultado por pantalla.


### 3️⃣ Eliminación del primer y último nodo

Eliminar el primer y el último nodo de la lista, manteniendo correctamente los enlaces.

Si la lista tiene uno o dos nodos, se eliminan todos.


### 4️⃣ Intercambio del primer y último nodo

Intercambiar el primer nodo con el último, modificando únicamente los enlaces
(es decir, intercambiar direcciones y referencias, no solo los valores).


### 5️⃣ Eliminación de nodos repetidos

Eliminar todos los nodos cuyo valor coincida con el valor del primer nodo,
sin eliminar el primer nodo de la lista.

---

### ⚠️ Aclaración Importante

✔️ Se cumplieron todas las consignas solicitadas

❌ Excepto la consigna número 4, correspondiente al intercambio del primer nodo con el ultimo de la lista.


El resto de los métodos funcionan correctamente y cumplen con los criterios establecidos en el examen.

---

### Criterios de Evaluación

Para aprobar el examen se requería alcanzar al menos un 60% de cumplimiento de la consigna total.
