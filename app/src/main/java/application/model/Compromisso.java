package application.model;

import java.util.Calendar;

public class Compromisso extends AbstractAtividade {
    private Calendar dataInicial;
    private Calendar dataFinal;
    
    public Calendar getDataInicial() {
        return dataInicial;
    }
    public void setDataInicial(Calendar dataInicial) {
        this.dataInicial = dataInicial;
    }
    public Calendar getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }
    @Override
    public String getDetalhes() {
        return "[C] " + this.getDescricao() + " :: "
            + this.getDataInicial().getTime() + " :: "
            + this.getDataFinal().getTime();
    } 
}
