package SelfLearningProjects;

public class Recursive {
    public static void main(String[] args) {

        // Classic Method
        System.out.println(f(3));
        // Recursive Method
        System.out.println(r(3));

    }

    // Standard Technical:
    public static int f(int n){
        int result = 0;
        for (int i=1; i<=n; i++){
            result += i;
        }
        return result;
    }

    // Recursive Method:
    public static int r(int n){
        if (n==1){
            return 1;
        }
        return r(n-1) + n;
    }

}
