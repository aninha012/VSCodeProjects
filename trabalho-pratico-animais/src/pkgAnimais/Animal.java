package pkgAnimais;

class Animal {
    private String nome;
    private boolean vivo;
    protected int idade;

    public Animal(String nome) {
        this.nome = nome;
        this.vivo = true;
        this.idade = 0;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void morrer() {
        vivo = false;
    }

    public void fazerAniversário() {
        if (vivo) {
            idade++;
        }
    }

    @Override
    public String toString() {
        return "Animal: " + nome + ", Vivo: " + vivo + ", Idade: " + idade;
    }
}
