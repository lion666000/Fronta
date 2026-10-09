void main() {
    Fronta fronta = new Fronta();

    fronta.addFront(new Zak("Plarp", "Blarb", 1));
    fronta.addFront(new Zak("UZ", "ZU", 2));
    fronta.addFront(new Zak("BKH", "VF", 3));
    fronta.addFront(new Zak("VGF", "WER", 4));
    fronta.addFront(new Zak("GH", "ZU", 8));
    fronta.addFront(new Zak("OP", "ZU", 6));


    fronta.printAll();
    //fronta.printIndexed();

    //fronta.serveFirst();
    fronta.serveFirst();

   // fronta.printIndexed();

    fronta.addFront(new Zak("ZUFTUFZUFZJUZFUZFUZGF", "shhs", 1));

   // fronta.printIndexed();

    fronta.printAll();

    fronta.printFirst();

    fronta.printWithSurname("ZU");

    fronta.extendLine(20);

    fronta.printIndexed();

    for (int i = 0;i < 20;i++){
        fronta.addFront(new Zak("Test","Testing",1));
    }

    fronta.printIndexed();
}
