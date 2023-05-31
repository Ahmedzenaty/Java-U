
public class Date{
    int day;
    int month;
    int year;

    // Methoed here
    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(){
        
    }

    int getDay(){
        return day;
    }
    int getMonth(){
        return month;
    }
    int getYear(){
        return year;
    }
    void detDay(int Day){
        day = Day;
    }
    void setMonth(int Month){
        month = Month;
    }
    void setYear(int Year){
        year = Year;
    }
    public String toString(){
        String DATE = month + "/" + day + "/" + year;
         return DATE;
    }
}