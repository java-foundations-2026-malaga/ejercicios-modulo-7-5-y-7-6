# JFo 7.5 y 7.6 - Actividad 07

## Crea una clase Prisoner con referencia a Cell

Incluye la celda y muestra su nombre mediante getter.

### Detalles

- Crea `static class Cell` con el campo privado `name`, constructor `Cell(String name)` y getter `getName()`.
- Crea `static class Prisoner` con los campos privados `name` y `Cell cell`, constructor `Prisoner(String name, Cell cell)` y getters `getName()` y `getCell()`.
- Crea la celda A1 y el preso Bubba en esa celda y muestra `"Bubba - Celda "` seguido del nombre de su celda, obtenido con `getCell().getName()`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Bubba - Celda A1
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_5_7_6_actividad07/Actividad07.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad07Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
