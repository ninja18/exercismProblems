class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        if (numberToCheck >= 0 && numberToCheck < 10)
            return true;

        if (numberToCheck >= 10 && numberToCheck < 100)
            return false;

        int reservedNumber = numberToCheck;
        int sum = 0;

        while (reservedNumber != 0) {
            int remainder = reservedNumber % 10;
            sum += Math.pow(remainder, (int)Math.floor(1 + Math.log10(numberToCheck)));
            reservedNumber /= 10;
        }

        return sum == numberToCheck;
    }

}
