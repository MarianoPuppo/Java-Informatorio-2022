

public class Empleado {


    public String nombre;
    public String apellido;
    public Integer dni;
    public Integer horasTrabajadas;
    public Integer valorPorHora;


    public Empleado(String nombre, String apellido, int dni, int horasTrabajadas, int valorPorHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = Integer.valueOf(dni);
        this.horasTrabajadas = Integer.valueOf(horasTrabajadas);
        this.valorPorHora = Integer.valueOf(valorPorHora);

    }

    public String getNombre() {
        return nombre;
    }

//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }

    public String getApellido() {
        return apellido;
    }

//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }

    public Integer getDni() {
        return dni;
    }

//    public void setDni(String dni) {
//        this.dni = Integer.valueOf(dni);
//    }

    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }

//    public void setHorasTrabajadas(String horasTrabajadas) {
//        this.horasTrabajadas = Integer.valueOf(horasTrabajadas);


    public Integer getValorPorHora() {
        return valorPorHora;
    }

//    public void setValorPorHora(String valorPorHora) {
//        this.valorPorHora = Integer.valueOf(valorPorHora);
//    }

    public int calcularSueldo() {
        return (horasTrabajadas * valorPorHora);
    }

    //    @Override
//    public String toString() {
//        return "Empleado{" +
//                "nombre='" + nombre + '\'' +
//                ", apellido='" + apellido + '\'' +
//                ", dni='" + dni + '\'' +
//                ", horasTrabajadas='" + horasTrabajadas + '\'' +
//                ", valorPorHora='" + valorPorHora + '\'' +
//                '}';
//    }
    @Override
    public String toString() {
        return "{" + "nombre:" + nombre + ", apellido:" + apellido + "}";
    }



}
