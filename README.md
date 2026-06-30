# 🏞️ Llanquihue Tour App

## 📚 Desarrollo Orientado a Objetos I

### 📌 Descripción

**Llanquihue Tour App** es una aplicación desarrollada en **Java** como parte de la asignatura **Desarrollo Orientado a Objetos I**.

En esta versión del proyecto se implementa una **jerarquía simple de clases utilizando herencia**, con el objetivo de representar distintos tipos de servicios turísticos ofrecidos por la agencia Llanquihue Tour. La solución permite reutilizar atributos y comportamientos comunes mediante una superclase y especializar funcionalidades en sus subclases, facilitando la futura incorporación de nuevos servicios al sistema.

---

# 🎯 Objetivos

* Aplicar el concepto de **herencia** en Programación Orientada a Objetos.
* Diseñar una jerarquía de clases reutilizable y escalable.
* Utilizar el constructor `super(...)` para inicializar atributos heredados.
* Sobrescribir el método `toString()` en las subclases.
* Organizar el proyecto utilizando paquetes según su responsabilidad.
* Crear y mostrar instancias de prueba desde una clase gestora.

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

# 📦 Paquetes

## 📁 model

Contiene la jerarquía de clases del sistema.

### ServicioTuristico

Superclase que representa un servicio turístico genérico.

**Atributos:**

* nombre
* duracionHoras

### RutaGastronomica

Hereda de `ServicioTuristico`.

**Atributo adicional:**

* numeroDeParadas

### PaseoLacustre

Hereda de `ServicioTuristico`.

**Atributo adicional:**

* tipoEmbarcacion

### ExcursionCultural

Hereda de `ServicioTuristico`.

**Atributo adicional:**

* lugarHistorico

---

## 📁 data

### GestorServicios

Clase encargada de crear las instancias de prueba de los diferentes servicios turísticos y mostrarlas por consola.

---

## 📁 ui

### Main

Clase principal que ejecuta la aplicación e inicia la demostración del sistema.

---

# 🧬 Jerarquía de Herencia

```text
                 ServicioTuristico
                /        |         \
               /         |          \
              /          |           \
RutaGastronomica  PaseoLacustre  ExcursionCultural
```

La superclase **ServicioTuristico** concentra los atributos y comportamientos comunes, mientras que cada subclase incorpora información específica de acuerdo con el tipo de servicio turístico.

---

# ⚙️ Funcionalidades

* Implementación de una jerarquía de clases mediante herencia.
* Uso del constructor `super(...)` para inicializar atributos heredados.
* Sobrescritura del método `toString()` en todas las subclases.
* Creación de dos objetos de cada tipo de servicio turístico.
* Visualización de la información completa mediante consola.
* Organización modular del proyecto utilizando paquetes.

---

# ▶️ Ejecución del Proyecto

1. Clonar o descargar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA.
3. Verificar que la estructura de paquetes sea correcta.
4. Ejecutar la clase:

```java
ui.Main
```

5. Observar en la consola la información correspondiente a cada servicio turístico creado.

---

# 🖥️ Ejemplo de Salida

```text
================================
LLANQUIHUE TOUR APP
Servicios Turísticos
================================

Servicio Turístico
Nombre: Ruta Cervecera
Duración: 5 horas
Tipo: Ruta Gastronómica
Número de paradas: 6

---------------------

Servicio Turístico
Nombre: Lago Llanquihue
Duración: 3 horas
Tipo: Paseo Lacustre
Embarcación: Catamarán

---------------------

Servicio Turístico
Nombre: Frutillar Colonial
Duración: 4 horas
Tipo: Excursión Cultural
Lugar histórico: Museo Colonial Alemán
```

---

# 💻 Tecnologías Utilizadas

* Java
* IntelliJ IDEA
* Programación Orientada a Objetos (POO)
* Herencia
* Sobrescritura de métodos (`@Override`)
* Encapsulamiento
* Organización por paquetes

---

# 📋 Competencias Desarrolladas

* Diseño de jerarquías de clases.
* Reutilización de código mediante herencia.
* Especialización de comportamientos.
* Organización modular de proyectos Java.
* Aplicación de buenas prácticas de Programación Orientada a Objetos.

---

# 👨‍🎓 Autor

**Gonzalo Bravo Alliende**

Analista Programador Computacional

Desarrollo Orientado a Objetos I

Duoc UC

---

# 📄 Licencia

Proyecto desarrollado con fines exclusivamente académicos como parte de la asignatura **Desarrollo Orientado a Objetos I**.
