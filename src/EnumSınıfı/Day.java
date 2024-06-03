package EnumSınıfı;

public enum Day {
    Pazartesi(1),
    Salı(2),
    Çarşamba(3),
    Perşembe(4),
    Cuma(5),
    Cumartesi(6),
    Pazar(7);
    private int day;

    private Day(int day){
        this.day=day;
    }
    public int getDay(){
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void getDayName(){
        String dayName=null;

        switch (this.getDay()){
            case 1:
                dayName="Pazartesi";
                break;
            case 2:
                dayName="Salı";
                break;
            case 3:
                dayName="Çarşamba";
                break;
            case 4:
                dayName="Perşembe";
                break;
            case 5:
                dayName="Cuma";
                break;
            case 6:
                dayName="Cumartesi";
                break;
            case 7:
                dayName="Pazar";
                break;
        }
        System.out.println(dayName);
    }
}
