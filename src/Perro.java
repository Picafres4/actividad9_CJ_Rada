public class Perro {

    // declaración de variables con su respectivo modificador private
    private String nombre, color, raza, sexo, tipoComida;
    private int edad;
    private double peso, cantidad;

    // setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // método comer
    public void comer(String tipoComida, double cantidad) {

        // creación nueva variable booleana para determinar si el perrito tiene el estómago vació o lleno mediante
        // la cantidad de comida que haya comido

        boolean perroLleno;
        if (cantidad > 200) {
            perroLleno = true;
        } else {
            perroLleno = false;
        }

        // condicional if que determina un diferente resultado dependiendo de lo que haya comido

        if (perroLleno == true) {
            System.out.println("El perrito ha ingerido " + (cantidad) + " gramos de " + (tipoComida) + " y tiene " +
                    "el estómago lleno, está feliz.");
        } else if (perroLleno == false) {
            System.out.println("El perrito ha ingerido " + (cantidad) + " gramos de " + (tipoComida) + " y tiene " +
                    "el estómago vacío, está triste.");
        }

    }

    // método ladrar
    public String ladrar() {
        return "guau guau";
    }

}
