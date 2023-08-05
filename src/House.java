import java.util.Arrays;
import java.util.List;

public class House {
  private   String address;
   private int floorsNumber;
   private  List<String> residentsNames;

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getFloorsNumber() {
        return floorsNumber;
    }
    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }
    public List<String> getResidentsNames() {
        return residentsNames;
    }
    public void setResidentsNames(String residents) {
        this.residentsNames = Arrays.asList(residents.split(","));
    }
    }

