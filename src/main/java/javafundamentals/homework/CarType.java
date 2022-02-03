package javafundamentals.homework;

public enum CarType {

    DIESEL("diesel"), GASOLINE("petrol"), ELECTRIC("electric");

    String type;

    CarType(String type) {

        this.type = type;
    }

    public static CarType fromString(String type) {
        CarType foundType = null;
        for(CarType t: CarType.values()) {
            if(t.getType().equals(type)) {
                foundType = t;
            }
        }
        if(foundType != null) {
            return foundType;
        } else {
            System.out.println("Invalid car type. valid types are: [diesel, petrol, electric]" );
            return null;
        }
    }

    public String getType() {
        return type;
    }
}
