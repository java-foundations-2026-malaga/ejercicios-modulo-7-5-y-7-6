# JFo 7.5 y 7.6 - Interacción, encapsulación y miembros estáticos

Esta carpeta contiene 15 actividades autocorregibles.

## Actividades

01. Corrige acceso directo a campos privados
02. Corrige un setter inseguro
03. Corrige un método estático que usa campos de instancia
04. Corrige acceso a variable estática desde objeto
05. Corrige una constante mal declarada
06. Crea una clase Cell encapsulada
07. Crea una clase Prisoner con referencia a Cell
08. Crea apertura de puerta con código
09. Crea una clase Guard
10. Encapsula Prisoner
11. Añade un contador estático de prisioneros
12. Crea un getter estático para el contador
13. Demuestra diferencia entre variable estática e instancia
14. Crea una constante de capacidad máxima
15. Sistema completo de prisión

Cada subcarpeta `actividadNN` es un proyecto Maven independiente con tests JUnit 5 y workflow de GitHub Actions.

## Cómo entregar las actividades

La rama `main` está protegida: contiene los enunciados originales y no se puede modificar.
Cada alumno trabaja en **su propia rama**, con su nombre.

1. Clona el repositorio:
   `git clone https://github.com/java-foundations-2026-malaga/REPOSITORIO.git`
2. Crea tu rama con tu nombre y apellido, en minúsculas y sin tildes ni espacios (por ejemplo `juan-perez`):
   `git checkout -b juan-perez`
   (En Eclipse: botón derecho sobre el proyecto > `Team > Switch To > New Branch...`).
3. Importa en Eclipse la carpeta `actividadNN` que vayas a hacer (`File > Import... > Maven > Existing Maven Projects`), resuélvela y comprueba los tests con `Run As > JUnit Test`.
4. Haz commit y sube **tu rama**:
   `git add .` → `git commit -m "Actividad NN"` → `git push -u origin juan-perez`
   (En Eclipse: `Git Staging` > `Commit and Push...`).
5. En la pestaña **Actions** del repositorio verás el resultado de la autocorrección de cada actividad que hayas modificado: ✅ aprobada o ❌ con los errores.

Si al hacer push te aparece un error sobre `main`, es que estás en la rama equivocada: cambia a tu rama con `git checkout juan-perez`.
