package edu.co.sergio.mundo.vo;



  

public class Registro{
      private int idColmena;
     
    private String poblaci�n ;
    
    private boolean PresenciaReinaColmena ;
    
    private boolean   producci�nDeMiel ;
    
    private int  panalesConCera ;
    
    private int panalesConAlimento ;
    
    private int  panalesConCr�a ;
    
    private int panalesVac�os ;

    public int getIdColmena() {
        return idColmena;
    }

    public String getPoblaci�n() {
        return poblaci�n;
    }

    public boolean isPresenciaReinaColmena() {
        return PresenciaReinaColmena;
    }

    public boolean isProducci�nDeMiel() {
        return producci�nDeMiel;
    }

    public int getPanalesConCera() {
        return panalesConCera;
    }

    public int getPanalesConAlimento() {
        return panalesConAlimento;
    }

    public int getPanalesConCr�a() {
        return panalesConCr�a;
    }

    public int getPanalesVac�os() {
        return panalesVac�os;
    }

    public void setIdColmena(int idColmena) {
        this.idColmena = idColmena;
    }

    public void setPoblaci�n(String poblaci�n) {
        this.poblaci�n = poblaci�n;
    }

    public void setPresenciaReinaColmena(boolean PresenciaReinaColmena) {
        this.PresenciaReinaColmena = PresenciaReinaColmena;
    }

    public void setProducci�nDeMiel(boolean producci�nDeMiel) {
        this.producci�nDeMiel = producci�nDeMiel;
    }

    public void setPanalesConCera(int panalesConCera) {
        this.panalesConCera = panalesConCera;
    }

    public void setPanalesConAlimento(int panalesConAlimento) {
        this.panalesConAlimento = panalesConAlimento;
    }

    public void setPanalesConCr�a(int panalesConCr�a) {
        this.panalesConCr�a = panalesConCr�a;
    }

    public void setPanalesVac�os(int panalesVac�os) {
        this.panalesVac�os = panalesVac�os;
    } 
}
