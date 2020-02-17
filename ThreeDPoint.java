public class ThreeDPoint {
    int x, y, z;
    final int CAMERA_X = 360;
    final int CAMERA_Y = -200;
    final int CAMERA_Z = 500;
    public ThreeDPoint(int xx, int yy, int zz) {
        x = xx;
        y = yy;
        z = zz;
    }
    
    public int[] convertTo2D() {
        int nx, ny;
        nx = CAMERA_X - (int) (((double) (x - CAMERA_X) * -CAMERA_Y) / ((double) (y - CAMERA_Y) + 0.01));
        ny = z - ((y) * (z - CAMERA_Z)) / (y - CAMERA_Y + 1);
       
        return new int[]{nx, ny};
    }
}