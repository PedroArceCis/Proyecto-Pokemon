# ELO329
---
### *Diseño y Programacion Orientados a Objetos*
---

#### **Proyecto: Simulador de batalla Pokemon**
---  

###### • Integrantes del equipo:
- **Nombre:** Jesus Chaffe    
  **Rol:** 202023501-5  
  **Correo:** jesus.chaffe@usm.cl  

- **Nombre:** Rodrigo Lobos       
  **Rol:** 201904649-7    
  **Correo:** rodrigo.lobosc@usm.cl  

- **Nombre:** Javier Acuña       
  **Rol:** 201944537-5    
  **Correo:** javier.acuna@usm.cl  

- **Nombre:** Pedro Cisternas       
    **Rol:** 202056597-k    
    **Correo:** pedro.cisternasa@usm.cl  

- **Nombre:** Felipe Salas       
    **Rol:** 202030544-7    
    **Correo:** felipe.salaso@sansano.usm.cl  

---

## Descripcion del programa  
Este programa simula una batalla como en los juegos de la saga Pokemon entre el jugador y la maquina.
El proyecto modela a un jugador que recibe de manera aleatoria el pokemon que usaran para la lucha al 
igual que su rival. Tambien podra acceder la mochila, atacar o en su efecto huir si es que lo desea ,
siendo lo mas cercano a como seria la batalla en el juego original.
---
## Requisitos de compilacion y ejecución

**Tener Compilador:** jdk-18.0.2
**Tener JavaFX:** sdk-18-0.1
**Sistema Operativo:** Linux   

El programa se corre en Intellij, por lo que si el usuario desea correrlo en otro ambiente
tendra que buscar la documentacion de JavaFX para realizarlo.
---
## Archivos del programa  

### Main    
- Main: Introduce a los contrincantes y comienza la batalla pokemon.  

### Panels  
- BattlePanel: Indica que accion se va a tomar y notifica cualquier tipo de cambio en la batalla.  
- InfoPanel: Informacion que se actualiza de acuerdo al estado del pokemon.  
- TextGenerator: Genera el texto de acuerdo a la accion que este ocurriendo.  

### Pokemon  
- Pokemon: Define las caracteristicas de cada pokemon como la vida y el tipo, ademas de sus metodos para aprender habilidades.
- PokemonUniverse: Define a los pokemones, si es rival o aliado y sus habilidades.    

### Support   
- AI: Define los movimientos y probabilidades del rival maquina.   
- Battle: Actualiza movimientos y efectividad de cada accion durante la batalla.   
- Player: Clase jugador y sus atribuciones.  
- Skill: Clase de habilidades.  
- SkillUniverse: Habilidades de los pokemones.  
- Type: Counters de cada tipo especifico.  
- TypeUniverse: Tipos de pokemon.  


---
## Consideraciones finales

Se debe verificar que el lib de JavaFX se encuentre referenciado correctamente en el proyecto.

El archivo que se ejecuta es el Main donde se encuentra el main.

---
Archivo de salida:

Al correr Main.main el programa va a generar un archivo .exe que simula la batalla.
El usuario puede:

	-Luchar
		-Escoger el movimiento
			-Ataca al rival

	-Mochila 
		

    -Huir
        -Se acaba la batalla


   



