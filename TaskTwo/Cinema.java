
    package TaskTwo;

    public class Cinema {
        String[][] seats;


        // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
        // Sæder, der ikke er reserveret, har værdien "O"
        public Cinema(int rows, int seats) {
            this.seats = new String[rows][seats];
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < seats; j++) {
                    this.seats[i][j] = "O";

                }
            }

        }

        public int getRows() {
            return seats.length;
        }

        public int getSeats() {
            return seats[0].length;
        }

        // If the seat is not yet reserved, it's value is O.
        // In that case, change the value to X and return true.
        // If the seat is already reserved, return false.
        public boolean reserve(int row, int seat) {
            if(row < 0 || row >= getRows() || seat < 0 || seat >= getSeats()) {
                return false;
            }
            if (seats[row][seat].equals("O")) {
                seats[row][seat] = "X";
                return true;
            }
            return false;
        }

        public boolean cancelReservation(int row, int seat) {
            if(row < 0 || row >= getRows() || seat < 0 || seat >= getSeats()) {
                return false;
            }
            if (seats[row][seat].equals("O")) {
                seats[row][seat] = "X";
                return true;
            }
            return false;
        }

        public String toString() {
            String result = ""; // fjernet null og givet en tom string
            for (int i = 0; i < seats.length; i++) {
                result += "|";
                for (int j = 0; j < seats[i].length; j++) {
                    result += seats[i][j] + "|";
                }
                result += "\n";
            }
            return result;
        }
    }

