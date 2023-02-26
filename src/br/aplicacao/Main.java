package br.aplicacao;

import br.paises.Paises;
import br.paisesDAO.PaisesDAO;

public class Main {
    
    public static void main(String[] args) {
        
        PaisesDAO paisesDAO = new PaisesDAO();

        Paises paises = new Paises();
        paises.setNome("Nova Zelandia");
        paises.setCapital("Wellington");
        paises.setRegiao("Oceânia");
        paises.setSubregiao(null);
        paises.setArea(268021);

        paisesDAO.save(paises);
    }
}
