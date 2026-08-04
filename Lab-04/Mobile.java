package Lab04;

    public class Mobile {
        String brand;
        String model;
        double price;

        Mobile() {
            this("Unknown", "Unknown", 0);
        }

        Mobile(String brand, String model) {
            this(brand, model, 0);
        }

        Mobile(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        void display() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: " + price);
        }

        public static void main(String[] args) {
            Mobile mobile1 = new Mobile();
            Mobile mobile2 = new Mobile("Samsung", "A52");
            Mobile mobile3 = new Mobile("Apple", "iPhone 15", 350000);

            mobile1.display();
            mobile2.display();
            mobile3.display();
        }
    }

