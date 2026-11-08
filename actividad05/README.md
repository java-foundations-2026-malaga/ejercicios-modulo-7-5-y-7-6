# JFo 7.5 y 7.6 - Actividad 05

## Corrige una constante mal declarada

Declara MAX_PRISONER_COUNT como public static final.

### Detalles

- Sustituye `maxPrisonerCount` por la constante `public static final int MAX_PRISONER_COUNT = 100;` y muéstrala accediendo a través de la clase: `Prisoner.MAX_PRISONER_COUNT`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Capacidad: 100
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_5_7_6_actividad05/Actividad05.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad05Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
