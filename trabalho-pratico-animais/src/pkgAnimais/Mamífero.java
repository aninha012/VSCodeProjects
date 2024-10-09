package pkgAnimais;

class Mamífero extends Animal {
    private String tutor;

    public Mamífero(String nome, String tutor) {
        super(nome);
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tutor: " + tutor;
    }
}
