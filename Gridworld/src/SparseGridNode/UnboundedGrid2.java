import info.gridworld.grid.*; 
 
import java.util.ArrayList; 
 
import java.util.*; 
 
public class UnboundedGrid2<E> extends AbstractGrid<E> 
{ 
 private Object[][] occupantArray; 
 private int dim; 
 public UnboundedGrid2() 
 { 
 dim = 16; 
 occupantArray = new Object[dim][dim];; 
 } 
 
 public int getNumRows() 
 { 
 return -1; 
 } 
 
 public int getNumCols() 
 { 
 return -1; 
 } 
 
 public boolean isValid(Location loc) 
 { 
 return loc.getRow() >= 0 && loc.getCol() >= 0; 
 } 
 public ArrayList<Location> getOccupiedLocations() 
 { 
 ArrayList<Location> theLocations = new ArrayList<Location>(); 
 

 for (int r = 0; r < dim; r++) 
 { 
 for (int c = 0; c < dim; c++) 
 {  
 Location loc = new Location(r, c); 
 if (get(loc) != null) 
 theLocations.add(loc); 
 } 
 } 
 
 return theLocations; 
 } 
 
 public E get(Location loc) 
 { 
 if (!isValid(loc)) 
 throw new IllegalArgumentException("Location " + loc 
 + " is not valid"); 
 if(loc.getRow() >= dim || loc.getCol() >= dim) 
 return null; 
 return (E) occupantArray[loc.getRow()][loc.getCol()]; 
 } 
 
 public E put(Location loc, E obj) 
 { 
 if (loc == null) 
 throw new NullPointerException("loc == null"); 
 if (obj == null) 
 throw new NullPointerException("obj == null"); 
 
 if (loc.getRow() >= dim || loc.getCol() >= dim) 
 resize(loc); 
 
 E oldOccupant = get(loc); 
 occupantArray[loc.getRow()][loc.getCol()] = obj; 
 return oldOccupant; 
 } 
 
 public E remove(Location loc) 
 { 
 if (!isValid(loc)) 
 throw new IllegalArgumentException("Location " + loc 
 + " is not valid"); 
 
 if(loc.getRow() >= dim || loc.getCol() >= dim) 
 return null; 
 
 E r = get(loc); 
 occupantArray[loc.getRow()][loc.getCol()] = null; 
 return r; 
 } 
 
 private void resize(Location loc) 
 { 
 int size = dim; 
 while (loc.getRow() >= size || loc.getCol() >= size) 
 size *= 2; 
 
 Object[][] temp = new Object[size][size]; 
 
 for(int r = 0; r < dim; r++) 
 for(int c = 0; c < dim; c++) 
 temp[r][c] = occupantArray[r][c]; 
  
 occupantArray = temp; 
 dim = size; 
 } 
} 
