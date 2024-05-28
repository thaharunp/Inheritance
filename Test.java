class Parent{
    void m1(){
        System.out.println("thaharun");
    }
    void m2(){
        System.out.println("thaiba");
    }
    class Child extends Parent{
        void m3(){
            System.out.println("nasir");
        }
    }
    class Test{
        public static void main(String args[]){
    
       Parent p1 = new Parent();
        Child c1 = new Child();
        Parent c2 = new Child();
    }
    }
        
}