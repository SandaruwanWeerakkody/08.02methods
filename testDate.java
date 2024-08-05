public class testDate {
    public static void main(String[] args) {
//        Date d1 = new Date();
//        System.out.println("Show Current year :"+d1.getYear());
//        System.out.println("Show Current month :"+d1.getMonth());
//        System.out.println("Show Current day :"+d1.getDay());

//        Date d2 = new Date(300);
//        System.out.println("Show Current year :"+d2.getYear());
//        System.out.println("Show Current month :"+d2.getMonth());
//        System.out.println("Show Current day :"+d2.getDay());
//        d2.setYear(900);
//        System.out.println("Show Current year :"+d2.getYear());

        Date d3 = new Date(2024,12);
        System.out.println("Show Current year :"+d3.getYear());
        System.out.println("Show Current month :"+d3.getMonth());
        System.out.println("Show Current day :"+d3.getDay());
        d3.setMonth(5);
        System.out.println("Show Current year :"+d3.getYear());
        System.out.println("Show Current month :"+d3.getMonth());
        System.out.println("Show Current day :"+d3.getDay());
        d3.setMonth(19);
        System.out.println("Show Current month :"+d3.getMonth());
//
//        Date d4 = new Date(2024,8,31);
//        System.out.println("Show Current year :"+d4.getYear());
//        System.out.println("Show Current month :"+d4.getMonth());
//        System.out.println("Show Current day :"+d4.getDay());
    }
}
