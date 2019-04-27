package HomeWork4_1;

public class HomeWork4_1 {
    public static void main(String[] args) {
        int y=1001;
        int m=12;
        int d=28;
        if ((d>29 && m==2 && y%4==0)||(d>28 && m==2 && y%4!=0)|| (d>31 && (m==1 || m==3 || m==5 || m==7|| m==8||m==10))||(d==30 && (m==4 || m==6 || m==9 || m==11))||(m>12))
            System.out.println("Введена не существующая дата ");
        else if (d==31 && m==12)
            System.out.println("Год " + (y+1) + " Месяц " + 1 + " День " +1);
        else if (d==31 && (m==1 || m==3 || m==5 || m==7|| m==8||m==10))
            System.out.println("Год " + y + " Месяц " + (m+1) + " День " +1);
        else if (d==30 && (m==4 || m==6 || m==9 || m==11))
            System.out.println("Год " + y + " Месяц " + (m+1) + " День " +1);
        else if ((d==29 && m==2 && y%4==0)||(d==28 && m==2 && y%4!=0))
            System.out.println("Год " + y + " Месяц " + (m+1) + " День " +1);
        else
            System.out.println("Год " + y + " Месяц " + 1 + " День " +(d+1));
    }
}
