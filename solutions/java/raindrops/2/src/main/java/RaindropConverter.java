class RaindropConverter {

    String convert(int number) {
        String raindropSound = "";

        if (number % 3 == 0) {
            raindropSound += "Pling";
        }

        if (number % 5 == 0) {
            raindropSound += "Plang";
        }

        if (number % 7 == 0) {
            raindropSound += "Plong";
        }
        
        if (raindropSound.length() == 0) {
            return Integer.toString(number);
        }

        return raindropSound;
    }

}
