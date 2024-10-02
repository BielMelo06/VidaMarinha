
package beans;

/**
 *
 * @author Gabriel
 */
public class lugares_protecao_animais_marinhos {
     private int id;
    private String nome;
    private String lugar;
    private String animais_protegidos;
    private String instituicao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getAnimais_protegidos() {
        return animais_protegidos;
    }

    public void setAnimais_protegidos(String animais_protegidos) {
        this.animais_protegidos = animais_protegidos;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
}
