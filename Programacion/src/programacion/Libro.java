
package programacion;

public class Libro {
    private String autor = null;
    private int fecha = 0;
    private String titulo = null;

    public void setAutor(String escritor)
    {
        autor = escritor;
    }
    public void setTitulo(String portada)
    {
        titulo = portada;
    }
    public void setAno(int ano)
    {
        fecha = ano;
    }
    public String getAutor()
    {
        return autor;
    }
    public String getTitulo()
    {
        return titulo;
    }
    public int getAno()
    {
        return fecha;
    }
}
