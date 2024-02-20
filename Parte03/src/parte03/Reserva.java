package parte03;

import java.util.Date;

public class Reserva {
    private Livro livro;
    private Date dataReserva;

    public Reserva(Livro livro, Date dataReserva) {
        this.livro = livro;
        this.dataReserva = dataReserva;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }
}
