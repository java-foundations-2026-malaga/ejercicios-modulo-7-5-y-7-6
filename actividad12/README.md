# JFo 7.5 y 7.6 - Actividad 12

## Crea un getter estático para el contador

Consulta el contador antes y después de crear objetos.

### Detalles

- Crea `static class Prisoner` con el contador `private static int prisonerCount`, que el constructor incrementa, y un getter estático `public static int getPrisonerCount()`.
- En `main` muestra `"Antes: " + Prisoner.getPrisonerCount()`, crea dos presos y muestra `"Después: " + Prisoner.getPrisonerCount()`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Antes: 0
Después: 2
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_5_7_6_actividad12/Actividad12.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad12Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
