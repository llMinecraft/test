package bookcase.test_4;

public class round {
    public static void main(String[] args) {
        int a,b,a_hp,b_hp;
        int user,user_hp;
        user_hp = 1000;
        a_hp=8;b_hp=10;
        user = 1;
        a=5;
        b=3;
        attack_1(a,b,a_hp,b_hp,user,user_hp);
        attack_2(a,b,a_hp,b_hp,user,user_hp);

    }
    public static int attack_1(int a,int b,int a_hp,int b_hp,int user, int user_hp){
        int i=1,value = 0;
        while(user_hp!=0){
            System.out.printf("第%d回合@！\n",i);
            i++;
            value = user_hp;
            if(i%2==0){
                if(a_hp>0)
                    a_hp-=user;
                if(a_hp>0&&b_hp>0)
                    user_hp-=a+b;
                else if(a_hp<=0){
                    user_hp-=b;
                    b_hp-=user;
                }
                else
                    user_hp-=a;
                System.out.printf("英雄本回合收到%d点伤害,剩余血量%d,大怪血量%d\n",value-user_hp,user_hp,a_hp);
            }
            else{
                if(b_hp>0)
                    b_hp-=user;
                if(b_hp>0&&a_hp>0)
                    user_hp-=a+b;
                else if(b_hp<=0){
                    user_hp-=a;
                    a_hp-=user;
                }
                else
                    user_hp-=b;

                System.out.printf("英雄本回合收到%d点伤害,剩余血量%d,小怪血量%d\n",value-user_hp,user_hp,b_hp);
            }

            if(a_hp<=0&&b_hp<=0){
                System.out.printf("########################################################对战结束!");
                break;
            }
        }
        System.out.println("########################################################");
        return 0;
    }
    public static int attack_2(int a,int b,int a_hp,int b_hp,int user, int user_hp){
        //大小怪互换单打
        int i = 1;
        while(user_hp!=0){
            System.out.printf("第%d回合@！\n",i);
            i++;
            if(b_hp>0){
                user_hp-=a+b;
                b_hp-=user;
                System.out.printf("英雄本回合收到%d点伤害,剩余血量%d,小怪剩余血量%d\n",a+b,user_hp,b_hp);
            }
            else{
                user_hp-=a;
                a_hp-=user;
                System.out.printf("英雄本回合收到%d点伤害,剩余血量%d,大怪剩余血量%d\n",b,user_hp,a_hp);
            }
            if(a_hp<=0&&b_hp<=0){
                System.out.printf("对战结束!");
                break;
            }
        }
           return 0;
    }
}
