import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {
    private static Map<String, Contacto> agenda = new HashMap<>();
    private static Scanner in = new Scanner(System.in);
    private static int ind = 0;

    public static void main(String[] args) {
        int opcion = 0;

        //Registros de prueba para testeo
        agenda.put("Prueba1", new Contacto("Nico","Bau",488,482,7, 341, 623));
        agenda.put("Prueba2", new Contacto("Mario","Beron",48,49, 7));
        agenda.put("Prueba3", new Contacto("Jorge","Cardozo",482));
        agenda.put("Prueba4", new Contacto("Marta","Martel",4,49));
        //Registros de prueba para testeo

        System.out.println("Bienvenido a la agenda telefonica!!");

        while (opcion != 5) {
        try {
            System.out.println("Ingrese una opción y presione enter" + '\n');
            System.out.println(
                            "1. Ingresar nuevo contacto\n" +
                            "2. Eliminar contacto\n" +
                            "3. Modificar datos\n" +
                            "4. Buscar un contacto\n" +
                            "5. Salir");

            opcion = in.nextInt();
            System.out.println('\n' + "Seleccionaste la opción " + opcion);

        switch (opcion) {
            case 1:
                Agregar();
                break;
            case 2:
                Eliminar();
                break;
            case 3:
                Modificar();
                break;
            case 4:
                Buscar();
                break;
            case 5:
                System.out.println('\n' + "Saliendo, hasta luego!");
                break;
            default:
                System.out.println("Opcion invalida, intente nuevamente" + '\n');
                break;
        }
        } catch (Exception e) {
            System.out.println("La opcion debe ser un numero entero. Intente nuevamente" + '\n');
            in.nextLine();
        }
        }
    }

    public static void Agregar() {
        boolean bandera;
        int cas, tra, cel, ot1, ot2;
        String nombre_ins, nom, ape;

        bandera = true;

        while (bandera) {
            try {
                bandera = false;
                System.out.println("Ingrese los datos del contacto");
                nombre_ins = "Contacto " + ind;
                System.out.println("Ingrese el nombre");
                in.nextLine();
                nom = in.nextLine();
                System.out.println("Ingrese apellido");
                ape = in.nextLine();
                System.out.println("Ingrese el Telefono de la casa");
                cas = in.nextInt();
                System.out.println("Ingrese el telefono celular");
                cel = in.nextInt();
                System.out.println("Ingrese el telefono del trabajo");
                tra = in.nextInt();
                System.out.println("Ingrese un telefono extra");
                ot1 = in.nextInt();
                System.out.println("Ingrese otro telefono extra");
                ot2 = in.nextInt();
                agenda.put(nombre_ins, new Contacto(nom, ape, cas, cel, tra, ot1, ot2));
                System.out.println("Usted ha creado el siguiente contacto " + '\n' + "Identificador: " + nombre_ins + '\n' + agenda.get(nombre_ins).toString());
                ind++;
            } catch (Exception e) {
                System.out.println("Error en los datos ingresados. Por favor intente nuevamente" + '\n');
                in.nextLine();
                bandera = true;
            }
        }
    }

    public static void Eliminar() {
        String busq, conf;

        System.out.println("Ingrese el identificador del contacto a eliminar ");
        in.nextLine();
        busq = in.nextLine();

        if (agenda.containsKey(busq)) {
            System.out.println("Esta seguro que desea aliminar a " + agenda.get(busq).getNombre() + " " + agenda.get(busq).getApellido());
            System.out.println("Presione s para confirmar o cualquier otra tecla para cancelar");
            conf = in.nextLine();
            if (conf.equals("s")) {
                agenda.remove(busq);
                System.out.println("Contacto eliminado");
            } else {
                System.out.println("Operacion cancelada, volviendo al menu");
            }
        } else {
            System.out.println("Resgitro no encontrado, volviendo al menu");
        }
    }

    public static void Modificar() {
        String busq, dato;
        int opcion, nume;
        boolean bandera;

        bandera = true;
        opcion = 0;

        System.out.println("Ingrese el identificador del contacto a modificar ");
        in.nextLine();
        busq = in.nextLine();

        if (agenda.containsKey(busq)) {
            System.out.println("Se modificara el contacto " + agenda.get(busq).getNombre() + " " + agenda.get(busq).getApellido());
            System.out.println("Los datos contenidos son: " + agenda.get(busq).toString());
          //  System.out.println("Elija el dato que desea modificar o presione 8 para volver al menu: ");
            while (opcion != 8) {
                try {
                    System.out.println("Ingrese el dato que desea modificar y presione enter" + '\n');
                    System.out.println(
                                    "1. Nombre\n" +
                                    "2. Apellido\n" +
                                    "3. Telefono casa\n" +
                                    "4. Telefono celular\n" +
                                    "5. Telefono trabajo\n" +
                                    "6. Otro telefono 1\n" +
                                    "7. Otro telefono 2 \n" +
                                    "8. Volver al menu");

                    opcion = in.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("El nombre almacenado es: "+agenda.get(busq).getNombre());
                            System.out.println("Ingrese el nuevo nombre:" + '\n');
                            in.nextLine();
                            dato = in.nextLine();
                            agenda.get(busq).setNombre(dato);
                            System.out.println("se ha escrito el nombre: "+agenda.get(busq).getNombre());
                            break;
                        case 2:
                            System.out.println("El apellido almacenado es: "+agenda.get(busq).getApellido());
                            System.out.println("Ingrese el nuevo apellido:" + '\n');
                            in.nextLine();
                            dato = in.nextLine();
                            agenda.get(busq).setApellido(dato);
                            System.out.println("se ha escrito el apellido: "+agenda.get(busq).getNombre());
                            break;
                        case 3:
                            System.out.println("El numero de casa almacenado es: "+agenda.get(busq).getCasa());
                            System.out.println("Ingrese el nuevo numero:" + '\n');
                            in.nextInt();
                            nume = in.nextInt();
                            agenda.get(busq).setCasa(nume);
                            System.out.println("se ha escrito el nombre: "+agenda.get(busq).getCasa());
                            break;
                        case 4:
                            System.out.println("El numero celular almacenado es: "+agenda.get(busq).getCelular());
                            System.out.println("Ingrese el nuevo numero:" + '\n');
                            in.nextInt();
                            nume = in.nextInt();
                            agenda.get(busq).setCelular(nume);
                            System.out.println("se ha escrito el nombre: "+agenda.get(busq).getCelular());
                            break;
                        case 5:
                            System.out.println("El numero de trabajo almacenado es: "+agenda.get(busq).getTrabajo());
                            System.out.println("Ingrese el nuevo numero:" + '\n');
                            in.nextInt();
                            nume = in.nextInt();
                            agenda.get(busq).setTrabajo(nume);
                            System.out.println("se ha escrito el nombre: "+agenda.get(busq).getTrabajo());
                            break;
                        case 6:
                            System.out.println("El primer numero extra almacenado es: "+agenda.get(busq).getOtro1());
                            System.out.println("Ingrese el nuevo numero:" + '\n');
                            in.nextInt();
                            nume = in.nextInt();
                            agenda.get(busq).setOtro1(nume);
                            System.out.println("se ha escrito el nombre: "+agenda.get(busq).getOtro1());
                            break;
                        case 7:
                            System.out.println("El primer numero extra almacenado es: "+agenda.get(busq).getOtro2());
                            System.out.println("Ingrese el nuevo numero:" + '\n');
                            in.nextInt();
                            nume = in.nextInt();
                            agenda.get(busq).setOtro2(nume);
                            System.out.println("se ha escrito el nombre: "+agenda.get(busq).getOtro2());
                        case 8:
                            System.out.println('\n' + "Volviendo al menu");
                            break;
                        default:
                            System.out.println("Opcion invalida, intente nuevamente" + '\n');
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("La opcion debe ser un numero entero. Intente nuevamente" + '\n');
                    in.nextLine();
                }
            }
        } else {
            System.out.println("Resgitro no encontrado, volviendo al menu");
        }
    }

    public static void Buscar() {
        String parambusq;
        int intbusq, numreg;

        numreg = 1;

        System.out.println("Ingrese algun parametro de busqueda: ");
        in.nextLine();
        parambusq = in.nextLine();
        if (agenda.containsKey(parambusq)) {
            System.out.println("Se ha encontrado el siguiente registro: " + agenda.get(parambusq).toString());
        } else if (esINT(parambusq)) {
            intbusq = Integer.parseInt(parambusq);
            for (Object key : agenda.keySet()) {
                if (agenda.get(key).getCasa() == intbusq) {
                    System.out.println(numreg + " - Se ha encontrado el siguiente registro: " + agenda.get(key).toString());
                    numreg++;
                } else if (agenda.get(key).getTrabajo() == intbusq) {
                    System.out.println(numreg + " - Se ha encontrado el siguiente registro: " + agenda.get(key).toString());
                    numreg++;
                } else if (agenda.get(key).getCelular() == intbusq) {
                    System.out.println(numreg + " - Se ha encontrado el siguiente registro: " + agenda.get(key).toString());
                    numreg++;
                } else if (agenda.get(key).getOtro1() == intbusq) {
                    System.out.println(numreg + " - Se ha encontrado el siguiente registro: " + agenda.get(key).toString());
                    numreg++;
                } else if (agenda.get(key).getOtro2() == intbusq) {
                    System.out.println(numreg + " - Se ha encontrado el siguiente registro: " + agenda.get(key).toString());
                    numreg++;
                }
            }
        } else if (!esINT(parambusq)) {
            for (Object key : agenda.keySet()) {
                if (agenda.get(key).getNombre().equals(parambusq)) {
                    System.out.println(numreg + " - Se ha encontrado el siguiente registro: " + agenda.get(key).toString());
                    numreg++;
                } else if (agenda.get(key).getApellido().equals(parambusq)) {
                    System.out.println(numreg + " - Se ha encontrado el siguiente registro: " + agenda.get(key).toString());
                    numreg++;
                }
            }
        } else {
            System.out.println("No se han encontrado coincidencias. Revise mayusculas en nombres propios o codigo unico");
        }
    }

    public static boolean esINT(String ingreso) {
        if (ingreso == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(ingreso);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
