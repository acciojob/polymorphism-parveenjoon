public class Main {
    public static void main(String[] args){
        Product p = new Product();
        int ans1 = p.product(1,2);
        int ans2 = p.product(1,2,3);
        double ans3 = p.product(1.5, 2.5);
        System.out.println(ans1+" "+ ans2 +" "+ ans3);
    }

    public static class Product{
        public int product(int x, int y) {
            return  x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }
    }
}
