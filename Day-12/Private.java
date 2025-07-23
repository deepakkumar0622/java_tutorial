class Teacher{
    private String t_name="Praveen";

    void disp(){
        System.out.println(t_name);
    }

}



public  class Private {

    public static void main (String [] args){
        Teacher t1 = new Teacher();
        t1.disp();
    }

}