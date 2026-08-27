class piezaIndustrial{

String codigoPieza;
double longitudMilimetros;
double loongitudEstandar;


public piezaIndustrial(String codigoPieza, double longitudMilimetros, double loongitudEstandar){
    this.codigoPieza = codigoPieza;

    if(longitudMilimetros > 0){
        this.longitudMilimetros = longitudMilimetros;
    }

    if(loongitudEstandar > 0 ){
        this.loongitudEstandar = loongitudEstandar;
    }
}
public boolean esAceptable(){
return Math.abs(this.longitudMilimetros - this.loongitudEstandar) <= 0.5;
}

void mostrarEstado(){
    System.out.println("-------------------------------------------");
    System.out.println("Codigo de pieza: " + codigoPieza);
    System.out.println("Longitud en  milímetros: " + longitudMilimetros);
    System.out.println("Longitud estándar: " + loongitudEstandar);
    System.out.println("-------------------------------------------");
}

public static void main(String[] args) {
    piezaIndustrial p1 = new piezaIndustrial("KRJ3-432", 235.6, 235.0);
    piezaIndustrial p2 = new piezaIndustrial("JU23-846", 240.8, 240.6);
    p1.mostrarEstado();
    System.out.println("Pieza aceptable: " + p1.esAceptable());

    p2.mostrarEstado();
    System.out.println("Pieza aceptable: " + p2.esAceptable());
}
}




    
