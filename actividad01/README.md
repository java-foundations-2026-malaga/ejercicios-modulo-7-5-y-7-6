# JFo 7.5 y 7.6 - Actividad 01

## Corrige acceso directo a campos privados

Usa getters para consultar Cell.

### Detalles

- Ten en cuenta que, al ser `Cell` una clase anidada, Java permite acceder a sus campos privados desde `main`, pero eso rompe la encapsulación: consulta los datos **solo** a través de `getName()` y `getIsOpen()`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Celda: A1
Abierta: false
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_5_7_6_actividad01/Actividad01.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad01Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
