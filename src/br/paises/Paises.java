package br.paises;

public class Paises {
    private int ID;
    private String nome;
    private String capital;
    private String regiao;
    private String subregiao;
    private int area;


public void setId (int ID) {
    this.ID = ID;
}

public int getId() {
    return ID;
}

public void setNome (String nome) {
    this.nome = nome;
}

public String getNome() {
    return nome;
}
public void setCapital (String capital) {
    this.capital = capital;
}

public String getCapital() {
    return capital;
}
public void setRegiao(String regiao) {
    this.regiao = regiao;
}

public String getRegiao () {
    return regiao;
}

public void setSubregiao(String subregiao) {
    this.subregiao = subregiao;
}

public String getSubregiao () {
    return subregiao;
}

public void setArea(int area) {
    this.area = area;
}

public int getArea () {
    return area;
}

}