public class test {
//    public static boolean isa(String u){
//        return u.toLowerCase()=="as";
//    }
    public static void main(String[] args) {
        Object o=new Object(){
            public boolean equals(Object obj){
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
//        System.out.println(isa("As"));
//        boolean b=true?false:true==true?false:true;
//        System.out.println(b);
    }
}
