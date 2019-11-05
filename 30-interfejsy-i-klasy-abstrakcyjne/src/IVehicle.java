public interface IVehicle {
    default public int speedUp(int speed)
    {
        return speed++;
    }
}
