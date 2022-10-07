package Business.Core;

public class BusinessRules {
    public static boolean checkNameIsExists(String name){
        //because of no connection on database
        if (name == "") {
            return false;
        }else{
            return true;
        }
    }

    public static boolean checkCoursePrice(double price){
        if (price < 0) {
            return false;
        }else{
            return true;
        }
    }
}
