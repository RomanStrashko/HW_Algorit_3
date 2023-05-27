public class Program {
    public static void main(String[] args) {
        Linketlist linketlist = new Linketlist();
        linketlist.add("Строка1");
        linketlist.add("Строка2");
        linketlist.add("Строка3");
        linketlist.add("Строка4");
        linketlist.add("Строка5");

        System.out.println(linketlist.size());

//        linketlist.remove();
//        System.out.println(linketlist.size());
//        System.out.println(linketlist.get(linketlist.size()-2));

        System.out.println(linketlist.get(linketlist.size()-1));
        linketlist.revert();
        System.out.println(linketlist.get(linketlist.size()-1));

    }
}
