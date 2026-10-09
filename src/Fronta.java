public class Fronta {
    int capacity = 6;
    Zak[] fronta = new Zak[capacity];


    int front = 0;
    int rear = -1;
    int size = 0;


    public void addFront(Zak zak) {
        try {
            if (size < capacity) {
                rear = (rear + 1) % capacity;
                fronta[rear] = zak;
                size++;
            }
            else {
                System.out.println("\nKuchařky ho vyhodily");
                throw new CapacityException("Fronta je plná");
            }
        } catch (CapacityException e) {
            System.out.println("Haf haf");
        }
    }

    public void serveFirst(){
        if (size != 0) {
            Zak zak = fronta[front];

            System.out.println("\nObsloužení žáka: " + zak.getJmeno() + " " + zak.getPrijmeni() + ", " + zak.getCisloChodu());

            fronta[front] = null;
            front = (front + 1) % capacity;
            size--;
        }
        else{
            throw new CapacityException("Fronta je prázdná");
        }
    }

    public void printFirst(){
        if (size != 0) {
            Zak zak = fronta[front];
            System.out.println("\nDalší ve frontě: " + zak.getJmeno() + " " + zak.getPrijmeni() + ", " + zak.getCisloChodu());
        }
        else{
            throw new CapacityException("Fronta je prázdná");
        }
    }

    public void printWithSurname(String surname){
        if (size != 0) {
            System.out.println("\nVýpis všech ve frontě s příjmením \"" + surname + "\"");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % capacity;
                if (surname.equals(fronta[index].getPrijmeni())) {
                    System.out.println(fronta[index].toString());
                }

            }
        }
        else{
            throw new CapacityException("Fronta je prázdná");
        }
    }

    public void printAll(){
        if (size != 0) {

            System.out.println("\nVýpis všech ve frontě");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % capacity;
                System.out.println(fronta[index].toString());
            }
        }
        else{
            throw new CapacityException("Fronta je prázdná");
        }
    }

    public void printIndexed(){
        try {
            if (size != 0) {

                System.out.println("\nVýpis všech ve frontě s indexem pozice");
                for (int i = 0; i < capacity; i++) {
                    if (fronta[i] != null) {
                        System.out.println(i + " - " + fronta[i].toString());
                    }
                    else{
                        System.out.println(i + " - null");
                    }
                }
            }
            else{
                throw new CapacityException("Fronta je prázdná");
            }
        } catch (CapacityException e) {
            throw new RuntimeException(e);
        }
    }

    public void extendLine(int newCapacity){
        Zak[] newFronta = new Zak[newCapacity];

        if (size != 0) {

            System.out.println("\nZvětšení max velikosti fronty na " + newCapacity);
            for (int i = 0; i < size; i++) {
                int index = (front + i) % capacity;
                newFronta[i] = fronta[index];
            }
        }

        fronta = newFronta;
        capacity = newCapacity;

    }
}
