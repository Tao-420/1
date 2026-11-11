public class Checkout {
    public static double applyStudentDiscount(double total, boolean isStudent){
        if(isStudent){
            return total * 0.90;
        }
        return total;
    }

    public static void main(String[] args) {
        double originalTotal = 100.0;
        System.out.printf("Original purchase total: £%.2f%n",originalTotal);
        System.out.println("Student discount: 10%");

        //学生测试
        double studentPrice = applyStudentDiscount(originalTotal,true);
        System.out.println("----[Customer is student]----");
        System.out.printf("Discount amount: £%.2f%n",originalTotal - studentPrice);
        System.out.printf("Final purchase total: £%.2f%n%n",studentPrice);

        //非学生测试
        double normalPrice = applyStudentDiscount(originalTotal,false);
        System.out.println("----[Customer is NOT student]----");
        System.out.println("Discount amount: £0.00");
        System.out.printf("Final purchase total: £%.2f%n",normalPrice);
    }
}
