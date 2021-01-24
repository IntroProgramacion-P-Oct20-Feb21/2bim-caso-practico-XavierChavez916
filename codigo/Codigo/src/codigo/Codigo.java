/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.Scanner;

/**
 *
 * @author xavierchavez
 */
public class Codigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        boolean bandera = true;
        String salida;
        int contador = 0;

        while (bandera) {
            contador += 1;
            System.out.println("*-------------- Menú de opciones -------------*");
            System.out.println("> Si ingresa 1 se creara una cuenta de Facebook.\n"
                    + "> Si ingresa 2 se creara una cuenta de Twitter.\n"
                    + "> Si ingresa 3 se creara una cuenta de Whatsapp.\n"
                    + "> Si ingresa 4 se creara una cuenta de Telegram.\n"
                    + "> Si ingresa 5 se creara una cuenta de Signal.\n"
                    + "> Si ingresa 6 se creara una cuenta de Instagram.\n"
                    + "> Si ingresa 7 se creara una cuenta de Flickr.\n"
                    + "*--------------------<***>--------------------*");
            opcion = entrada.nextInt();
            if (opcion == 1) {
                System.out.printf("%s", crearFacebook());
            } else {
                if (opcion == 2) {
                    crearTwitter();
                } else {
                    if (opcion == 3) {
                        System.out.printf("%s", crearWhatsapp());
                    } else {
                        if (opcion == 4) {
                            crearTelegram();
                        } else {
                            if (opcion == 5) {
                                System.out.printf("%s", crearSignal());
                            } else {
                                if (opcion == 6) {
                                    crearInstagram();
                                } else {
                                    if (opcion == 7) {
                                        System.out.printf("%s", crearFlickr());
                                    } else {
                                        System.out.println("Opcion Incorrecta.");
                                    }

                                }
                            }
                        }
                    }
                }
            }
            entrada.nextLine();
            System.out.println("\nIngrese (si) si desea salir del ciclo");
            salida = entrada.nextLine();
            salida = salida.toLowerCase();
            if (salida.equals("si")) {
                bandera = false;
            }
        }
        obtenerMensaje(contador);
    }

    public static String crearFacebook() {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int edad;
        String ciudad;
        String pais;
        String correo;
        String cadena;
        System.out.println("*-- Usted eligió la opción para crear una cuenta "
                + "de Facebook --*");
        System.out.println("Ingrese su nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país");
        pais = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico");
        correo = entrada.nextLine();
        cadena = String.format("*--------- Datos Ingresados ---------*\n"
                + "Usuario: %s\nEdad: %s\nCiudad: %s\nPais: %s\nCorreo: %s\n"
                + "*----------------<***>---------------*",
                usuario, edad, ciudad, pais, correo);
        return cadena;
    }

    public static void crearTwitter() {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String correo;
        String apellidos;
        int edad;
        String ciudad;
        String pais;
        String idioma;
        System.out.println("*-- Usted eligió la opción para crear una cuenta "
                + "de Twitter --*");
        System.out.println("Ingrese su nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese sus apellidos");
        apellidos = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país");
        pais = entrada.nextLine();
        System.out.println("Ingrese su idioma");
        idioma = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico");
        correo = entrada.nextLine();
        System.out.printf("*--------- Datos Ingresados ---------*\n"
                + "Nombre de Usuario: %s\nApellidos: %s\nEdad: %s\n"
                + "Ciudad: %s\nPaís: %s\nIdioma: %s\nCorreo Electrónico: %s\n"
                + "*----------------<***>---------------*",
                usuario, apellidos, edad, ciudad, pais, idioma, correo);
    }

    public static String crearWhatsapp() {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int edad;
        String ciudad;
        String pais;
        int telefono;
        String cadena;
        System.out.println("*-- Usted eligió la opción para crear una cuenta "
                + "de Whatsapp --*");
        System.out.println("Ingrese su nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su número de teléfono");
        telefono = entrada.nextInt();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país");
        pais = entrada.nextLine();
        cadena = String.format("*--------- Datos Ingresados ---------*\n"
                + "Usuario: %s\nNúmero de teléfono: %s\nEdad: %s\n"
                + "Ciudad: %s\nPais: %s\n"
                + "*----------------<***>---------------*",
                usuario, telefono, edad, ciudad, pais);
        return cadena;
    }

    public static void crearTelegram() {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String areaInteres;
        String ciudad;
        String pais;
        int telefono;
        System.out.println("*-- Usted eligió la opción para crear una cuenta "
                + "de Telegram --*");
        System.out.println("Ingrese su nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su número de teléfono");
        telefono = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país");
        pais = entrada.nextLine();
        System.out.println("Ingrese su área de interés");
        areaInteres = entrada.nextLine();
        System.out.printf("*--------- Datos Ingresados ---------*\n"
                + "Nombre de Usuario: %s\nNúmero de teléfono: %s\n"
                + "Ciudad: %s\nPais: %s\nÁrea de interés: %s\n"
                + "*----------------<***>---------------*",
                usuario, telefono, ciudad, pais, areaInteres);
    }

    public static String crearSignal() {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String hobby;
        String ciudad;
        String pais;
        int telefono;
        String cadena;
        System.out.println("*-- Usted eligió la opción para crear una cuenta "
                + "de Signal --*");
        System.out.println("Ingrese su nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su número de teléfono");
        telefono = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país");
        pais = entrada.nextLine();
        System.out.println("Ingrese su Hobby principal");
        hobby = entrada.nextLine();
        cadena = String.format("*--------- Datos Ingresados ---------*\n"
                + "Nombre de Usuario: %s\nNúmero de teléfono: %s\n"
                + "Ciudad: %s\nPaís: %s\nHobby: %s\n"
                + "*----------------<***>---------------*",
                usuario, telefono, ciudad, pais, hobby);
        return cadena;
    }

    public static void crearInstagram() {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int edad;
        String ciudad;
        String correo;
        System.out.println("*-- Usted eligió la opción para crear una cuenta "
                + "de Instagram --*");
        System.out.println("Ingrese su Usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su correo electronico");
        correo = entrada.nextLine();
        System.out.printf("*--------- Datos Ingresados ---------*\n"
                + "Usuario: %s\nCiudad: %s\nEdad: %s\nCorreo: %s\n"
                + "*----------------<***>---------------*",
                usuario, ciudad, edad, correo);
    }

    public static String crearFlickr() {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String correo;
        String cadena;
        System.out.println("*-- Usted eligió la opción para crear una cuenta "
                + "de Flickr --*");
        System.out.println("Ingrese su nombre de usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico");
        correo = entrada.nextLine();

        cadena = String.format("*--------- Datos Ingresados ---------*\n"
                + "Nombre de Usuario: %s\nCorreo Electrónico: %s\n"
                + "*----------------<***>---------------*",
                usuario, correo);
        return cadena;
    }

    public static void obtenerMensaje(int a) {
        String cadena = "";
        String[] mensajeFinal = {"Campaña con poca afluencia",
            "Campaña moderada siga adelante", "Excelente campaña"};
        if ((a >= 1) && (a <= 5)) {
            cadena = mensajeFinal[0];
        } else {
            if ((a >= 6) && (a <= 15)) {
                cadena = mensajeFinal[1];
            } else {
                if (a >= 16) {
                    cadena = mensajeFinal[2];
                }
            }
        }
        System.out.println(cadena);
    }
}
