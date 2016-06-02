import java.lang.*;

public class Printer {
    private int[] _saveData = new int[3];
    public void display (int data) {
        try {
            if (_saveData.length == ObserverData.count) {
                throw (new error());
            }
            _saveData[ObserverData.count] = data;
            ObserverData.count++;
            System.out.println(data);


        }
        catch (error err){
            err.Message();
        }

    }
}
