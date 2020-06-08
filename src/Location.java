import java.util.Objects;
/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoordinate;
    /** Y coordinate of this location. **/
    public int yCoordinate;
    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoordinate = x;
        yCoordinate = y;
    }
    /** Creates a new location with coordinates (0, 0). **/
    public Location()

    {
        this(0, 0);
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Location location = (Location) obj;
        return xCoordinate == location.xCoordinate &&
                yCoordinate == location.yCoordinate;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(xCoordinate, yCoordinate);
    }
}
