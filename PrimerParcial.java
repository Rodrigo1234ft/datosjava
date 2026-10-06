public class PrimerParcial {

    static class Identificador<T> {
        T dato;
        Identificador(T dato){ this.dato = dato; }

        String identificar(){
            if(dato instanceof Integer) return "Ingresaste un Entero";
            if(dato instanceof Float) return "Ingresaste un float";
            if(dato instanceof Double) return "Ingresaste un Double";
            if(dato instanceof Character) return "Ingresaste un Caracter";
            return "Ingresaste una cadena";
        }
    }

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Uso: java PrimerParcial <valor>");
            return;
        }

        String v = args[0].trim();

        // CARACTER: 'a' o a
        if(v.matches("'^[A-Za-z]'") || v.matches("'[A-Za-z]'")){
            char c = v.charAt(1);
            Identificador<Character> id = new Identificador<>(c);
            System.out.println(id.identificar());
            return;
        }
        if(v.length() == 1 && Character.isLetter(v.charAt(0))){
            Identificador<Character> id = new Identificador<>(v.charAt(0));
            System.out.println(id.identificar());
            return;
        }

        // ENTERO: 7, -15
        if(v.matches("-?\\d+")){
            Identificador<Integer> id = new Identificador<>(Integer.parseInt(v));
            System.out.println(id.identificar());
            return;
        }

        // FLOAT con f: 3.14f
        if(v.toLowerCase().matches("-?\\d+\\.\\d+f")){
            Identificador<Float> id = new Identificador<>(Float.parseFloat(v.toLowerCase().replace("f","")));
            System.out.println(id.identificar());
            return;
        }

        // DOUBLE o FLOAT: 3.14
        if(v.matches("-?\\d+\\.\\d+")){
            if(v.split("\\.")[1].length() > 6){
                Identificador<Double> id = new Identificador<>(Double.parseDouble(v));
                System.out.println(id.identificar());
            }else{
                Identificador<Float> id = new Identificador<>(Float.parseFloat(v));
                System.out.println(id.identificar());
            }
            return;
        }

        // CADENA: todo lo demas
        String limpio = v.replace("\"", "");
        Identificador<String> id = new Identificador<>(limpio);
        System.out.println(id.identificar());
    }
}
