# JFo 7.5 y 7.6 - Actividad 09

## Crea una clase Guard

Delega la apertura segura en Guard.

### Detalles

- Reutiliza la `Cell` de la actividad anterior (campos privados `name`, `isOpen`, `securityCode` = 1234, getters `getName()` y `getIsOpen()` y `setIsOpen(boolean isOpen, int code)`).
- Crea una clase `static class Guard` con un método `openCell(Cell cell)` que muestre `Guardia intenta abrir <nombre de la celda>` y abra la celda con el código correcto.
- En `main` crea la celda A1 y un guardia, pide al guardia que la abra y muestra `"Abierta: " + cell.getIsOpen()`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Guardia intenta abrir A1
Abierta: true
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_5_7_6_actividad09/Actividad09.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad09Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
