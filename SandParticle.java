public class SandParticle extends Material {
    public void movementRules() { //should form triangular/pyramidal structure
        //checks if it can go straight down
        //if not straight down, go left or right
        //if none of those stay in the same position
    }

    public boolean goDown(Material[] adjCells) {
        if (adjCells[0] == null) { //if cell below is empty
            return true;
        }
        else return false;
    }
}