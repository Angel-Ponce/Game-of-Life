# Game-of-Life
Tribute to John Horton!
## What is?
The game of life is a math game created by [John Horton](https://es.wikipedia.org/wiki/John_Horton_Conway), John defines the life in a bidimiensional region in the space; cells live in this region and only have two states, live or dead... This universe follow three simple rules:
- If a live cell has 2 or 3 cell neighbors with life, this cell can continue to live.
- If a live cell has less than 2 cell neighbors with life, or has more than 3 cell with life, this cell go dead.
- If a dead cell has exactly 3 cell neighbors with life, this cell revive

Simple work, complex evolution..

## How does it work?
Using 2D array of **Cell** objects (JLabel inherited) make the bidimensional region, and using **Timer** objects to implementes a infinite loop in Java Swing, aply the simple rules to the game...

### See how a few simple rules can do incredible things
https://user-images.githubusercontent.com/60164099/123197980-9a480d80-d469-11eb-9b72-421bdd05e099.mov

# Features
- Make your initial configuration of cells
- Start the game of life
- Pause the game to make changes
- Make a random map of cells
- Use without compile the code, view file: `./store/GameOfLife.jar` (need java 8.1+ in your machine)

# How to use?
- First, go the the file `./store/GameOfLife.jar` and execute this jar
- Second, you should build your initial configuration of cell before start the game, cause the game run with 200 miliseconds of delay, and it so hard make configurations once already start the game, always you can pause the game..

### Always love prograimg and maths, enjoy!!!

# Authors
 [John Horton](https://es.wikipedia.org/wiki/John_Horton_Conway)
 
 [Angel Ponce](https://github.com/Angel-Ponce)

