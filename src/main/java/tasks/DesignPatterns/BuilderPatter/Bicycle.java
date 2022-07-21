package tasks.DesignPatterns.BuilderPatter;

public class Bicycle {
    //All final attributes
    private final String gears; // required
    private final String stand; // required
    private final int seats; // optional
    private final String carrier; // optional

    private Bicycle(BicycleBuilder builder) {
        this.gears = builder.gears;
        this.stand = builder.stand;
        this.seats = builder.seats;
        this.carrier = builder.carrier;
    }
    //All getter, and NO setter to provide immutability
    public String getGears() {
        return gears;
    }

    public String getStand() {
        return stand;
    }

    public int getSeats() {
        return seats;
    }

    public String getCarrier() {
        return carrier;
    }

    @Override
    public String toString() {
        return "Bicycle: "+ "No. Of Gears " +this.gears+",   \"StandType\"  " +this.stand+",  \"No. of Seats\" " +this.seats+", \"Carrier\"  " +this.carrier;
    }
    public static class BicycleBuilder
    {
        private final String gears;
        private final String stand;
        private int seats;
        private String carrier;

        public BicycleBuilder(String gears, String stand) {
            this.gears = gears;
            this.stand = stand;
        }

        public BicycleBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }

        public BicycleBuilder carrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public Bicycle build() {
            Bicycle bicycle =  new Bicycle(this);
            return bicycle;
        }

        public static void main(String[] args)
        {
            Bicycle bicycleOne = new BicycleBuilder("six", "single")
                    .seats(2)
                    .carrier("extra carrier")
                    .build();

            System.out.println(bicycleOne);

            Bicycle bicycleTwo = new Bicycle.BicycleBuilder("eight", "double")
                    .seats(1)
                    //no carrier
                    .build();

            System.out.println(bicycleTwo);

            Bicycle bicycleThree = new Bicycle.BicycleBuilder("twelve", "side")
                    //No seats
                    //No carrier
                    .build();

            System.out.println(bicycleThree);
        }
    }



}

