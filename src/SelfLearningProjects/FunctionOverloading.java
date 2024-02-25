package SelfLearningProjects;

public class FunctionOverloading {
    public static void main(String[] args) {

        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1.0,2.0));
        System.out.println(sum(1.0,2.0,3.0));
    }

    public static int sum(int x, int y){
        return x+y;
    }
    public static int sum(int x, int y, int z){
        return x+y+z;
    }

    public static double sum(double x, double y){
        return x+y;
    }

    public static double sum(double x, double y, double z){
        return x+y+z;
    }

}
