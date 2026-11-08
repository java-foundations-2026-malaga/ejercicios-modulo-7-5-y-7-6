# JFo 7.5 y 7.6 - Actividad 14

## Crea una constante de capacidad máxima

Impide incrementar el contador al superar el máximo.

### Detalles

- Crea `static class Prisoner` con la constante `public static final int MAX_PRISONER_COUNT = 100` y el contador `static int prisonerCount`.
- En el constructor, incrementa el contador solo si es menor que `MAX_PRISONER_COUNT`; si ya se ha alcanzado, muestra `Capacidad máxima alcanzada`.
- En `main` muestra la capacidad máxima, crea 100 presos con un bucle, muestra `"Prisioneros: " + Prisoner.prisonerCount` y después intenta crear un preso más.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Capacidad máxima: 100
Prisioneros: 100
Capacidad máxima alcanzada
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_5_7_6_actividad14/Actividad14.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad14Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
