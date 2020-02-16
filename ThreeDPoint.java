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
        nx = CAMERA_X - ((x - CAMERA_X) * -CAMERA_Y) / (y - CAMERA_Y);
        ny = z - ((y) * (z - CAMERA_Z)) / (y - CAMERA_Y);
        System.out.println(nx + " " + ny);
        return new int[]{nx, ny};
    }
}