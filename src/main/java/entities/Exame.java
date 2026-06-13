package entities;

public class Exame {
    private int idExame; // vai guarda o id do exame que vai ser unico
    private  int idConsulta; // do id da consulta
    private String tipoExame; // vai guarda o tipo do exame
    private String dataExame; // vai guarda a data que foi realizado o exame
    private String resultado; // vai ser para guarda o resultado do exame
    private String status;// vai guarda a situaçao do exame
    private  double valor; // guarda o valor que e do exame

    public Exame(){
        // esse construtor vazio ele vai servi para permitir criar um objeto sem informa os seus dados imetiatamente
    }

    public Exame(int idConsulta, String tipoExame, String dataExame, String resultado, String status, double valor ){
        this.idConsulta = idConsulta;
        this.tipoExame = tipoExame;
        this.dataExame = dataExame; // construtor que tem todas as informaçoes
        this.resultado = resultado;
        this.status = status;
        this.valor = valor;
    }
    // gets e settes para ler e altera as informaçoes
    public int getIdExame() {
        return idExame;
    }

    public void setIdExame(int idExame) {
        this.idExame = idExame;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public String getDataExame() {
        return dataExame;
    }

    public void setDataExame(String dataExame) {
        this.dataExame = dataExame;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
