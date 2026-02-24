class ex{
    String greet(String a){
        return("Good morning"+" "+a);
    }
    public static void main(String args[]){
        ex ob = new ex();
        String s = ob.greet("CSE");
        System.out.print(s);
}
}
