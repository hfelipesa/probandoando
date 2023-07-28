package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner digita = new Scanner(System.in);

       /* String nombreCliente;
        String apellidosCliente;
        Byte edad;
        Short numeroUsoTarjetaMes;
        Double montoComprasAseoTarjeta;
        Double montoComprasAlimenticiosTarjeta;
        Double montoOtrasComprasTarjeta;
        String puntajeCrediticio;

        System.out.println(" ! Bienvenido a beneficios TUYA ¡");
        System.out.println("Diligencie por favor el siguiente formulario:");
        System.out.print("Digite solo nombres: ");
        nombreCliente = digita.nextLine();
        System.out.print("Digite sus apellidos: ");
        apellidosCliente = digita.nextLine();
        System.out.print("Digite su edad: ");
        edad = digita.nextByte();
        System.out.print("Cuantas veces uso la tarjeta durante el último mes: ");
        numeroUsoTarjetaMes = digita.nextShort();
        System.out.print("Cuanto fue el monto en pesos de compras de productos de aseo comprados con la tarjeta: ");
        montoComprasAseoTarjeta = digita.nextDouble();
        System.out.print("Cuanto fue el monto en pesos de compras de productos  alimenticios comprados con la tarjeta: ");
        montoComprasAlimenticiosTarjeta = digita.nextDouble();
        System.out.print("Cuanto fue el monto en pesos de compras de otros de productos  con la tarjeta: ");
        montoOtrasComprasTarjeta = digita.nextDouble();
        digita.nextLine();
        System.out.println("****El puntaje crediticio esta en una escala de 1 a 9*******");
        System.out.print("Cual es su puntaje crediticio: ");
        puntajeCrediticio = digita.nextLine();


        Double totalDeuda = montoComprasAseoTarjeta + montoComprasAlimenticiosTarjeta + montoOtrasComprasTarjeta;

        if (puntajeCrediticio.equals("1")){
            Double descuento = totalDeuda -(totalDeuda * 0.25);
            System.out.println("Apreciado " +nombreCliente+"  tu deuda es de: " +totalDeuda+" pesos." +
                    " Tenemos el gusto de informarte que aplicas a un beneficio," +
                    " que consiste en descuento del 25% de tu deuda");
            System.out.println("Su total a pagar es: " +descuento );
        } else if (puntajeCrediticio.equals("2")) {
            Double descuento = totalDeuda - (totalDeuda * 0.20);
            System.out.println("Apreciado "+nombreCliente+" tu deuda es de: " +totalDeuda+" pesos." +
                    " Tenemos el gusto de informarte que aplicas a un beneficio," +
                    " que consiste en descuento del 20% de tu deuda");
            System.out.println("Su total a pagar es: " +descuento );
        }else if (puntajeCrediticio.equals("3")) {
            Double descuento = totalDeuda - (totalDeuda * 0.15);
            System.out.println("Apreciado "+nombreCliente+" tu deuda es de: " +totalDeuda+" pesos." +
                    " Tenemos el gusto de informarte que aplicas a un beneficio," +
                    " que consiste en descuento del 15% de tu deuda");
            System.out.println("Su total a pagar es: " +descuento );
        }else if (puntajeCrediticio.equals("4")) {
            Double descuento = totalDeuda - (totalDeuda * 0.10);
            System.out.println("Apreciado "+nombreCliente+" tu deuda es de: " +totalDeuda+" pesos." +
                    " Tenemos el gusto de informarte que aplicas a un beneficio," +
                    " que consiste en descuento del 10% de tu deuda");
            System.out.println("Su total a pagar es: " +descuento );
        }else if (puntajeCrediticio.equals("5") ||
                 puntajeCrediticio.equals("6") ||
                 puntajeCrediticio.equals("7") ||
                 puntajeCrediticio.equals("8") ||
                 puntajeCrediticio.equals("9") )
        {
            System.out.println("Apreciado "+nombreCliente+" en este momento no aplica el beneficio. El monto total de su deuda es de $ " + totalDeuda + " pesos."+
            "Te invitamos a mejorar tu puntaje para que puedas aplicar a los beneficios que otorgamos cada mes");
        }*/



       String  cedulaComprador;
       String nombreComprador;
       String apellidosComprador;
       Byte edadComprador;
       String ciudadComprador;
       Byte numeroBoletas;
       Integer precioBoleta = 450000;

        System.out.println("Venta de boletas de última gran gira de Hector y Tito");
        System.out.println("Bienvenido Usuario, diligencia la información para tu compra");

        System.out.print("Digite su número de cedula: ");
        cedulaComprador = digita.nextLine();
        System.out.print("Digite su nombre: ");
        nombreComprador = digita.nextLine();
        System.out.print("Digite sus apellidos: ");
        apellidosComprador = digita.nextLine();
        System.out.print("Digite ciudad: ");
        ciudadComprador = digita.nextLine();
        System.out.print("Digite su edad: ");
        edadComprador = digita.nextByte();
        System.out.print("Digite e número de boletas que desea comprar: ");
        numeroBoletas = digita.nextByte();

        Integer totalBoletas = numeroBoletas * precioBoleta;

        if (edadComprador>17 && numeroBoletas<5) {
            System.out.println(nombreComprador +""+ apellidosComprador );
            System.out.println("Compraste " +numeroBoletas+ " boletas. El valor a pagar es " +totalBoletas);

        } else if (edadComprador<18) {
            System.out.println("Lo sentimos, no tienes edad para la compra");

        } else if (edadComprador>17 && numeroBoletas>4) {
            System.out.println("El número de boletas para la venta es maximo 4 boletas por persona. ");

        }


    }
}