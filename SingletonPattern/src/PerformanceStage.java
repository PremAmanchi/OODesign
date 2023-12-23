public class PerformanceStage {
    public static PerformanceStage INSTANCE = null;
    private static int counter;
    public PerformanceStage(){
        counter++;
    }
    public synchronized static PerformanceStage getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new PerformanceStage();
        }
        return INSTANCE;
    }

    public void turnOnLights(){
        System.out.println("turned on the lights....");
    }

    public int getCounter(){
        return counter;
    }
}
