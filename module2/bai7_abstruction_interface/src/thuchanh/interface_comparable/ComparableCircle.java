package thuchanh.interface_comparable;


    public class ComparableCircle extends Circle1
            implements Comparable<ComparableCircle> {

        public ComparableCircle() {
        }

        public ComparableCircle(double radius) {
            super((int) radius);
        }

        public ComparableCircle(double radius, String color, boolean filled) {
            super(radius, color, filled);
        }

        @Override
        public int compareTo(ComparableCircle o) {
            if (getRadius() > o.getRadius()) return 1;
            else if (getRadius() < o.getRadius()) return -1;
            else return 1;
        }
    }
