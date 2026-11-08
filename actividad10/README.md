# JFo 7.5 y 7.6 - Actividad 10

## Encapsula Prisoner

Convierte los campos en privados y usa accesores seguros.

### Detalles

- Crea `static class Cell` con el campo privado `name` y su getter `getName()`.
- Crea `static class Prisoner` con los campos **privados** `name` (String), `height` (double), `sentence` (int) y `cell` (Cell), un constructor con los cuatro datos y un getter para cada campo.
- Crea el preso Bubba (1.75, 4, celda A1) y muestra sus datos usando **solo** los getters, con el formato `nombre: altura, condena, celda`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Bubba: 1.75, 4, A1
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_5_7_6_actividad10/Actividad10.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad10Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
