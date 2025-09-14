package br.inatel.pcmania.computer;

public class Computer {
    // Attributes
    private String brand;
    private float price;
    private BasicHardware[] basicHardware;
    private OperationalSystem operationalSystem;
    private USBMemory usbMemory;

    // Methods
    public void showPCConfigs() {
        System.out.printf("Marca: %s\n", brand);
        System.out.printf("Preço: %.2f\n", price);
        System.out.printf("Sistema Operacional: %s (%d bits)\n",
                operationalSystem.getName(), operationalSystem.getType());

        if (basicHardware != null) {
            for (BasicHardware h : basicHardware) {
                if (h == null) {
                    break;
                }
                System.out.printf("Hardware: %s (%.0f)\n", h.getName(), h.getCapacity());
            }
        }

        if (usbMemory != null) {
            System.out.printf("Memória USB: %s (%dMB)\n", usbMemory.getName(), usbMemory.getCapacity());
        }
        System.out.println();
    }

    public void addUSBMemory(USBMemory usbMemory) {
        this.usbMemory = usbMemory;
    }

    // Constructor
    public Computer(String brand, float price, BasicHardware[] basicHardware, OperationalSystem operationalSystem) {
        this.brand = brand;
        this.price = price;
        this.basicHardware = basicHardware;
        this.operationalSystem = operationalSystem;
    }

    // Getter
    public String getBrand() {
        return brand;
    }

    public float getPrice() {
        return price;
    }
}
