public class Simulator {
    private static Material[][] grid;
    private static DisplaySim displaySim;
    private static int width;
    private static int height;

    public Simulator(int x, int y) {
        width = x;
        height = y;

        grid = new Material[width][height];
        grid[0][0] = new SandParticle();

        displaySim = new DisplaySim(width, height);
        displaySim.display();
    }
}
