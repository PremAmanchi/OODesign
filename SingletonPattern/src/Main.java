public class Main {
    public static void main(String[] args) {
        PerformanceStage s1 = new PerformanceStage();
        PerformanceStage s2 = new PerformanceStage();
        PerformanceStage s3 = new PerformanceStage();
        PerformanceStage s4 = new PerformanceStage();

        System.out.println("counter at instance s1 : " + s1.getCounter());
        System.out.println("counter at instance s4 : " + s4.getCounter());
    }
}