public class ThreeDPoint {
    int x, y, z;
    final int CAMERA_X = 300;
    final int CAMERA_Y = -200;
    final int CAMERA_Z = 500;
    public ThreeDPoint(int xx, int yy, int zz) {
        x = xx;
        y = yy;
        z = zz;
    }
    
    public int[] ConvertTo2D() {
        int nx, ny;
        nx = CAMERA_X - ((y - CAMERA_Y) * x) / (x - CAMERA_X);
        ny = ((z - CAMERA_Z) * y) / (y - CAMERA_Y);
        return new int[]{nx, ny};
    }
}