public class Main {
    public static void main(String[] args) {
        /*

        byte a = 1;
        int b = 100;
        short c =  19633;
        long d = - 1000000000002345678L;
        float e = 1.5f;
        double g = 0.99d;

         */




        float Man_a = 78.2f;
        float Man_b = 82.7f;
        float summ = Man_a + Man_b;
        System.out.println( " Общий вес спортсменов " + summ + " кг ");

        float differense = Man_a - Man_b;
        System.out.println(" Разница в весе " + differense + "кг" );

        byte Banana = 5;
        byte BananaWeight = 80;
        int SumBanana = Banana * BananaWeight;
        short Milk = 200;
        byte MilkWeight = 105;
        int SumMilk = Milk / 100 * MilkWeight;
        byte IceCream = 2;
        byte IceCreamWeight = 100;
        int SumIceCream = IceCream * IceCreamWeight;
        byte Egg = 4;
        byte EggWeight = 70;
        int SumEgg =  (Egg * EggWeight);
        int Total = SumBanana + SumMilk + SumIceCream + SumEgg;
        System.out.println( " Общий вес спорт завтрака " + Total + " грамм ");
        float TotalKg = Total/1000f;
        System.out.println( " Общий вес спорт завтрака " + TotalKg + " кг ");

        byte Weight = 7;
        float EveryDayWeight250 = 0.25f;
        float days250 = Weight / EveryDayWeight250;
        System.out.println( " При похудений 250 грамм в день необходимо " + days250 + " дней");
        float EveryDayWeight500 = 0.5f;
        float days500 = Weight / EveryDayWeight500;
        System.out.println( " При похудений 500 грамм в день необходимо " + days500 + " дней");
        float EveryDayWeightAverage = (EveryDayWeight250 + EveryDayWeight500) / 2;
        float DaysAverage = Weight / EveryDayWeightAverage;
        System.out.println( " При среднем значении похудения необходимо " + DaysAverage + " дней");

        int Masha = 67760;
        int Denis = 83690;
        int Kristi = 76230;
        int MashaPromote = Masha/10;
        int DenisPromote = Denis/10;
        int KristiPromote = Kristi/10;
        int Year = 12;
        int TotalMasha = (Masha + MashaPromote) * Year;
        int TotalDenis = (Denis + DenisPromote) * Year;
        int TotalKristi = (Kristi + KristiPromote) * Year;
        int TotalMashaPr = MashaPromote * Year;
        int TotalDenisPr = DenisPromote * Year;
        int TotalKristiPr = KristiPromote * Year;
        System.out.println( " Маша теперь получает " + TotalMasha + " рублей в год. Годовой доход увеличился на "
        + TotalMashaPr + " рублей ");
        System.out.println( " Денис теперь получает " +  TotalDenis + " рублей в год. Годовой доход увеличился на "
                + TotalDenisPr + " рублей ");
        System.out.println( " Кристина теперь получает " + TotalKristi + " рублей в год. Годовой доход увеличился на "
                + TotalKristiPr + " рублей ");









    }
}