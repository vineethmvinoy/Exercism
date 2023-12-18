public class ElonsToyCar {
    int distanceDriven;
    int batteryStatus;
    ElonsToyCar(){
        distanceDriven=0;
        batteryStatus=100;
    }

    public static ElonsToyCar buy() {
        ElonsToyCar obj=new ElonsToyCar();
        return obj;
    }

    public String distanceDisplay() {
        return "Driven "+ distanceDriven+ " meters";
    }

    public String batteryDisplay() {
        if(batteryStatus!=0)
        return "Battery at "+ batteryStatus +"%";
        return "Battery empty";
    }

    public void drive() {
        if(batteryStatus==0)
        batteryDisplay();
        else
        {
            distanceDriven+=20;
            batteryStatus-=1;
        }
    }
}
