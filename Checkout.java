public class Checkout {
    public static double applyStudentDiscount(double total, boolean isStudent){
        // 新增：输入校验，总价不能为负数
        if(total < 0){
            System.out.println("Error: total price cannot be negative!");
            return 0;
        }
        if(isStudent){
            return total * 0.90;
        }
        return total;
    }

    public static void main(String[] args) {
        double originalTotal = 100.0;
        System.out.printf("Original purchase total: £%.2f%n",originalTotal);
        System.out.println("Student discount: 10%");

        double studentPrice = applyStudentDiscount(originalTotal,true);
        System.out.println("----[Customer is student]----");
        System.out.printf("Discount amount: £%.2f%n",originalTotal - studentPrice);
        System.out.printf("Final purchase total: £%.2f%n%n",studentPrice);

        double normalPrice = applyStudentDiscount(originalTotal,false);
        System.out.println("----[Customer is NOT student]----");
        System.out.println("Discount amount: £0.00");
        System.out.printf("Final purchase total: £%.2f%n",normalPrice);

        // 测试负数场景
        System.out.println("\n----[Test negative total]----");
        applyStudentDiscount(-50,true);
    }
}