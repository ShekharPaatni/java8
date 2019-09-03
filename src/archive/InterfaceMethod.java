package archive;

interface InterfaceDefaultAndStatic {
     void printme();
}

class InterfaceMethod implements InterfaceDefaultAndStatic{
    private void printMe() {
        printme();
    }
    public static void main(String[] args) {
        InterfaceDefaultAndStatic interfaceDefaultAndStatic1 = new InterfaceMethod()::printMe;
        interfaceDefaultAndStatic1.printme();
    }

    @Override
    public void printme() {
        System.out.println("print me");
    }
}