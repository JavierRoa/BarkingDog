public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        /* Primera condición: Validación de las horas posibles
           Segunda condición: Comprobación de las horas de sueño
           Tercera condición: el perro está ladrando (barking = true) */
        return !(hourOfDay < 0 || hourOfDay > 23) && (hourOfDay < 8 || hourOfDay > 22) && barking;
    }
}
