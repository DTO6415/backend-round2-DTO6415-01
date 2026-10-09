import java.util.Scanner;

public class backend_rd2_t1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("欢迎进入银行账户管理系统！");
        long balance = 0;
        while(true)
        {
            System.out.println("本系统提供的服务如下：\n1. 存款\n2. 取款\n3. 查询余额\n4. 退出\n");
            System.out.println("请输入服务序号，选择服务：\n");
            int choice = scanner.nextInt();
            switch(choice)
            {
                case 1 :
                    System.out.println("请输入存款金额：\n");
                    long deposit = scanner.nextLong();
                    if(deposit <= 0)
                    {
                        System.out.println("存款金额必须大于零！");
                    }
                    else
                    {
                        balance += deposit;
                        System.out.println("存款成功！当前余额为：" + balance + "\n");
                    }
                    break;
                case 2:
                    System.out.println("请输入取款金额：\n");
                    long withdraw = scanner.nextLong();
                    if(withdraw <= 0)
                    {
                        System.out.println("取款金额必须大于零！");
                    }
                    else if (withdraw > balance)
                    {
                        System.out.println("余额不足！");
                    }
                    else
                    {
                        balance -= withdraw;
                        System.out.println("取款成功！当前余额为：" + balance + "\n");
                    }
                    break;
                case 3:
                    System.out.println("当前余额为：" + balance + "\n");
                    break;
                case 4:
                    System.out.println("退出系统，感谢使用！");
                    break;
                default:
                    System.out.println("无效的序号，请重新输入！");
            }
            if (choice == 4)
            {
                break;
            }
        }
        scanner.close();
    }
}