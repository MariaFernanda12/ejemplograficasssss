package edu.co.sergio.mundo.vo;



  

public class Registro{
      private int idColmena;
     
    private String población ;
    
    private boolean PresenciaReinaColmena ;
    
    private boolean   producciónDeMiel ;
    
    private int  panalesConCera ;
    
    private int panalesConAlimento ;
    
    private int  panalesConCría ;
    
    private int panalesVacíos ;

    public int getIdColmena() {
        return idColmena;
    }

    public String getPoblación() {
        return población;
    }

    public boolean isPresenciaReinaColmena() {
        return PresenciaReinaColmena;
    }

    public boolean isProducciónDeMiel() {
        return producciónDeMiel;
    }

    public int getPanalesConCera() {
        return panalesConCera;
    }

    public int getPanalesConAlimento() {
        return panalesConAlimento;
    }

    public int getPanalesConCría() {
        return panalesConCría;
    }

    public int getPanalesVacíos() {
        return panalesVacíos;
    }

    public void setIdColmena(int idColmena) {
        this.idColmena = idColmena;
    }

    public void setPoblación(String población) {
        this.población = población;
    }

    public void setPresenciaReinaColmena(boolean PresenciaReinaColmena) {
        this.PresenciaReinaColmena = PresenciaReinaColmena;
    }

    public void setProducciónDeMiel(boolean producciónDeMiel) {
        this.producciónDeMiel = producciónDeMiel;
    }

    public void setPanalesConCera(int panalesConCera) {
        this.panalesConCera = panalesConCera;
    }

    public void setPanalesConAlimento(int panalesConAlimento) {
        this.panalesConAlimento = panalesConAlimento;
    }

    public void setPanalesConCría(int panalesConCría) {
        this.panalesConCría = panalesConCría;
    }

    public void setPanalesVacíos(int panalesVacíos) {
        this.panalesVacíos = panalesVacíos;
    } 
}
