public class taskMain {
    public static void main(String[] args) {
        PhoneBook pB = new PhoneBook();

        User eva = new User("Eva");
        
        User vika = new User("nika");

        User banan = new User("banan52");

        User irina = new User("Irina");

        pB.add(banan, 1234567);
        pB.add(eva,123456);
        pB.add(eva, 12345);
        pB.add(eva, 123486);
        pB.add(vika, 193456);
        pB.add(vika, 13456);
        pB.add(irina, 1345678);
        pB.add(eva, 123458);
        pB.add(irina, 13456780);
        pB.add(irina, 134567876);
        pB.add(irina, 13456878);
        pB.add(irina, 1345608);
        pB.add(irina, 1345698);
        pB.add(irina, 134567);


       pB.sortPhoneBook();
       System.out.println(pB.getPhoneBook());
    }
}
