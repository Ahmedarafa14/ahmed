package org.example;

class AboutTheAirport extends User {


        private String city;
        private String name;


        // Constructor
        public AboutTheAirport(String city, String name) {
            this.city = city;
            this.name = name;

        }
    public AboutTheAirport(){

    }
        // Getter and Setter methods
        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }


        public String getName(String name) {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

    @Override
    public String toString() {
        return "AboutTheAirport{" +
                "city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}










