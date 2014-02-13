public class QuickCrab extends CrabCritter
{
  public ArrayList<Location> getMoveLocations()
  {
    ArrayList<Location> locs = new ArrayList<Location>();
    this.addIfPath(this.getDirection() + Location.LEFT, locs);
    this.addIfPath(this.getDirection() + Location.RIGHT, locs);
    
    if(locs.size() > 0)
      return locs;
    
    return super.getMoveLocations();
  }
  
  private void addIfPath(int direction, ArrayList<Location> locs)
  {
    Grid<Actor> gr = this.getGrid();
    Location loc = this.getLocation().getAdjacentLocation(direction);
    if(gr.isValid(loc) && gr.get(loc) == null)
    {
      loc = loc.getAdjacentLocation(direction);
      if(gr.isValid(loc) && gr.get(loc) == null)
        locs.add(loc);
    }
  }
}