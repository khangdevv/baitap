package quanlimang;

public class MyInteger {
    private int Max = 0;
    private int quantity = 0;
    private int array[] = new int[Max];

    public MyInteger() {
    }

    public MyInteger(int quantity, int array[]) {
        this.quantity = quantity;
        this.array[Max] = array[Max];
    }

    public int getMax(int Max) {
        return Max;
    }
    
    public int setMax(int Max) {
        if (Max > 0) {
            return this.Max = Max;
        }
        else {
            return 0;
        }
    }

    public int getQuantity(int quantity) {
        return quantity;
    }

    public int setQuantity(int quantity) {
        if (quantity > 0 && quantity <= Max) {
            return this.quantity = quantity;
        }
        else {
            return 0;
        }
    }

    
    public void setArray(int Max) {
        this.array = new int[Max];
        this.Max = Max;
    }

    public void initialization() {
        quantity = 0;
    }

    public void addValue(int local) {
        if (empty() == 0) {
            array[0] = local;
            quantity++;
        }
        else {
            array[quantity] = local;
            quantity++;
        }
    }

    public void showInformation() {
        for (int i = 0; i < quantity; i++) {
            System.out.println("Phan tu thu " + i + " : " + array[i]);
        }
    }

    public byte full() {
        if (this.quantity == Max) {
            return 0;
        }
        return 1;
    }

    public byte empty() {
        if (this.quantity == 0) {
            return 0;
        }
        return 1;
    }

    public int arraySize() {
        return quantity;
    }

    public void insertValueAtPosition(int value, int local) {
        if (empty() == 0) {
            array[0] = value;
            quantity++;
        }
        else if (local > quantity || local < 0) {
            System.out.println("Khong hop le !");
        }
        else {
            if (arraySize() == Max) {
                System.out.println("Khong hop le !");
            }
            else {
                for (int i = quantity; i >= local; i--) {
                    array[i+1] = array[i];
                }
                array[local] = value;
                quantity++;
            }
        }
    }

    public void deleteValue(int number) {
        if (empty() == 0) {
            System.out.println("Rong nen khong the xoa .");
        }
        else {
            for (int i = 0; i < quantity; i++) {
                if (array[i] == number) {
                    deleteValueAtPosition(i);
                }
            }
        }
    }

    public void deleteValueAtPosition(int position) {
        if (empty() == 0) {
            System.out.println("Rong nen khong the xoa .");
        }
        else if (position > quantity - 1 || position < 0) {
            System.out.println("Khong hop le !");
        }
        else {
            for (int i = position; i < quantity; i++) {
                array[i] = array[i+1];
            }
            quantity--;
        }
    }
}