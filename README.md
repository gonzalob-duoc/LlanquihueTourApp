# 🏞️ Llanquihue Tour App

## 📚 Desarrollo Orientado a Objetos I

### 👨‍🎓 Autor

* **Nombre:** Gonzalo Bravo Alliende
* **Asignatura:** Desarrollo Orientado a Objetos I
* **Carrera:** Analista Programador Computacional

---

# 📌 Descripción

**Llanquihue Tour App** es un proyecto desarrollado en Java que simula un sistema de gestión para una agencia de turismo.

A lo largo de las distintas actividades de la asignatura, el sistema ha evolucionado incorporando conceptos fundamentales de la Programación Orientada a Objetos, como encapsulamiento, herencia, polimorfismo, interfaces, colecciones genéricas y una interfaz gráfica básica.

En esta versión se implementa una interfaz común para todas las entidades administradas por la agencia, permitiendo tratarlas de forma unificada mediante polimorfismo y diferenciarlas dinámicamente utilizando el operador `instanceof`. Además, se incorpora una interfaz gráfica sencilla con `JOptionPane` para facilitar el ingreso de información por parte del usuario.

---

# 🎯 Objetivos

* Aplicar interfaces en Java.
* Implementar herencia mediante una superclase abstracta.
* Utilizar polimorfismo con referencias a una interfaz.
* Almacenar objetos de distintos tipos en una colección genérica.
* Identificar tipos de objetos mediante `instanceof`.
* Crear una interfaz gráfica simple utilizando `JOptionPane`.
* Mantener una arquitectura organizada y escalable.

---

# 🏗️ Estructura del Proyecto

```text
LlanquihueTourApp
│
├── src
│
├── model
│   ├── Registrable.java
│   ├── RecursoAgencia.java
│   ├── GuiaTuristico.java
│   ├── Vehiculo.java
│   ├── ColaboradorExterno.java
│   │
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
│
├── data
│   └── GestorEntidades.java
│
└── ui
    └── Main.java
```

---

# 🧬 Arquitectura

## Interfaz

```text
Registrable
```

Define el comportamiento común mediante el método:

* `mostrarResumen()`

---

## Superclase

```text
RecursoAgencia
```

Contiene los atributos comunes para todas las entidades administradas por la agencia.

---

## Subclases

* GuiaTuristico
* Vehiculo
* ColaboradorExterno

Cada una implementa su propia versión de `mostrarResumen()` mediante sobrescritura (`@Override`).

---

# 📊 Nueva Jerarquía implementada en el Sistema

```text
                   Registrable
                        ▲
                        │
               RecursoAgencia
        ┌────────────┼────────────┐
        │            │            │
        │            │            │
 GuiaTuristico   Vehiculo   ColaboradorExterno
```

---

# 🔄 Polimorfismo

Todas las entidades se almacenan en una misma colección:

```java
ArrayList<Registrable>
```

Esto permite recorrer los objetos sin importar su tipo concreto.

Durante el recorrido, Java ejecuta automáticamente el método `mostrarResumen()` correspondiente a cada clase.

---

# 🔍 Uso de instanceof

El operador `instanceof` permite identificar el tipo específico de cada objeto durante la ejecución para aplicar comportamientos particulares.

Ejemplo:

* GuiaTuristico
* Vehiculo
* ColaboradorExterno

---

# 🖥️ Interfaz Gráfica

La aplicación incorpora una interfaz básica desarrollada con `JOptionPane`.

Permite:

* Registrar un guía turístico.
* Registrar un vehículo.
* Crear objetos de manera interactiva.
* Mostrar un mensaje de confirmación.
* Visualizar el resultado mediante consola.

---

# ⚙️ Funcionalidades

✅ Herencia.

✅ Interfaces.

✅ Polimorfismo.

✅ Sobrescritura de métodos.

✅ Colecciones genéricas (`ArrayList`).

✅ Uso de `instanceof`.

✅ GUI con `JOptionPane`.

✅ Organización modular por paquetes.

---

# ▶️ Ejecución

## Requisitos

* Java JDK 17 o superior.
* IntelliJ IDEA.

## Pasos

1. Clonar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA.
3. Ejecutar la clase:

```text
ui.Main
```

4. Ingresar los datos solicitados por la interfaz gráfica.
5. Observar la salida en consola.

---

# 💻 Tecnologías

* Java
* IntelliJ IDEA
* Programación Orientada a Objetos
* Interfaces
* Herencia
* Polimorfismo
* Colecciones Genéricas
* JOptionPane

---

# 📄 Licencia

Proyecto desarrollado con fines exclusivamente académicos para la asignatura **Desarrollo Orientado a Objetos I** de **Duoc UC**.
