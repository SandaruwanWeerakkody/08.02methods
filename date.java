public class Date {
    private int year;
    private int month;
    private int day;

    public Date(){
        year = 2001;
        month = 07;
        day = 25;
    }
    public Date(int year){
        setYear(year);
        month = 07;
        day = 25;
    }
    public Date(int year,int month){
        setYear(year);
        setMonth(month);
        day = 25;
    }
    public Date(int year,int month,int day){
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>1000&&year<=9999){
            this.year = year;
        }else{
            System.out.println("input valid year");
        }

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month>0&&month<=12){
            this.month = month;
        }else{
            System.out.println("input valid month");
        }

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day>0&&day<=31){
            this.day = day;
        }else{
            System.out.println("input valid date");
        }
    }
    public void setDate(int year,int month,int day){
        if(year>1000&&year<=9999){
            this.year = year;
        }else{
            System.out.println("input valid year");
        }
        if(month>0&&month<=12){
            this.month = month;
        }else{
            System.out.println("input valid month");
        }
        if(day>0&&day<=31){
            this.day = day;
        }else{
            System.out.println("input valid date");
        }
    }


}
