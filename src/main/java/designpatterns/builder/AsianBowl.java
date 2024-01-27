package designpatterns.builder;

public class AsianBowl {

    private boolean rice;
    private boolean noodles;
    private boolean broccoli;
    private boolean beef;
    private boolean chicken;
    private boolean mushrooms;
    private boolean bellPepper;
    private boolean carrot;
    private boolean squash;

    public static AsianBowlBuilder getBuilder() {
        return new AsianBowlBuilder();
    }

    // Inner class
    public static class AsianBowlBuilder {

        private AsianBowlBuilder() {

        }

        private boolean rice;
        private boolean noodles;
        private boolean broccoli;
        private boolean beef;
        private boolean chicken;
        private boolean mushrooms;
        private boolean bellPepper;
        private boolean carrot;
        private boolean squash;

        public AsianBowlBuilder rice(boolean rice) {
            this.rice = rice;
            return this;
        }

        public AsianBowlBuilder noodles(boolean noodles) {
            this.noodles = noodles;
            return this;
        }

        public AsianBowlBuilder broccoli(boolean broccoli) {
            this.broccoli = broccoli;
            return this;
        }

        public AsianBowlBuilder beef(boolean beef) {
            this.beef = beef;
            return this;
        }

        public AsianBowlBuilder chicken(boolean chicken) {
            this.chicken = chicken;
            return this;
        }

        public AsianBowlBuilder mushrooms(boolean mushrooms) {
            this.mushrooms = mushrooms;
            return this;
        }

        public AsianBowlBuilder bellPepper(boolean bellPepper) {
            this.bellPepper = bellPepper;
            return this;

        }

        public AsianBowlBuilder carrot(boolean carrot) {
            this.carrot = carrot;
            return this;
        }

        public AsianBowlBuilder squash(boolean squash) {
            this.squash = squash;
            return this;
        }

        public AsianBowl build() {
            return new AsianBowl(this);
        }
    }
    private AsianBowl(AsianBowlBuilder builder) {
        this.rice = builder.rice;
        this.noodles = builder.noodles;
        this.broccoli = builder.broccoli;
        this.beef = builder.beef;
        this.chicken = builder.chicken;
        this.mushrooms = builder.mushrooms;
        this.bellPepper = builder.bellPepper;
        this.carrot = builder.carrot;
        this.squash = builder.squash;
    }

    public boolean isRice() {
        return rice;
    }

    public boolean isNoodles() {
        return noodles;
    }

    public boolean isBroccoli() {
        return broccoli;
    }

    public boolean isBeef() {
        return beef;
    }

    public boolean isChicken() {
        return chicken;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public boolean isBellPepper() {
        return bellPepper;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isSquash() {
        return squash;
    }
}
