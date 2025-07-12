package org.kras;


import static java.awt.SystemColor.text;

class Show {
    public static void main(String[] args) {
        Address<String, Integer> integerAddress = new Address<>("localhost", Integer.valueOf(8080));

        URL url = new URL (integerAddress , "hello") ;
//        if (url instanceof URL(Address<>(var value, var port), var text) && port > 1024) {
//            System.out.println("http://" + value + ":" + port + "/" + text);
//        }
//        if (url instanceof URL(Address<String, Integer> address, var text) && address.port > 1024) {
//            System.out.println("http://" + address.value + ":" + address.port + "/" + text);
//        }
//        if (url instanceof URL(Address(var value, var port), var text) || port > 1024) {
//            System.out.println("http://" + value + ":" + port + "/" + text);
//        }
        if (url instanceof URL(Address(var value, Integer port), var text) && port > 1024) {
            System.out.println("http://" + value + ":" + port + "/" + text);
        }
    }
}