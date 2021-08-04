public class Main {
    public static void main(String[] args) {
        int i = 10;//4byte
        float f = 20.5f;//kiểu số thực kích thướt 4byte
        double d = 20.5;// ||      ||     ||      8byte
        boolean b = true;//2 giá trị trả về true và false
        char c = 'a';//kiểu kí tự có kích thướt 2byte
        String s ="Hà Nội";//khai báo biến s có kiểu là String có giá trị là chuỗi Hà Nội
        System.out.println("i = " +i);
        System.out.println("f = " +f);
        System.out.println("d = " +d);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("s = " +s);
    }
}
