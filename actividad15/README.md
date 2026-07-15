# JFo 7.5 y 7.6 - Actividad 15

## Sistema completo de prisión

Integra Cell, Prisoner, Guard, contador y capacidad.

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

- El workflow `Java CI` ejecuta automáticamente `mvn test` en cada push.
