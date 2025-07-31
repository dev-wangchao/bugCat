package str;

public class MathDemo {
    public static void main(String[] args) {
        // 1. 定义圆半径
        double radius = 5D;
        double safeRadius = Math.max(0, radius);

        // 2. 计算圆面积 (πr²)
        double area = Math.PI * Math.pow(safeRadius, 2D);
        System.out.println(area);

        // 3.判断点是否在圆内 (距离公式 √(x²+y²) <= r)
        double pointX = 3d;
        double pointY = 4d;
        double sqrt = Math.sqrt(Math.pow(pointX, 2) + Math.pow(pointY, 2));
        System.out.println(sqrt <= radius);

        // 4. 生成圆上随机点 (三角函数参数方程)
        double params = Math.random() * 2 * Math.PI; //[0.2π)
        double randomX = Math.sin(params);
        double randomY = Math.cos(params);
        System.out.println(randomX + "|" + randomY);

    }
}
