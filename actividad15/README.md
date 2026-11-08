# JFo 7.5 y 7.6 - Actividad 15

## Sistema completo de prisión

Integra Cell, Prisoner, Guard, contador y capacidad.

### Detalles

- `Cell`: campos privados `name`, `isOpen` (false) y `securityCode` (1234); getters `getName()` y `getIsOpen()`; `setIsOpen(boolean isOpen, int code)` que muestra `Incorrect code` si el código no coincide.
- `Prisoner`: constante `public static final int MAX_PRISONER_COUNT = 100`, contador `private static int prisonerCount` con getter estático, y campos privados `name`, `cell` y `bookingNumber` (asignado en el constructor `Prisoner(String name, Cell cell)`).
- `Guard`: método `openCell(Cell cell)` que muestra `Guardia abre <celda>` y la abre con el código correcto.
- En `main`: crea las celdas A1 y B2 y los presos Bubba (A1) y Twitch (B2); muestra el total y cada reserva (`Reserva <n>: <nombre> - <celda>`); el guardia abre A1 y se muestra su estado; intenta abrir B2 con el código `1111` y muestra su estado; por último muestra la capacidad máxima.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Total: 2
Reserva 1: Bubba - A1
Reserva 2: Twitch - B2
Guardia abre A1
A1 abierta: true
Incorrect code
B2 abierta: false
Capacidad máxima: 100
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_5_7_6_actividad15/Actividad15.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad15Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
