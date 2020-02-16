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
        nx = CAMERA_X - ((x - CAMERA_X) * y) / (y - CAMERA_Y);
        ny = ((y - CAMERA_Y) * (z - CAMERA_Z)) / (z - CAMERA_Z);
        System.out.println(nx + " " + ny);
        return new int[]{nx, ny};
    }
}