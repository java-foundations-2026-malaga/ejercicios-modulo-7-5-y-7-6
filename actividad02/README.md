# JFo 7.5 y 7.6 - Actividad 02

## Corrige un setter inseguro

Exige el código antes de cambiar el estado.

### Detalles

- Añade a `Cell` el campo privado `securityCode` (1234) y un getter `getIsOpen()`.
- El método `setIsOpen(boolean isOpen, int code)` solo cambia el estado si `code` coincide con `securityCode`; si no, muestra `Incorrect code`.
- En `main` intenta abrir la celda con el código `1111`, muestra `"Abierta: " + cell.getIsOpen()`, vuelve a intentarlo con `1234` y muestra de nuevo el estado.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Incorrect code
Abierta: false
Abierta: true
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_5_7_6_actividad02/Actividad02.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad02Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
