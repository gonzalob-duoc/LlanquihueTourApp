# 🏞️ Llanquihue Tour App

## 📚 Desarrollo Orientado a Objetos I

### 👨‍🎓 Autor

* **Nombre:** Gonzalo Bravo Alliende
* **Asignatura:** Desarrollo Orientado a Objetos I
* **Carrera:** Analista Programador
* **Institución:** Duoc UC

---

# 📌 Descripción del Proyecto

**Llanquihue Tour App** es una aplicación desarrollada en Java que representa un sistema de gestión de servicios turísticos para la agencia **Llanquihue Tour**.

En esta etapa del proyecto se incorporan los conceptos de **herencia**, **polimorfismo** y **colecciones genéricas**, permitiendo almacenar distintos tipos de servicios turísticos dentro de una misma colección y recorrerlos de forma dinámica utilizando referencias de la superclase.

La solución está diseñada para ser escalable, facilitando la incorporación de nuevos tipos de servicios turísticos sin modificar la lógica principal del sistema.

---

# 🎯 Objetivos

* Aplicar el principio de **herencia** mediante una jerarquía de clases.
* Implementar **polimorfismo** utilizando referencias de la superclase.
* Utilizar **colecciones genéricas** (`List`) para almacenar diferentes objetos.
* Sobrescribir métodos mediante la anotación `@Override`.
* Organizar el proyecto utilizando paquetes según su responsabilidad.
* Generar una salida clara y ordenada por consola.

---

# 🏗️ Estructura del Proyecto

```text
LlanquihueTourApp
│
├── src
│
├── model
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
│
├── data
│   └── GestorServicios.java
│
└── ui
    └── Main.java
```

---

# 📦 Descripción de los Paquetes

## 📁 model

Contiene la jerarquía de clases del sistema.

### ServicioTuristico

Superclase que representa un servicio turístico genérico.

**Atributos**

* nombre
* duracionHoras

**Métodos principales**

* mostrarInformacion()
* getters y setters
* constructor

---

### RutaGastronomica

Hereda de **ServicioTuristico**.

**Atributo propio**

* numeroDeParadas

Sobrescribe el método:

```java
mostrarInformacion()
```

---

### PaseoLacustre

Hereda de **ServicioTuristico**.

**Atributo propio**

* tipoEmbarcacion

Sobrescribe el método:

```java
mostrarInformacion()
```

---

### ExcursionCultural

Hereda de **ServicioTuristico**.

**Atributo propio**

* lugarHistorico

Sobrescribe el método:

```java
mostrarInformacion()
```

---

## 📁 data

### GestorServicios

Clase responsable de administrar los servicios turísticos.

Funciones principales:

* Crear la colección `List<ServicioTuristico>`.
* Agregar objetos de distintos tipos.
* Entregar la colección para su recorrido.

---

## 📁 ui

### Main

Clase principal del sistema.

Desde esta clase se:

* instancia el gestor;
* obtiene la colección de servicios;
* recorre la lista utilizando un `for-each`;
* invoca el método `mostrarInformacion()` de forma polimórfica.

---

# 🧬 Diagrama de Herencia

```text
                    ServicioTuristico
                           │
        ┌──────────────────┼──────────────────┐
        │                  │                  │
        │                  │                  │
RutaGastronomica    PaseoLacustre    ExcursionCultural
```

Todas las subclases reutilizan los atributos comunes definidos en **ServicioTuristico** y especializan su comportamiento mediante la sobrescritura del método `mostrarInformacion()`.

---

# 🔄 Polimorfismo

El proyecto implementa polimorfismo utilizando una colección del tipo:

```java
List<ServicioTuristico>
```

Dentro de esta colección se almacenan objetos de diferentes subclases:

* RutaGastronomica
* PaseoLacustre
* ExcursionCultural

Al recorrer la colección, el sistema invoca automáticamente el método `mostrarInformacion()` correspondiente al tipo real de cada objeto, sin necesidad de utilizar `instanceof`.

---

# ⚙️ Funcionalidades

✅ Implementación de una jerarquía de clases mediante herencia.

✅ Sobrescritura del método `mostrarInformacion()`.

✅ Uso de la anotación `@Override`.

✅ Colección genérica `List<ServicioTuristico>`.

✅ Almacenamiento de diferentes tipos de servicios turísticos.

✅ Recorrido de la colección mediante `for-each`.

✅ Aplicación de polimorfismo en tiempo de ejecución.

✅ Organización del proyecto por paquetes.

---

# ▶️ Cómo Ejecutar el Proyecto

## Requisitos

* Java JDK 17 o superior.
* IntelliJ IDEA.

## Pasos

1. Clonar o descargar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA.
3. Esperar la indexación del proyecto.
4. Ejecutar la clase:

```text
ui.Main
```

5. Observar la salida generada en la consola.

---

# 🖥️ Ejemplo de Salida

```text
=====================================
LLANQUIHUE TOUR APP
POLIMORFISMO
=====================================

===== RUTA GASTRONÓMICA =====
Nombre: Ruta Cervecera
Duración: 5 horas
Número de paradas: 6

===== PASEO LACUSTRE =====
Nombre: Lago Llanquihue
Duración: 3 horas
Embarcación: Catamarán

===== EXCURSIÓN CULTURAL =====
Nombre: Frutillar Colonial
Duración: 4 horas
Lugar histórico: Museo Colonial Alemán
```

---

# 💻 Tecnologías Utilizadas

* Java
* IntelliJ IDEA
* Programación Orientada a Objetos (POO)
* Herencia
* Polimorfismo
* Sobrescritura de métodos
* Colecciones Genéricas (`List`)
* Encapsulamiento
* Organización modular mediante paquetes

---

# 📖 Conceptos Aplicados

* Clases y objetos.
* Herencia.
* Sobrescritura de métodos (`@Override`).
* Polimorfismo.
* Referencias a la superclase.
* Colecciones genéricas (`List`).
* Recorrido mediante `for-each`.
* Organización modular del código.

---

# 📈 Posibles Mejoras Futuras

* Lectura de servicios desde archivos `.txt` o `.csv`.
* Persistencia en bases de datos.
* Interfaz gráfica con Swing.
* Gestión de reservas de clientes.
* Registro de guías turísticos y operadores.
* Filtros por duración, tipo de servicio y precio.
* Integración con sistemas de reportes.

---

# 📄 Licencia

Este proyecto fue desarrollado exclusivamente con fines académicos como parte de la asignatura **Desarrollo Orientado a Objetos I**.
