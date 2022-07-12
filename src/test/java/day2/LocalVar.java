package day2;

public class LocalVar {



    String city = "Bangalore"; // Instance var / Global variable

// non static method
    public void reg(String name, String course){
        String university = "JNU"; // local var
        System.out.println("Name: "+ name);
        System.out.println("Course: "+ course);
        System.out.println("City: "+ city);
        System.out.println("University: "+ university);
    }


    public void onbarding(){
        city ="Boston";
        System.out.println("City: "+ city);
//        System.out.println("University: "+ university);
    }

    public static void main(String[] args) {
        LocalVar localVar = new LocalVar();
        localVar.reg("Arvind","Automation");
        localVar.onbarding();
        System.out.println(localVar.city);

    }


}
