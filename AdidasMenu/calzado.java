
class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

class Calzado extends Producto {
        private String foto;
        private String talla;
        private String color;
        private boolean envio;
    
        public Calzado(String nombre, double precio, String foto, String talla, String color, boolean envio) {
            super(nombre, precio);
            this.foto = foto;
            this.talla = talla;
            this.color = color;
            this.envio = envio;
        }
    
        public String getFoto() {
            return foto;
        }
    
        public String getTalla() {
            return talla;
        }
    
        public String getColor() {
            return color;
        }
    
        public boolean tieneEnvio() {
            return envio;
        }
    }
    