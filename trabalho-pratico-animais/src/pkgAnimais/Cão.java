package pkgAnimais;

class Cão extends Mamífero {
    private boolean vigiando;

    public Cão(String nome, String tutor) {
        super(nome, tutor);
        this.vigiando = false;
    }

    public void latir() {
        if (isVivo()) {
            System.out.println("Au, Au!");
        }
    }

    public void vigiar() {
        if (isVivo()) {
            vigiando = true;
        }
    }

    public void relaxar() {
        if (isVivo()) {
            vigiando = false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Vigiando: " + vigiando;
    }
}
