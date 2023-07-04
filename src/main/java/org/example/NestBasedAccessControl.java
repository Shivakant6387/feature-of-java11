package org.example;

public class NestBasedAccessControl {
    private void privateMethod(){
        System.out.println("Private Method");
    }
    class NestedClass{
        public void callPrivateMethod(){
            privateMethod();
        }
    }
    public static void main(String[] args) {
        System.out.println(NestBasedAccessControl.class.isNestmateOf(NestBasedAccessControl.NestedClass.class));
        System.out.println(NestBasedAccessControl.NestedClass.class.isNestmateOf(NestBasedAccessControl.class));
        System.out.println(NestBasedAccessControl.NestedClass.class.getNestHost());
        System.out.println(NestBasedAccessControl.class.getNestMembers());
    }
}
