/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafeteria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author farid
 */
public class Cafeteria {

    static Extras extra[] = Extras.values();
    static Leches leche[] = Leches.values();
    static Tamanio tamanio[] = Tamanio.values();
    static ArrayList<Vaso> Cafe = new ArrayList();

    public static void main(String[] args) {
        String opc;
        do {
            try {
                opc = JOptionPane.showInputDialog(null, "Bienvenido a nuestra cafetería =D\n¿Que desea hacer?", "Menú", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Ordenar",
                    "Refill", "Consultar refill restanes", "Salir"}, "Ordenar").toString();
            } catch (Exception error) {
                opc = "Salir";
            }
            switch (opc) {
                case "Ordenar" -> {
                    int opce;
                    Extras e1 = null, e2 = null, e3 = null;
                    Tamanio ttemp = null;
                    Leches ltemp = null;
                    try {
                        opc = JOptionPane.showInputDialog(null, "¿Qué tipo de café quiere?", "Menú", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Expresso",
                            "Capuchino", "Mokaccino"}, "Ordenar").toString();
                    } catch (Exception error) {
                        opc = "";
                    }
                    if (!opc.equals("")) {
                        ttemp = tamanio();
                        opce = JOptionPane.showConfirmDialog(null, "¿Desea agregar algún extra?", "Menú", JOptionPane.YES_NO_OPTION);
                        if (opce == 0) {
                            e1 = OExtra();
                            opce = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro extra?", "Menú", JOptionPane.YES_NO_OPTION);
                            if (opce == 0) {
                                e2 = OExtra();
                                opce = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro extra?", "Menú", JOptionPane.YES_NO_OPTION);
                                if (opce == 0) {
                                    e3 = OExtra();
                                } else {
                                    e3 = null;
                                }
                            } else {
                                e2 = null;
                                e3 = null;
                            }
                        } else {
                            e1 = null;
                            e2 = null;
                            e3 = null;
                        }
                    }
                    switch (opc) {
                        case "Expresso" -> {
                            Expresso cafet = new Expresso();
                            cafet.setTamanio(ttemp);
                            cafet.setExtra1(e1);
                            cafet.setExtra2(e2);
                            cafet.setExtra3(e3);
                            JOptionPane.showMessageDialog(null, cafet.toString() + "\nEl costo es de " + cafet.Precio(), "Precio", JOptionPane.INFORMATION_MESSAGE);
                            Cafe.add(cafet);
                        }
                        case "Capuchino" -> {
                            ltemp = tipoLeche();
                            Capuchino cafet = new Capuchino();
                            cafet.setTamanio(ttemp);
                            cafet.setLeches(ltemp);
                            cafet.setExtra1(e1);
                            cafet.setExtra2(e2);
                            cafet.setExtra3(e3);
                            JOptionPane.showMessageDialog(null, cafet.toString() + "\nEl costo es de " + cafet.Precio(), "Precio", JOptionPane.INFORMATION_MESSAGE);
                            Cafe.add(cafet);
                        }
                        case "Mokaccino" -> {
                            ltemp = tipoLeche();
                            Mokaccino cafet = new Mokaccino();
                            cafet.setTamanio(ttemp);
                            cafet.setLeches(ltemp);
                            cafet.setExtra1(e1);
                            cafet.setExtra2(e2);
                            cafet.setExtra3(e3);
                            JOptionPane.showMessageDialog(null, cafet.toString() + "\nEl costo es de " + cafet.Precio(), "Precio", JOptionPane.INFORMATION_MESSAGE);
                            Cafe.add(cafet);
                        }

                    }
                }
                case "Refill" -> {
                    int numV;
                    numV = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de vaso", 1));
                    JOptionPane.showMessageDialog(null, refill(numV), "Menú", JOptionPane.INFORMATION_MESSAGE);
                }
                case "Consultar refill restanes" -> {
                    int numV;
                    numV = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de vaso", 1));
                    JOptionPane.showMessageDialog(null, consultaRefill(numV), "Menú", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } while (!opc.equals("Salir"));
    }//fin main

    public static Leches tipoLeche() {
        String opc;
        Leches temp = null;
        do {
            try {
                opc = JOptionPane.showInputDialog(null, "¿Que tipo de leche quiere?", "Menú", JOptionPane.QUESTION_MESSAGE, null, leche, Leches.Deslactosada).toString();
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Porfavor slecciona una opción", "Menú", JOptionPane.WARNING_MESSAGE);
                opc = "";
            }
        } while (opc.equals(""));
        switch (opc) {
            case "Deslactosada" -> {
                temp = Leches.Deslactosada;
            }
            case "Nutrileche" -> {
                temp = Leches.Nutrileche;
            }
            case "Entera" -> {
                temp = Leches.Entera;
            }
            case "Lechera" -> {
                temp = Leches.Lechera;
            }
        }//fin switch
        return temp;
    }//fin metodo para elegir el tipo de leche

    public static Extras OExtra() {
        Extras temp = null;
        String opc;
        do {
            try {
                opc = JOptionPane.showInputDialog(null, "¿Que tipo de leche quiere?", "Menú", JOptionPane.QUESTION_MESSAGE, null, extra, Extras.Azucar).toString();
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Porfavor slecciona una opción", "Menú", JOptionPane.WARNING_MESSAGE);
                opc = "";
            }
        } while (opc.equals(""));
        switch (opc) {
            case "Azucar" -> {
                temp = Extras.Azucar;
            }
            case "Galleta" -> {
                temp = Extras.Galleta;
            }
            case "Dona" -> {
                temp = Extras.Dona;
            }
            case "Chocolate" -> {
                temp = Extras.Chocolate;
            }
        }//fin switch opcion
        return temp;
    }//fin orden extra

    public static Tamanio tamanio() {
        Tamanio temp = null;
        String opc;
        do {
            try {
                opc = JOptionPane.showInputDialog(null, "¿De que tamaño lo quiere?", "Menú", JOptionPane.QUESTION_MESSAGE, null, tamanio, Tamanio.Chico).toString();
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Porfavor slecciona una opción", "Menú", JOptionPane.WARNING_MESSAGE);
                opc = "";
            }
        } while (opc.equals(""));
        switch (opc) {
            case "Chico" -> {
                temp = Tamanio.Chico;
            }
            case "Mediano" -> {
                temp = Tamanio.Mediano;
            }
            case "Grande" -> {
                temp = Tamanio.Grande;
            }
        }//fin switch
        return temp;
    }//fin tamaño del café

    public static String refill(int numv) {
        String temp = "Vaso no encontrado";
        for (Vaso c : Cafe) {
            if (c.getNumVaso1() == numv) {
                temp = c.toString() + c.Refill();
                break;
            }
        }
        return temp;
    }

    public static String consultaRefill(int numv) {
        String temp = "Vaso no encontrado";
        for (Vaso c : Cafe) {
            if (c.getNumVaso1() == numv) {
                temp = c.toString() + c.Refillr();
                break;
            }
        }
        return temp;
    }
}
