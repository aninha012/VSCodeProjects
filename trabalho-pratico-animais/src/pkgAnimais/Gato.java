package pkgAnimais;

class Gato extends Mamífero {
    private boolean noMuro;

    public Gato(String nome, String tutor) {
        super(nome, tutor);
        this.noMuro = false;
    }

    public void miar() {
        if (isVivo()) {
            System.out.println("Miau, Miau!");
        }
    }

    public void subirMuro() {
        if (isVivo()) {
            noMuro = true;
        }
    }

    public void descerMuro() {
        if (isVivo()) {
            noMuro = false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", No Muro: " + noMuro;
    }
}
