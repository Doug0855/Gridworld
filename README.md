Gridworld
=========
Answers to Questions
 Ch 1
  Not if there is an object in front of it
  Forward
  It turns if it can't move
  It turns
  No
  It gets darker every step
  No
  No
  North, Northeast, East, Southeast, South, SouthWest, West, Northwest
  It moves the bug, it Can move to anywhere on the grid, you get an error
  setColor
  The bug is destroyed
Ch 2
  The number of steps it moves
  Tracks how many steps the bug has made
  It turns 45 degrees twice
  Because it extends Bug
  Yes because it's side length is initialized during creation
  If there is an actor in its path
  When the box bug is first created
Ch 3
  loc1.getrow()
  false
  (4,4)
  135 degrees
  By the given direction
  gr.getOccupiedLocations().size(), gr.getNumRows()*gr.getNumCols()
  gr.isValid(new Location(10,10)) will return true
  Because it is an abstract class
  Color direction Location
  Blue, North
  So other objects can implement it
  No, No, Yes
  if(!gr.isValid(next)) 
    return false; 
  Actor neighbor = gr.get(next); 
    return (neighbor == null) || (neighbor instanceof Flower); 
  isValid and Get to determine if the move location is valid
  getAdjacentLocation to figure out the next destination
  getLocation, getDirection, getGrid 
  It removes itself from the grid
  loc is required because it stores the bug's location before it moves, to do things like placing flowers
  Artistic flaire
  Yes
  Flower flower = new Flower(getColor()); 
    flower.putSelfInGrid(gr, loc); 
  4 times
Chapter 4
  act, getActors, processActors, getMoveLocations, selectMoveLocation, makeMove
  getActors, processActors, getMoveLocations, selectMoveLocation, makeMove
  Yes, since critters do different things
  eating, killing, maiming, marrying, breeding, ect
  getMoveLocations finds all availible moves, selectMoveLocation determines which move to make, makeMove makes the move
  Because Critter extends actor
  Because Chameloeon critter overrides proccess actors
  To move
  By using a variable to store the location of the critter before the move, and then logic to only place flowers when it moves to a new location
  Because it processes the same actors that Critter does
  Actor
  GetGrid
  Because it is the same thing that Critter does
  Only the front, front right and front left actors will be eaten, other adjacent actors will not be touched
  To return valid locations to eat from
  (4,3), (4,4), (4,5)
  Neither turn, a crab will move in a different direction when it can't move
  when loc= it's current location
  because critters don't remove rocks or critters
Chapter 5
  Grid, Bounded grid, Unbounded Grid
  getValidAdjacentLocations, because no other methods directly call isValid
  AbstractGrid, unboundedGrid, boundedGrid
  because it uses E to show that there are no possible moves
  there would be half as many possible moves
  BoundedGrid will throw an exception
  occupantArray[0].length, that there is at least 1 row and column
  That row/column have a value greater than 0 and less than the max amount of rows/columns
  ArrayList<Location>, O(r*c)
  E, Location, O(1)
  If the object is put in an invalid place, O(1)
  E, O(1)
  Yes, because it is mostly O(1)
  hashcode, equals, that location was a non abstract class, yes
  because null is not a valid location, an error will be thrown
  O(1), O(Log n)
  Beacuse treeMap will store things in a tree, and takes time going through the whole chain
  Yes, It would be more efficient, 
  Because it calls getOccupiedLocations more frequently
  
  
  



  
