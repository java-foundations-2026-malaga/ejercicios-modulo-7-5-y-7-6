# JFo 7.5 y 7.6 - Actividad 11

## Añade un contador estático de prisioneros

Asigna contador compartido y número de reserva individual.

### Detalles

- Crea `static class Prisoner` con un campo `static int prisonerCount` (compartido por todos los objetos) y los campos de instancia privados `name` y `bookingNumber`.
- En el constructor `Prisoner(String name)` incrementa `prisonerCount` y asigna su valor a `bookingNumber`.
- Crea a Bubba y a Twitch, muestra `<nombre> reserva <bookingNumber>` para cada uno y después `"Total: " + Prisoner.prisonerCount`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Bubba reserva 1
Twitch reserva 2
Total: 2
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_5_7_6_actividad11/Actividad11.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad11Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
